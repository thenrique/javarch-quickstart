package org.bootstrap.project.domain;

import java.util.ArrayList;
import java.util.List;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

public class CarrinhoDeCompras extends AbstractPersistable {

	private static final long serialVersionUID = -8847360779677175328L;
	
	private List<Produto> produtos;

	public List<Produto> getProdutos() {
		if ( produtos == null ){
			produtos = new ArrayList<Produto>();
		}
		return produtos;
	}
	
	public boolean adicionarProduto(Produto produto){
		if ( produto.isDisponivel() ){
			return getProdutos().add( produto );
		}
		return false;				
	}
	
	public boolean removerProduto(Produto produto){
		return getProdutos().remove(produto);				
	}
	
	public boolean possuiProdutos(){
		return !getProdutos().isEmpty();
	}
	
	public int getQuantidadeDeProdutos(){
		return getProdutos().size();
	}
	
}
