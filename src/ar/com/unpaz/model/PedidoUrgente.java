package ar.com.unpaz.model;

public class PedidoUrgente extends Pedido{

	private double peso;
	private String prioridad;
	private boolean reqEspecial;
	
	public PedidoUrgente(String tipoPedido, int idPedido, String cliente, double cantidad, double precioUnitario, double peso, String prioridad, boolean reqEspecial) {
		super(tipoPedido,idPedido,cliente,cantidad,precioUnitario);
		this.peso = peso;
		this.prioridad = prioridad;
		this.reqEspecial = reqEspecial;
		
	}
	
	
	@Override
	public double ImporteBase() {
		double total = getCantidad() * getPrecioUnitario();
		
		return total;
	}

	@Override
public double ImporteTotal() {
		
		double peso = (getPeso() * 10);
		double previo = ImporteBase() + peso;
		double totalPrio = 0  ;
		double totalFinal = 0;
		
		if (prioridad.equals("ALTA")) {
			totalPrio = previo * 1.5;
			
		} if (prioridad.equals("MEDIA")) {
			totalPrio = previo * 1.3;
			
		} else {
			totalPrio = previo;
		}
		
		
		if (isReqEspecial()) {
			 totalFinal = totalPrio * 1.15; 
			
		} else {
			totalFinal = totalPrio;
		}
		
		return totalFinal;
		
	}
	

	
	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}




	public String getPrioridad() {
		return prioridad;
	}






	public void setPrioridad(String prioridad) {
		this.prioridad = prioridad;
	}






	public boolean isReqEspecial() {
		return reqEspecial;
	}






	public void setReqEspecial(boolean reqEspecial) {
		this.reqEspecial = reqEspecial;
	}


	
}
