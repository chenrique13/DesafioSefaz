package com.carlospereira.desafiosefaz.domain;

public class Telefone {

	private Integer ddd;
	private String numero;
	private String tipo;
	public Telefone() {
		super();
	}
	public Telefone(Integer ddd, String numero, String tipo) {
		super();
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
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
	@Override
	public String toString() {
		return "Telefone [ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
	}
	
	
}
