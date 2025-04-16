package com.primeiroExemplo.services;

import com.primeiroExemplo.model.Produto;
import com.primeiroExemplo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    // instanciar
    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Metodo para retornar uma lista de produtos
     * @return Lista de produtos
     */
    public List<Produto> obterTodos(){
        return produtoRepository.obterTodos();
    }

    /**
     * Metodo que retornar o produto encontrado pelo seu Id.
     * @param id do produto que sera localizado
     * @return Retorna um produto caso seja encontrado.
     */
    public Optional<Produto> obterPorId(Integer id){
        return produtoRepository.obterPorId(id);
    }

    /**
     * Metodo para adicionar produto na lista
     * @param produto que sera asdicionado
     * @return Retorna o produto que foi adicionado à lista
     */
    public Produto adicionar(Produto produto){
        // Poderia ter alguma regra de negócio para validar o produto
        return produtoRepository.adicionar(produto);
    }

    /**
     * Metodo para deletar o produto por id
     * @param id do poduto a ser deletado
     */
    // void, pois não retorna nada
    public void deletar(Integer id){
        produtoRepository.deletar(id);
    }

    /**
     * Metodo para atualizar o produto na lista
     * @param produto que será atualizado
     * @param id id do produto que sera atualizado
     * @return Retorna o produto que sera atualizado na lista
     */
    public Produto atualizar(Integer id, Produto produto){
        // poderia ter alguma validação no id
        produto.setId(id);
        return produtoRepository.atualizar(produto);
    }

}
