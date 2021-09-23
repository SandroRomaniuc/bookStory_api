package com.book.store.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Livro {
	private Integer id;
	private String titulo;
	private String descricao;

	private Category category;

	public Livro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Livro(Integer id, String titulo, String descricao, Category category) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.category = category;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(id, other.id);
	}

}
