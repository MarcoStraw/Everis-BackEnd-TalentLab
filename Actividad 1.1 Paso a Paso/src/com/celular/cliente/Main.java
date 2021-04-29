package com.celular.cliente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Construir una compañía con tres clientes.
		
		Compania compania1 = new Compania(3);
		
		// crear Clientes
		Celular celu1= new Celular("alcatel","123456789");
		Cliente cliente1 = new Cliente("1-9","nombre1",60,'M',true,celu1);
		
		Celular celu2= new Celular("nokia","987654321");
		Cliente cliente2 = new Cliente("1-7","nombre1",60,'F',true,celu2);
		
		Celular celu3= new Celular("alcatel","147258963");
		Cliente cliente3 = new Cliente("1-8","nombre1",60,'F',true,celu3);
		
		//agregar clientes a compañia
		
		compania1.agregarCliente(cliente1);
		compania1.agregarCliente(cliente2);
		compania1.agregarCliente(cliente3);
		  
		//• Actualizar un número de celular,según rut 
		
		compania1.modfificarCelular(cliente2.getRut(),"98755869");
		
		//• Buscar a un cliente por rut
				if(compania1.buscarCliente("1-8")){
					System.out.println("Cliente existe en nuestros registros");
				}//cliente3.getRut());
				//• Imprimir el listado de clientes de la compañía
				compania1.listarClientes();
			}
		

}
