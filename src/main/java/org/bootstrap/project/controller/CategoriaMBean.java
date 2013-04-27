package org.bootstrap.project.controller;

import java.util.List;

import javax.faces.model.SelectItem;

import org.bootstrap.project.domain.Categoria;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCrudManagedBean;
import com.github.javarch.jsf.SelectItemsUtils;

@Component
@Scope( value="view" )
@SuppressWarnings("serial")
public class CategoriaMBean extends AbstractCrudManagedBean<Categoria> {
	
	private SelectItemsUtils selectItemsUtils = new SelectItemsUtils();
	 
	public CategoriaMBean(){
		super();
		urlRedirectDepoisDeCadastrar = "/adm/categoria/list?faces-redirect=true";
	}
	
	public List<SelectItem> getCategoriasAsSelectItem(){
		return selectItemsUtils.createSelectItems(getRepository().findAll( Categoria.class ), "id", "titulo", "Selecione uma categoria...");		
	}
	
	public List<Categoria> getCategoriasAsList(){
		return getRepository().findAll( Categoria.class );
	}
}
