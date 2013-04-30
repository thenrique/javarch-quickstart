package org.bootstrap.project.categoria;

import org.bootstrap.project.domain.Categoria;
import org.springframework.validation.Errors;

import com.github.javarch.support.validation.BeanValidation;

public class RemocaoCategoriaValidator extends BeanValidation {

	@Override
	protected void addExtraValidation(Object target, Errors errors) {

		Categoria categoria = (Categoria)target; 
		
		if (  !categoria.getProdutos().isEmpty() ){
			errors.reject("errors.produto.associado", "Não é permitido remover a categoria");
		}
	}

}
