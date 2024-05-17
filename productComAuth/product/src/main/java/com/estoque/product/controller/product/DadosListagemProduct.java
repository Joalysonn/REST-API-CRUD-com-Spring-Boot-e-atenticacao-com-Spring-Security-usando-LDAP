package com.estoque.product.controller.product;

public record DadosListagemProduct(long id, String nome, String quantidade, String localEstoque, String preco) {

    public DadosListagemProduct(Product product){
        this(product.getId(), product.getNome(),product.getQuantidade(), product.getLocalEstoque(), product.getPreco());
    }
	
}
