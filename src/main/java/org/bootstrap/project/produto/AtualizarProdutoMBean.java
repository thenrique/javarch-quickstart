package org.bootstrap.project.produto;

import org.bootstrap.project.domain.Produto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.mbeans.AbstractUpdateManagedBean;

@Component
@Scope("view")
public class AtualizarProdutoMBean extends AbstractUpdateManagedBean<Produto>{
 
	private static final long serialVersionUID = -6026367377953831742L;

}
