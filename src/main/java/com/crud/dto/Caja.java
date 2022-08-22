package com.crud.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cajas")
public class Caja {
	
	@Id
	private String num_referencia;
	@Column(name = "contenido")
	private String contenido;
	@Column(name = "valor")
	private int valor;
	
	@ManyToOne
	@JoinColumn(name="almacen")
	private Almacen almacen;
	
	// Constructores
	public Caja() {

	}

	public Caja(String num_referencia, String contenido, int valor, Almacen almacen) {
		this.num_referencia = num_referencia;
		this.contenido = contenido;
		this.valor = valor;
		this.almacen = almacen;
	}

	// Getters & setters


	public String getNum_referencia() {
		return num_referencia;
	}

	public void setNum_referencia(String num_referencia) {
		this.num_referencia = num_referencia;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	@Override
	public String toString() {
		return "Caja [num_referencia=" + num_referencia + ", contenido=" + contenido + ", valor=" + valor + ", almacen=" + almacen + "]";
	}
}
