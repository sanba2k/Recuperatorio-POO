package ar.com.unpaz.service;

public interface IServicePedido {
	
	void mostrarPedidos();
	
	void buscarPedido(int num);
	
	double importeTotal();
	
	double mayorImporteFinal();
	
	void importeMayorA(double cantidad);
	
	long cantPedidoNac();
	
	long cantPedidoUrg();
	
	long cantPedidoMay();
	
	long cantPedidoInt();
	
	double promedioGeneral();
	
	void pedidoReqEspecial();
	
	
	
	
	
	

}
