package org.bootstrap.project.produto;

import org.bootstrap.project.domain.Produto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.mbeans.AbstractCreateManagedBean;

@Component
@Scope("view")
public class CadastroProdutoMBean extends AbstractCreateManagedBean<Produto>{
 
	private static final long serialVersionUID = -4998907061022501572L;


	public CadastroProdutoMBean(){
		outcomeSuccess = "/adm/produto/list.jsf?faces-redirect=true";
	}
	
}
