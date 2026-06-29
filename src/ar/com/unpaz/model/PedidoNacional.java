package ar.com.unpaz.model;

public class PedidoNacional extends Pedido{

	private String destino;
	private double peso;
	private boolean reqEspecial;
	
	public PedidoNacional(String tipoPedido, int idPedido, String cliente, double cantidad, double precioUnitario, String destino, double peso, boolean reqEspecial) {
		super(tipoPedido,idPedido,cliente,cantidad,precioUnitario);
		this.destino = destino;
		this.peso = peso;
		this.reqEspecial = reqEspecial;
		
		
	}
	
	
	@Override
	public double ImporteBase() {
		double total = getCantidad() + getPrecioUnitario();
				
		return total;
		
	}

	@Override
	public double ImporteTotal() {
		
		double peso = (getPeso() * 10);
		double previo = ImporteBase() + peso;
		double total = 0  ;
		
		
		if (isReqEspecial()) {
			 total = previo * 1.15; 
			
		} else {
			total = previo;
		}
		
		return total;
		
	}
	
	
	

	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public boolean isReqEspecial() {
		return reqEspecial;
	}


	public void setReqEspecial(boolean reqEspecial) {
		this.reqEspecial = reqEspecial;
	}



}
