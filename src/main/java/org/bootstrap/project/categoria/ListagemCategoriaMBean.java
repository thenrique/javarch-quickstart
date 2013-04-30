package org.bootstrap.project.categoria;

import java.util.List;

import javax.faces.model.SelectItem;

import org.bootstrap.project.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.SelectItemsUtils;
import com.github.javarch.jsf.mbeans.AbstractListManagedBean;
import com.github.javarch.persistence.Repository;

@Component
@Scope("request")
public class ListagemCategoriaMBean extends AbstractListManagedBean<Categoria>{
 
	private static final long serialVersionUID = 7989353742600900721L;

	@Autowired
	private Repository repository;

	@Autowired
	private SelectItemsUtils selectItemsUtils;
	 
 	public List<SelectItem> getCategoriasAsSelectItem(){
		return selectItemsUtils.createSelectItems( getCategoriasAsList() , "id", "titulo", "Selecione uma categoria...");		
	}
	
	public List<Categoria> getCategoriasAsList(){
		return repository.findAll( Categoria.class );
	}
}
