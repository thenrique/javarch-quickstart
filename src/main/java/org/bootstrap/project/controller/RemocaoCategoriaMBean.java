package org.bootstrap.project.controller;

import org.bootstrap.project.domain.Categoria;
import org.bootstrap.project.validator.RemocaoCategoriaValidator;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.github.javarch.jsf.AbstractDeleteManagedBean;
import com.github.javarch.support.validation.BeanValidation;


@Component
@Scope("request")
public class RemocaoCategoriaMBean extends AbstractDeleteManagedBean<Categoria>{

	@Override
	protected BeanValidation useBeanValidation() {			
		return new RemocaoCategoriaValidator();
	}
	
}
