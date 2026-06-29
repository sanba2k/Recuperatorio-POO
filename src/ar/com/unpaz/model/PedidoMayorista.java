package ar.com.unpaz.model;

public class PedidoMayorista extends Pedido{

	private double peso;
	private double algo;
	private String producto;
	
	public PedidoMayorista(String tipoPedido, int idPedido, String cliente, double cantidad, double precioUnitario, double peso, double algo, String producto) {
		super(tipoPedido,idPedido,cliente,cantidad,precioUnitario);
		
		this.peso = peso;
		this.algo = algo;
		this.producto = producto;
	}
	
	
	@Override
	public double ImporteBase() {
		double total = getCantidad() * getPrecioUnitario();
		
		return total;
	}

	@Override
	public double ImporteTotal() {
		double peso = getCantidad() * getPeso(); 
		double previo = ImporteBase() + peso ;
		double total = 0;
		
		if (getCantidad() > 10) {
			total = previo * 0.95;
			System.out.println("Descuento del 5% por su compra voluminosa");
		} if(getCantidad() > 15) {
			total = previo * 0.90;
			System.out.println("Descuento del 10% por su compra voluminosa");
		} else {
			total = previo;
		}
		
		return total;
	}
	
	

	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAlgo() {
		return algo;
	}



	public void setAlgo(double algo) {
		this.algo = algo;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



}
