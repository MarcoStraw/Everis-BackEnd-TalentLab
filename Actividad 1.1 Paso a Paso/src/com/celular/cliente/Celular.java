package com.celular.cliente;

public class Celular {
	//Atributos Clase Celular: numero y marca.
	private String marca;
	private String numero;//+56 9 555
	
	//Constructores
	public Celular() {};
	
	public Celular(String marca, String numero) {
		super();
		this.marca = marca;
		this.numero = numero;
	}

	//get and set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
	
	
	

}
