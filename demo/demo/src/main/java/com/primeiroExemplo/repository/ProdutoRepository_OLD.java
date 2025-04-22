package com.primeiroExemplo.repository;

import com.primeiroExemplo.model.exception.ResourceNotFoundException;
import org.springframework.stereotype.Repository;
// importar o model de Produto
import com.primeiroExemplo.model.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository_OLD {

    // vamos sempre retornar uma lista de produtos, já que não estamos usando banco de dados, ainda.
    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;

    /**
     * Metodo para retornar uma lista de produtos
     * @return Lista de Produtos
     */
    public List<Produto> obterTodos(){
        return produtos;
    }

    /**
     * Metodo que retorna o produto encontrado pelo seu ID
     * @param id do produto que sera localizado
     * @return Retorna um produto caso tenha encontrado
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtos
                .stream()
                .filter(produto -> produto.getId() == id)
                .findFirst();
    }

    /**
     * Metodo para adicionar produto na lista
     * @param produto que sera asdicionado
     * @return Retorna o produto que foi adicionado à lista
     */
    public Produto adicionar(Produto produto){
        // incremento o ID
        ultimoId++;
        // passo o ID para o produto
        produto.setId(ultimoId);
        // adiciono o produto à lista
        produtos.add(produto);
        // retorno ele
        return produto;
    }

    /**
     * Metodo para deletar o produto por id
     * @param id do poduto a ser deletado
     */
    // void, pois não retorna nada
    public void deletar(Integer id){
        produtos.removeIf(produto -> produto.getId() == id);
    }

    /**
     * Metodo para atualizar o produto na lista
     * @param produto que será atualizado
     * @return Retorna o produto que sera atualizado na lista
     */
    public Produto atualizar(Produto produto){
        // Encontrar o produto na lista
        Optional<Produto> produtoEncontrado = obterPorId(produto.getId());

        if (produtoEncontrado.isEmpty()){
            throw new ResourceNotFoundException("Produto não encontrado! Não poderá ser atualizado!");
        }

        // Eu tenho que remover o produto antigo da lista
        deletar(produto.getId());

        // Depois, adicionar o novo produto atualizado na lista
        produtos.add(produto);

        return produto;
    }

}
