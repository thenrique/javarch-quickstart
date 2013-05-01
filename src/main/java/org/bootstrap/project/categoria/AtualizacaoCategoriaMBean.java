package org.bootstrap.project.categoria;

import org.bootstrap.project.domain.Categoria;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.mbeans.AbstractUpdateManagedBean;

@Component
@Scope("view")
public class AtualizacaoCategoriaMBean extends AbstractUpdateManagedBean<Categoria> {
 
	private static final long serialVersionUID = -5491699358356219661L;

	
}
