package org.bootstrap.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.envers.Audited;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.github.javarch.persistence.orm.hibernate.AbstractPersistable;


@Entity
@Audited
public class Produto extends AbstractPersistable {

	private static final long serialVersionUID = -8969205729533487837L;

	@NotEmpty
	@Length(max=255)
	private String titulo;
	
	@NotEmpty
	@Column(length=1000)
	@Length(max=1000)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="id_categoria")	
	private Categoria categoria = new Categoria();
	
	@Min(0)
	private double valor;

	
	private boolean disponivel;


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public boolean isDisponivel() {
		return disponivel;
	}


	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
	
	
}
