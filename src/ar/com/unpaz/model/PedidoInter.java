package ar.com.unpaz.model;

public class PedidoInter extends Pedido{

	private String pais;
	private double peso;
	private String producto;
	
	public PedidoInter(String tipoPedido, int idPedido, String cliente, double cantidad, double precioUnitario,String pais, double peso, String producto) {
		super(tipoPedido,idPedido,cliente,cantidad,precioUnitario);
		this.pais = pais;
		this.peso = peso;
		this.producto = producto;
		
	}
	@Override
	public double ImporteBase() {
		double total = getCantidad() * getPrecioUnitario();
		
		return total;
	}

	@Override
	public double ImporteTotal() {
		double peso = (getPeso() * 20);
		double previo = ImporteBase() + peso ;
		double total = 0;
		
		if(pais.equals("Chile")) {
			total = previo * 1.3;
			System.out.println("El costo de envios a chile es del 30% del total");
		} if(pais.equals("Uruguay")) {
			total = previo * 1.15;
			System.out.println("El costo de envios a Uruguay es el 15% del total");
		} else {
			total = previo * 1.4;
			System.out.println("El costo de envios a Brasil es del 40% del total");
		}
		
		return total;
	}

	
	
	
	

	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}


	
}
