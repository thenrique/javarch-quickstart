package org.bootstrap.project.controller;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.bootstrap.project.domain.Categoria;
import org.bootstrap.project.domain.Produto;
import org.bootstrap.project.domain.Vitrine;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.mbeans.AbstractManagedBean;

@Component
@Scope("session")
public class VitrineMBean extends AbstractManagedBean<Vitrine>{

	private static final long serialVersionUID = 985262398995932752L;

	private Categoria categoriaSelecionada;
	
	private Produto produtoSelecionado;

	public Categoria getCategoriaSelecionada() {
		return categoriaSelecionada;
	}
	
	public void setCategoriaSelecionada(Categoria categoriaSelecionada) {		
		this.categoriaSelecionada = categoriaSelecionada;
	}
		
	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}

	public DataModel<Produto> getProdutosDaCategoriaSelecionada(){
	
		DataModel<Produto> dataModel = 
				new ListDataModel<Produto>( categoriaSelecionada.getProdutos() );
		
		return dataModel;
	}
	
	// TODO remover isso
	public void mudaCategoriaSelecionada(){
		System.out.println("chamou no click, categoria selecionada: " + categoriaSelecionada);
	}
	
	
	
}
