package ar.com.unpaz.model;

public abstract class Pedido {
		
	private String tipoPedido;
	private int idPedido;
	private String cliente;
	private double cantidad;
	private double precioUnitario;
	
	public Pedido(String tipoPedido, int idPedido, String cliente, double cantidad, double precioUnitario) {
		this.tipoPedido = tipoPedido;
		this.idPedido = idPedido;
		this.cliente = cliente;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		
	}
	
	public Pedido() {
		
	}
	
	public abstract double ImporteBase();
	
	public abstract double ImporteTotal();
	
	
	public String getTipoPedido() {
		return tipoPedido;
	}

	public void setTipoPedido(String tipoPedido) {
		this.tipoPedido = tipoPedido;
	}

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	
	
	@Override
	public String toString() {
		return "Pedido [tipoPedido=" + tipoPedido + ", idPedido=" + idPedido + ", cliente=" + cliente + ", cantidad="
				+ cantidad + ", precioUnitario=" + precioUnitario + "]";
	}	
	
}
