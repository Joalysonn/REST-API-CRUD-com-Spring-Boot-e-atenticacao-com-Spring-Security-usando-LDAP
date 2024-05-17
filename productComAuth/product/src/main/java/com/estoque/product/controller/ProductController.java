package com.estoque.product.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import com.estoque.product.controller.product.DadosAtualizacaoProduct;
import com.estoque.product.controller.product.DadosCadrastroProduct;
import com.estoque.product.controller.product.DadosListagemProduct;
import com.estoque.product.controller.product.Product;
import com.estoque.product.controller.product.ProductRepository;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductRepository repository;
    @PostMapping
    @Transactional
    public void cadastrar (@RequestBody @Valid DadosCadrastroProduct dados){
        repository.save(new Product(dados));
        System.out.println("Os produtos do estoque são: "+dados);
    }

    @GetMapping
    public Page<DadosListagemProduct> listar (@PageableDefault (size =10, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemProduct::new);
    }

    @PutMapping
    @Transactional
    public void atualizar (@RequestBody @Valid DadosAtualizacaoProduct dados){
        var product = repository.getReferenceById(dados.id());
        product.atualizarInformacoes(dados);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir (@PathVariable long id){
        var product = repository.getReferenceById(id);
        product.excluir();
    }
	
	
}
