package com.estoque.product.controller.product;


import jakarta.validation.constraints.NotBlank;

public record DadosCadrastroProduct(
	    @NotBlank
	    String nome,
	    @NotBlank
	    String quantidade,
	    @NotBlank
	    String localEstoque,
	    @NotBlank
	    String preco) {}

 


