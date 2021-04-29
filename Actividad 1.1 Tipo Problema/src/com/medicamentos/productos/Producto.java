package com.medicamentos.productos;

public class Producto{
	// Variables generales
	private int codigo;
	private char tipo;
	private String nombre;
	private int precioBase;
	private boolean generico;
	private boolean formulado;
	private String contraindicaciones;
	private int cantidadVitaminas;
	private String informacionVitaminas;
	
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor Medicamento
	public Producto(int codigo, char tipo, String nombre, int precioBase, boolean generico, boolean formulado,
			String contraindicaciones) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.generico = generico;
		this.formulado = formulado;
		this.contraindicaciones = contraindicaciones;
	}
	
	// Constructor Suplemento
	public Producto(int codigo, char tipo, String nombre, int precioBase, int cantidadVitaminas,
			String informacionVitaminas) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.cantidadVitaminas = cantidadVitaminas;
		this.informacionVitaminas = informacionVitaminas;
	}

	
	
	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", tipo=" + tipo + ", nombre=" + nombre + ", precioBase=" + precioBase
				+ ", generico=" + generico + ", formulado=" + formulado + ", contraindicaciones=" + contraindicaciones
				+ ", cantidadVitaminas=" + cantidadVitaminas + ", informacionVitaminas=" + informacionVitaminas + "]";
	}
	
	public String ImprimirMedicamento() {
		return "Producto [codigo=" + codigo + ", tipo=" + tipo + ", nombre=" + nombre + ", precioBase=" + precioBase
				+ ", generico=" + generico + ", formulado=" + formulado + ", contraindicaciones=" + contraindicaciones+"]";
	}
	
	public String ImprimirSuplemento() {
		return "Producto [codigo=" + codigo + ", tipo=" + tipo + ", nombre=" + nombre + ", precioBase=" + precioBase
				+", cantidadVitaminas=" + cantidadVitaminas + ", informacionVitaminas=" + informacionVitaminas + "]";
	}

	
	// Metodos getter y setter
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public boolean isGenerico() {
		return generico;
	}

	public void setGenerico(boolean generico) {
		this.generico = generico;
	}

	public boolean isFormulado() {
		return formulado;
	}

	public void setFormulado(boolean formulado) {
		this.formulado = formulado;
	}

	public String getContraindicaciones() {
		return contraindicaciones;
	}

	public void setContraindicaciones(String contraindicaciones) {
		this.contraindicaciones = contraindicaciones;
	}

	public int getCantidadVitaminas() {
		return cantidadVitaminas;
	}

	public void setCantidadVitaminas(int cantidadVitaminas) {
		this.cantidadVitaminas = cantidadVitaminas;
	}

	public String getInformacionVitaminas() {
		return informacionVitaminas;
	}

	public void setInformacionVitaminas(String informacionVitaminas) {
		this.informacionVitaminas = informacionVitaminas;
	}
			
	
	
}
