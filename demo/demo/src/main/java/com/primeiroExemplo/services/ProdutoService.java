package com.primeiroExemplo.services;

import com.primeiroExemplo.model.Produto;
import com.primeiroExemplo.model.exception.ResourceNotFoundException;
import com.primeiroExemplo.repository.ProdutoRepository;
import com.primeiroExemplo.shared.ProdutoDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProdutoService {

    // Autowiring the ProdutoRepository
    @Autowired
    private ProdutoRepository produtoRepository;

    /**
     * Method to return a list of all products
     * @return List of products
     */
    public List<ProdutoDTO> obterTodos() {
        // retornar uma lista de produto model
        // aqui, o back end me retorna uma lista de produtos
        List<Produto> produtos = produtoRepository.findAll();

        // transforma o produto em um ProdutoDTO e retorna uma lista
        return produtos
                .stream()
                .map(produto -> new ModelMapper().map(produto, ProdutoDTO.class))
                .collect(Collectors.toList()); // Collectors.toList() - devolve um list de ProdutoDTO
    }

    /**
     * Method to return the product found by its ID.
     * @param id of the product to be located
     * @return Returns the product if found.
     */
    public Optional<ProdutoDTO> obterPorId(Integer id) {
        // obtendo produto pelo id
        Optional<Produto> produto = produtoRepository.findById(id);  // Using JpaRepository's findById() method

        // se não encontrar, lançar uma excessão
        if(produto.isEmpty()){
            throw new ResourceNotFoundException("Produto com id: " + id + " não encontrado!");
        }

        // convertendo o meu optional de produto em um ProdutoDRO
        ProdutoDTO dto = new ModelMapper().map(produto.get(), ProdutoDTO.class);

        // criando e retornando um optional de dto
        return Optional.of(dto);
    }

    /**
     * Method to add a product
     * @param produto to be added
     * @return Returns the product that was added to the database
     */
    public ProdutoDTO adicionar(ProdutoDTO produtoDTO) {
        // remover o id para conseguir fazer o cadastro
        produtoDTO.setId(null);

        // criar um objeto de mapeamento
        ModelMapper mapper = new ModelMapper();

        // converter o nosso ProdutoDTO em um Produto
        Produto produto = mapper.map(produtoDTO, Produto.class);

        // salvar o Produto no banco
        produto = produtoRepository.save(produto);
        produtoDTO.setId(produto.getId());

        // retornar o ProdutoDTO atualizado
        return produtoDTO;
    }

    /**
     * Method to delete a product by its id
     * @param id of the product to be deleted
     */
    public void deletar(Integer id) {
        // verificar se o produto existe
        Optional<Produto> produto = produtoRepository.findById(id);

        // se não existir, lança uma exception
        if(produto.isEmpty()){
            throw new ResourceNotFoundException("Produto de id: " + id + " não foi encontrado!");
        }

        // deleta o produto pelo ID
        produtoRepository.deleteById(id);  // Using JpaRepository's deleteById() method
    }

    /**
     * Method to update a product in the database
     * @param id id of the product to be updated
     * @param produto the updated product data
     * @return Returns the product that was updated in the database
     */
    public ProdutoDTO atualizar(Integer id, ProdutoDTO produtoDTO) {
        // passar o id para o produtoDTO
        // aqui, passamos o ID porque:
        // se ele tiver ID, atualiza
        // se não tiver ID, ele salva
        produtoDTO.setId(id);

        // criar um objeto de mapeamento
        ModelMapper mapper = new ModelMapper();

        // preciso converter o DTO em um Produto
        Produto produto = mapper.map(produtoDTO, Produto.class);

        // atualizar o produto no banco
        produtoRepository.save(produto);

        // retornar o produtoDTO atualizado
        return produtoDTO;
    }
}
