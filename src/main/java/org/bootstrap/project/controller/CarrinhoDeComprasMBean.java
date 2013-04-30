package org.bootstrap.project.controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;

import org.bootstrap.project.domain.CarrinhoDeCompras;
import org.bootstrap.project.domain.Produto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.context.MessageContext;
import com.github.javarch.jsf.mbeans.AbstractManagedBean;
 
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
	
	@Inject
	private MessageContext messageContext;
	
	private CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
	
	public void adicionarProdutoNoCarrinho(){		
		if ( carrinho.adicionarProduto(produto) ){				
			messageContext.addInfo("Produto " + produto + " adicionado no seu carrinho!");
		}else{
			messageContext.addInfo("O produto " + produto.getTitulo() +  " não está disponível no estoque!");
		}		
	}
	
	public void removerProdutoNoCarrinho(){		
		carrinho.removerProduto(produto);		
		messageContext.addInfo("Produto " + produto + " removido no seu carrinho!");		
	}
	
	public void concluirCompra(){
		if ( carrinho.possuiProdutos() ){
			messageContext.addInfo( "Produtos comprados com sucesso!");			
		}else{
			messageContext.addError("Você no possui produtos no carrinho de compras!");
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
