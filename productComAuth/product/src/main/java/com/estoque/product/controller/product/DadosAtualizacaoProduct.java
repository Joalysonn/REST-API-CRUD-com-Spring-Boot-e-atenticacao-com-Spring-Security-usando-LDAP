package com.estoque.product.controller.product;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoProduct(@NotNull long id, String nome, String quantidade, String localEstoque, String preco) {

}
