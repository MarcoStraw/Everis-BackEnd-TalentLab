package com.medicamentos.productos;

import java.util.ArrayList;

public class Registroproducto implements Accion  {
	private ArrayList<Producto> productosFarmacia = new ArrayList<Producto>();
	
	// Constructores
	public Registroproducto() {};

	public Registroproducto(ArrayList<Producto> productosFarmacia) {
		super();
		this.productosFarmacia = productosFarmacia;
	}

	@Override
	public String toString() {
		return "Registroproducto [productosFarmacia=" + productosFarmacia + "]";
	}

	
	// Metodo buscaProducto: metodo revisa si existe el producto mediante el codigo del producto ingresado
	// Y los ya existentes
	
	private boolean buscaProducto(Producto producto) {
		for(int i=0; i<this.productosFarmacia.size();i++) {
	        if(this.productosFarmacia.get(i).getCodigo() == producto.getCodigo()) {
	           return true;
	        }
	    }
	    return false;
	}
	
	// Metodo agregarProducto(): Agregar solo si no existe el código

	public void agregarProducto(Producto producto) {
		if(!buscaProducto(producto)){
			this.productosFarmacia.add(producto);
		}
	}
	
	// Metodo listarProductos(): listar productos con preciobase superior a $10.000
	
	
	public void listarProductos() {
		for(int i=0; i<this.productosFarmacia.size();i++) {
			if(this.productosFarmacia.get(i).getPrecioBase()>10000) {
				if(this.productosFarmacia.get(i).getTipo() == 'M') {
					System.out.println("---------------------------------------");
					System.out.println(this.productosFarmacia.get(i).getCodigo());
					System.out.println(this.productosFarmacia.get(i).getNombre());
					System.out.println(this.productosFarmacia.get(i).getPrecioBase());
				}
				else if(this.productosFarmacia.get(i).getTipo() == 'S') {
					System.out.println("---------------------------------------");
					System.out.println(this.productosFarmacia.get(i).getCodigo());
					System.out.println(this.productosFarmacia.get(i).getNombre());
					System.out.println(this.productosFarmacia.get(i).getPrecioBase());
				}
			}
		}
	}
	
	// Metodo eliminarProducto(): elimina productos con precio base menor a 2000
	public void eliminarProducto() {
		for(int i=0; i<this.productosFarmacia.size();i++) {
			if(this.productosFarmacia.get(i).getPrecioBase()<2000) {
				System.out.println("---------------------------------------");
				System.out.println("Se ha removido: " + this.productosFarmacia.get(i).getNombre());
				this.productosFarmacia.remove(i);
			}
		}
	}
	
	// Metodo descontar
	@Override
	public void descontar(String dia) {
		if(dia.equals("Lunes") || dia.equals("lunes")) {
			for(int i=0; i<this.productosFarmacia.size();i++) {
				if(this.productosFarmacia.get(i).getTipo() == 'M') {
					if(this.productosFarmacia.get(i).isGenerico()){
						this.productosFarmacia.get(i).setPrecioBase((int) (this.productosFarmacia.get(i).getPrecioBase()*0.9));
					}
				}
				else if(this.productosFarmacia.get(i).getTipo() == 'S') {
						this.productosFarmacia.get(i).setPrecioBase((int) (this.productosFarmacia.get(i).getPrecioBase()*0.9));
				}	
			}
		}
	}

	// Metodo mostrar 
	@Override
	public void mostrar() {
		for(int i=0; i<this.productosFarmacia.size();i++) {
			if(this.productosFarmacia.get(i).getTipo() == 'M') {
				System.out.println(this.productosFarmacia.get(i).ImprimirMedicamento());
			}
			else if(this.productosFarmacia.get(i).getTipo() == 'S') {
				System.out.println(this.productosFarmacia.get(i).ImprimirSuplemento());
			}
		}
		
	}
	// Metodo recargo
	@Override
	public void recargo() {
		// TODO Auto-generated method stub
		
	}
	
	// Metodo totalizar 
	@Override
	public void totalizar() {
		
	}
	
	
	
	// Getter y setter
	public ArrayList<Producto> getProductosFarmacia() {
		return productosFarmacia;
	}

	public void setProductosFarmacia(ArrayList<Producto> productosFarmacia) {
		this.productosFarmacia = productosFarmacia;
	}

	
}
