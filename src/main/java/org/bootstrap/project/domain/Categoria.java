package org.bootstrap.project.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.envers.Audited;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;

@Entity
@Audited
public class Categoria extends AbstractPersistable{
 
	private static final long serialVersionUID = 4513891696568524628L;

	@NotEmpty
	@Length(max=255)
	private String titulo;	
	
	@OneToMany(mappedBy = "categoria")
	private List<Produto> produtos = new ArrayList<Produto>(0);

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
