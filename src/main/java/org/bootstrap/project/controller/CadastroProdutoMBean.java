package org.bootstrap.project.controller;

import java.util.List;

import javax.faces.model.SelectItem;
import javax.inject.Inject;

import org.bootstrap.project.domain.Categoria;
import org.bootstrap.project.domain.Produto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.SelectItemsUtils;
import com.github.javarch.jsf.mbeans.AbstractCreateManagedBean;
import com.github.javarch.persistence.Repository;

@Component
@Scope("view")
public class CadastroProdutoMBean extends AbstractCreateManagedBean<Produto> {
	
	@Inject
	private SelectItemsUtils selectItemUtils;
	
	@Inject
	private Repository categoriaRepository;
	
	public CadastroProdutoMBean(){
		outcomeSuccess = "/adm/produto/list.jsf?faces-redirect=true";
	}
		
	public List<SelectItem> getCategoriasAsSelectItem(){		
		return selectItemUtils.createSelectItems( categoriaRepository.findAll( Categoria.class ), "id", "titulo", "Selecione uma categoria...");		
	}
}
