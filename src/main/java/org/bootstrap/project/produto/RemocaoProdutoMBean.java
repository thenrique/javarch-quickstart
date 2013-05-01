package org.bootstrap.project.produto;

import org.bootstrap.project.domain.Produto;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.mbeans.AbstractDeleteManagedBean;

@Component
@Scope("request")
public class RemocaoProdutoMBean extends AbstractDeleteManagedBean<Produto> {
 
	private static final long serialVersionUID = -5187921435454672262L;

}
