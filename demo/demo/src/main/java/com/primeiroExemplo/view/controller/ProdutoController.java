package com.primeiroExemplo.view.controller;

import com.primeiroExemplo.model.Produto;
import com.primeiroExemplo.services.ProdutoService;
import com.primeiroExemplo.shared.ProdutoDTO;
import com.primeiroExemplo.view.controller.model.ProdutoRequest;
import com.primeiroExemplo.view.controller.model.ProdutoResponse;
import org.apache.coyote.Response;
import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.matcher.StringMatcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoResponse>> obterTodos(){
        List<ProdutoDTO> produtos = produtoService.obterTodos();

        ModelMapper mapper = new ModelMapper();

        List<ProdutoResponse> resposta = produtos.stream()
                .map(produtoDTO -> mapper.map(produtoDTO, ProdutoResponse.class))
                .collect(Collectors.toList());

        return new ResponseEntity<>(resposta, HttpStatus.OK);
    }

    // com o nosso novo modelo, vou receber um ProdutoRequest e devolvo um ProdutoResponse
    @PostMapping
    public ResponseEntity<ProdutoResponse> adicionar(@RequestBody ProdutoRequest produtoReq){
        ModelMapper mapper = new ModelMapper();

        ProdutoDTO produtoDto = mapper.map(produtoReq, ProdutoDTO.class);

        produtoDto = produtoService.adicionar(produtoDto);

        return new ResponseEntity<>(mapper.map(produtoDto, ProdutoResponse.class),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<ProdutoResponse>> obterPorId(@PathVariable Integer id){

        try {
            Optional<ProdutoDTO> dto = produtoService.obterPorId(id);

            ProdutoResponse produto = new ModelMapper().map(dto.get(), ProdutoResponse.class);

            return new ResponseEntity<>(Optional.of(produto), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Integer id){
        produtoService.deletar(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT); // deu tudo certo, mas não tem nada para devolver
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoResponse> atualizar(@RequestBody ProdutoRequest produtoReq, @PathVariable Integer id){
        ModelMapper mapper = new ModelMapper();

        ProdutoDTO produtoDto = mapper.map(produtoReq, ProdutoDTO.class);

        produtoDto = produtoService.atualizar(id, produtoDto);

        return new ResponseEntity<>(
                mapper.map(produtoDto, ProdutoResponse.class),
                HttpStatus.OK);
    }

}
