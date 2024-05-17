package com.estoque.product.controller.product;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

	@Table(name = "products")
	@Entity(name = "Product")
	@Getter
	@NoArgsConstructor
	@AllArgsConstructor
	@EqualsAndHashCode(of = "id")
	public class Product {

	    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;
	    private String quantidade;
	    private String localEstoque;
	    private String preco;

	    
	   //private boolean ativo;
	    
	    public Product(DadosCadrastroProduct dados){
	        this.nome = dados.nome();
	        this.quantidade = dados.quantidade();
	        this.localEstoque = dados.localEstoque();
	        this.preco = dados.preco();
	        
	    }

	    public void atualizarInformacoes(DadosAtualizacaoProduct dados) {
	        if (dados.nome() != null){
	            this.nome = dados.nome();
	        }
	        if (dados.quantidade() != null){
	            this.quantidade = dados.quantidade();
	        }
	        if (dados.localEstoque() != null){
	            this.localEstoque = dados.localEstoque();
	        }
	        if (dados.preco() != null){
	            this.preco = dados.preco();
	        }

	    }

	    public void excluir() {
	        this.nome = null;
	    }
	    
	
}
