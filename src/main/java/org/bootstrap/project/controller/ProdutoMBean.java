package org.bootstrap.project.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("view")
@SuppressWarnings("serial")
public class ProdutoMBean { //  extends AbstractCrudManagedBean<Produto> 
	 
	public ProdutoMBean(){
		super();
		//urlRedirectDepoisDeCadastrar = "/adm/produto/list.jsf?faces-redirect=true";
	}
	
}
