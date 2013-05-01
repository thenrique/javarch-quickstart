package org.bootstrap.project.produto;

import org.bootstrap.project.domain.Produto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.mbeans.AbstractListManagedBean;

@Component
@Scope("view")
public class ListagemProdutoMBean extends AbstractListManagedBean<Produto>{
 
	private static final long serialVersionUID = 6124174386948118188L;

}
