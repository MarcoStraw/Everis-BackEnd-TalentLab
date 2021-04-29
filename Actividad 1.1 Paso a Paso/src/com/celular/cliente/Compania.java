package com.celular.cliente;

import java.util.ArrayList;

public class Compania {

	// Atributos

	private String nombre;
	private Cliente[] ClienteCelular;
	private ArrayList<Cliente> clienteCelulares;
	private int cantidadClientes;
	private int capacidadMaxima;// 10

	// Constructores

	public Compania() {
	}

	public Compania(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Compania(String nombre, Cliente[] clienteCelular, ArrayList<Cliente> clienteCelulares, int cantidadClientes,
			int capacidadMaxima) {
		super();
		this.nombre = nombre;
		ClienteCelular = clienteCelular;
		this.cantidadClientes = cantidadClientes;
		this.capacidadMaxima = capacidadMaxima;
		this.clienteCelulares = clienteCelulares;
	}

	// metodos

	// agregar cliente
	public void agregarCliente(Cliente cliente) {
		clienteCelulares = new ArrayList<Cliente>();


		if (this.cantidadClientes < this.capacidadMaxima) {
			this.clienteCelulares.add(cliente);
		}

	}

	// buscar cliente
	public boolean buscarCliente(String rut) {

		for (int i = 0; i < this.clienteCelulares.size(); i++) {

			Cliente cliente = this.clienteCelulares.get(i);
			if (cliente.getRut().equals(rut)) {
				return true;
			}
		}
		return false;

		/*
		 * for(Cliente cliente : this.clienteCelulares) {
		 * if(cliente.getRut().equals(rut)) { return true; }
		 */
	}

	// modificar celular

	public void modfificarCelular(String rut, String numero) {
		for (Cliente cliente : this.clienteCelulares) {
			if (cliente.getRut().equals(rut)) {
				cliente.getCelu().setNumero(numero);
			}
		}
	}

	// listarClientes

	/*
	 * listarClientes: el cual imprimirá el número de celular, el nombre del cliente
	 * y si posee o no plan.
	 */
	public void listarClientes() {

		for (int i = 0; i < this.clienteCelulares.size(); i++) {
			System.out.println("*******");
			System.out.println("numero: " + this.clienteCelulares.get(i).getCelu().getNumero());
			System.out.println("nombre: " + this.clienteCelulares.get(i).getNombre());
			if (this.clienteCelulares.get(i).isPlan()) {
				System.out.println("Cliente tiene plan");
			} else {
				System.out.println("Cliente NO tiene plan...");
			}

		}
	}

	// get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cliente[] getClienteCelular() {
		return ClienteCelular;
	}

	public void setClienteCelular(Cliente[] clienteCelular) {
		ClienteCelular = clienteCelular;
	}

	public int getCantidadClientes() {
		return cantidadClientes;
	}

	public void setCantidadClientes(int cantidadClientes) {
		this.cantidadClientes = cantidadClientes;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public ArrayList<Cliente> getClienteCelulares() {
		return clienteCelulares;
	}

	public void setClienteCelulares(ArrayList<Cliente> clienteCelulares) {
		this.clienteCelulares = clienteCelulares;
	}

}
