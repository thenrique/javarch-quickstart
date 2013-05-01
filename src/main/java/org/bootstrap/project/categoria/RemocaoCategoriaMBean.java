package org.bootstrap.project.categoria;

import org.bootstrap.project.domain.Categoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.mbeans.AbstractDeleteManagedBean;
import com.github.javarch.support.validation.BeanValidation;


@Component
@Scope("request")
public class RemocaoCategoriaMBean extends AbstractDeleteManagedBean<Categoria>{
 
	private static final long serialVersionUID = 5830984639159402372L;

	@Autowired
	private RemocaoCategoriaValidator validador;
	
	@Override
	protected BeanValidation useBeanValidation() {			
		return validador;
	}	
}
