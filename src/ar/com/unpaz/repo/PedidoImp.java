package ar.com.unpaz.repo;

import java.util.HashMap;
import java.util.stream.Stream;

import ar.com.unpaz.model.Pedido;
import ar.com.unpaz.service.IServicePedido;

public class PedidoImp implements IServicePedido{

	LeerArchivo lectura = new LeerArchivo();
	HashMap<Integer, Pedido> mapa = lectura.Lectura();
	
	@Override
	public void mostrarPedidos() {
		for(Pedido c: mapa.values()) {
			System.out.println(c);
		}
		
	}

	@Override
	public void buscarPedido(int num) {
		Pedido p = mapa.get(num);
		
		if(p != null) {
			System.out.println(p);
		} else {
			System.out.println("Pedido No Encontrado");
		}
		
	}

	@Override
	public double importeTotal() {
		double total = mapa.values().stream().mapToDouble(a -> a.ImporteTotal()).sum();
				
		
		return total;
	}


	@Override
	public double mayorImporteFinal() {
		double mayor = mapa.values().stream().mapToDouble(a -> a.ImporteTotal()).max().orElse(0.0);
		
		return mayor;
	}

	@Override
	public void importeMayorA(double cantidad) {
		double cant = cantidad;
		Stream<Pedido> teclado = mapa.values().stream().filter(a -> a.ImporteTotal() > cant);
		
		teclado.forEach(a -> System.out.println(a));
	}

	@Override
	public long cantPedidoNac() {
		long cantidad = mapa.values().stream().filter(a -> a.getTipoPedido().equals("N")).count();
		
		return cantidad;
	}

	@Override
	public long cantPedidoUrg() {
		long cantidad = mapa.values().stream().filter(a -> a.getTipoPedido().equals("U")).count();
		
		return cantidad;
	}

	@Override
	public long cantPedidoMay() {
		long cantidad = mapa.values().stream().filter(a -> a.getTipoPedido().equals("M")).count();
		
		return cantidad;
	}

	@Override
	public long cantPedidoInt() {
		long cantidad = mapa.values().stream().filter(a -> a.getTipoPedido().equals("I")).count();
		
		return cantidad;
	}

	@Override
	public double promedioGeneral() {
		double promedio = mapa.values().stream().mapToDouble(a -> a.ImporteTotal()).average().orElse(0.0);
		
		return promedio;
	}

	@Override
	public void pedidoReqEspecial() {
		
		
	}

}
