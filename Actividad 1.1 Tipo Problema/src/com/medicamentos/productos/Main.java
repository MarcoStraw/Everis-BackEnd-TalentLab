package com.medicamentos.productos;


public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Creamos los productos 
		Producto medicamento1 = new Producto(152,'M',"Paracetamol",15990,false,false,"");
		Producto medicamento2 = new Producto(153,'M',"Loratadina",12990,true,false,"");
		Producto suplemento1 = new Producto(154,'S',"Ensure",19990, 2,"Posee vitamina D, calcio, zinc");
		Producto suplemento2 = new Producto(155,'S',"Vitamin Choice",1590, 1,"Vitamina D");
		
		Registroproducto registro = new Registroproducto();
		
		// Agregamos los productos al registro
		registro.agregarProducto(medicamento1);
		
		registro.agregarProducto(medicamento2);
		registro.agregarProducto(suplemento1);
		registro.agregarProducto(suplemento2);
		registro.agregarProducto(medicamento1);
		
		// Listamos los productos con precio base > 10000
		registro.listarProductos();
		
		// Eliminamos producto con precio base < 2000
		registro.eliminarProducto();
		
		// Aplica descuento
		registro.descontar("Lunes");
		
		registro.listarProductos();
		System.out.println("---------------------------------------");
		// Mostrar como string
		registro.mostrar();	
	}
}
