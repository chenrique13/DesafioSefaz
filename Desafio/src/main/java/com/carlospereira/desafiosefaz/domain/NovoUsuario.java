package com.carlospereira.desafiosefaz.domain;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

public class NovoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotEmpty(message = "Preenchimento Obrigatório")
	private String nome;
	@NotEmpty(message = "Preenchimento Obrigatório")
	private String email;
	@NotEmpty(message = "Preenchimento Obrigatório")
	private String senha;

	private Integer ddd;
	private String numero;
	private String tipo;

	public NovoUsuario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Integer getDdd() {
		return ddd;
	}

	public void setDdd(Integer ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
