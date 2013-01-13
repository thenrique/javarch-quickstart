package org.bootstrap.project.controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.bootstrap.project.domain.CarrinhoDeCompras;
import org.bootstrap.project.domain.Produto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractManagedBean;
 
/**
 * UrlBasedViewResolver jsf
 * @author Lucas Oliveira
 *
 */
@Component
@Scope("session")
public class CarrinhoDeComprasMBean extends AbstractManagedBean<CarrinhoDeCompras>{

	private static final long serialVersionUID = 1L;

	private Produto produto;	
	
	private CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	
	public void adicionarProdutoNoCarrinho(){		
		if ( carrinho.adicionarProduto(produto) ){				
			addMessageSuccess("Produto " + produto + " adicionado no seu carrinho!");
		}else{
			addMessageError("O produto " + produto.getTitulo() +  " não está disponível no estoque!");
		}
	}
	
	public void removerProdutoNoCarrinho(){		
		carrinho.removerProduto(produto);		
		addMessageSuccess("Produto " + produto + " removido no seu carrinho!");
		
	}
	
	public void concluirCompra(){
		if ( carrinho.possuiProdutos() ){
			addMessageSuccess( "Produtos comprados com sucesso!");			
		}else{
			addMessageError("Você não possui produtos no carrinho de compras!");
		}
	}

	// Sets e gets
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}	
	
	public CarrinhoDeCompras getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoDeCompras carrinho) {
		this.carrinho = carrinho;
	}

	public DataModel<Produto> getProdutosEmCarrinhoAsDataModel(){
		return new ListDataModel<Produto>( carrinho.getProdutos() );
	}
}
