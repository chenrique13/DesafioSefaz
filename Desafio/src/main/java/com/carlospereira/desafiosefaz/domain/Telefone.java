//package com.carlospereira.desafiosefaz.domain;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Telefone {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Integer id;
//	private Integer ddd;
//	private String numero;
//	private String tipo;
//	public Telefone() {
//		super();
//	}
//	public Telefone(Integer id, Integer ddd, String numero, String tipo) {
//		super();
//		this.id = id;
//		this.ddd = ddd;
//		this.numero = numero;
//		this.tipo = tipo;
//	}
//	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public Integer getDdd() {
//		return ddd;
//	}
//	public void setDdd(Integer ddd) {
//		this.ddd = ddd;
//	}
//	public String getNumero() {
//		return numero;
//	}
//	public void setNumero(String numero) {
//		this.numero = numero;
//	}
//	public String getTipo() {
//		return tipo;
//	}
//	public void setTipo(String tipo) {
//		this.tipo = tipo;
//	}
//	@Override
//	public String toString() {
//		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
//	}
//
//	
//}
