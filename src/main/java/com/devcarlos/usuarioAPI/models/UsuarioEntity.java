package com.devcarlos.usuarioAPI.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// /////////////////////////

@Entity
public class UsuarioEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private int idade;

//	//////////////////////////
	public UsuarioEntity() {

	}

////////////////////////////////////////
	public UsuarioEntity(Long id, String nome, int idade) {
		super();
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}

//////////////////////////////////////////
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

////////////////////////////////////
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioEntity other = (UsuarioEntity) obj;
		return Objects.equals(id, other.id);
	}

}
