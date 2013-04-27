package org.bootstrap.project.controller;

import org.bootstrap.project.domain.Categoria;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractCreateManagedBean;

@Component
@Scope( value="view" )
@SuppressWarnings("serial")
public class CadastroCategoriaMBean extends AbstractCreateManagedBean<Categoria>{
	
	public CadastroCategoriaMBean() {
		outcomeSuccess = "/adm/categoria/list?faces-redirect=true";
	}	
}
