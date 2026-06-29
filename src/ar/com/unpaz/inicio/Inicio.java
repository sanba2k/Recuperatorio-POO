package ar.com.unpaz.inicio;

import ar.com.unpaz.repo.PedidoImp;
import ar.com.unpaz.service.IServicePedido;

public class Inicio {

	public static void main(String[] args) {
		
		IServicePedido servicio = new PedidoImp();
		
		System.out.println("Mostrar Pedidos");
		 servicio.mostrarPedidos();
		System.out.println(" ");
		
		System.out.println("Buscar Pedidos ");
		servicio.buscarPedido(1002);
		servicio.buscarPedido(1009);
		System.out.println(" ");
		
		System.out.println(" ");
		System.out.println(servicio.importeTotal());
		
		//System.out.println(servicio.mayorImporteFinal());
		
		//servicio.importeMayorA(30000);
		
		/*
		System.out.println("Pedidos Nacionales: " + servicio.cantPedidoNac());
		System.out.println("Pedidos Urgentes: " + servicio.cantPedidoUrg());
		System.out.println("Pedidos Mayoristas:" + servicio.cantPedidoMay());
		System.out.println("Pedidos Internacionales:" + servicio.cantPedidoInt()); */
		
		//System.out.println("Promedio de todos los pedidos: " + servicio.promedioGeneral());
		
		// Punto 9 y 10 sin realizar
		
	}

}
