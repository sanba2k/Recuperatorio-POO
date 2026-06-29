package ar.com.unpaz.repo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import ar.com.unpaz.model.Pedido;
import ar.com.unpaz.model.PedidoInter;
import ar.com.unpaz.model.PedidoMayorista;
import ar.com.unpaz.model.PedidoNacional;
import ar.com.unpaz.model.PedidoUrgente;
import ar.com.unpaz.service.IServiceLeerArchivo;

public class LeerArchivo implements IServiceLeerArchivo{

	@Override
	public HashMap<Integer, Pedido> Lectura() {
		HashMap<Integer, Pedido> mapa = new HashMap<Integer, Pedido>();
		
		File sfile = new File("src/pedidos.txt");
	try {
		FileReader fiRe = new FileReader(sfile);
		BufferedReader buffer = new BufferedReader(fiRe);
		String linea = "";
		while((linea = buffer.readLine()) != null) {
			String [] array = linea.split(";");
			String tipo = array[0];
			int id = Integer.parseInt(array[1]);
			String cliente = array[2];
			double cantidad = Double.parseDouble(array[3]);
			double preUni = Double.parseDouble(array[4]);
			
			switch(tipo) {
			case "N":
				String destino = array[5];
				double peso = Double.parseDouble(array[6]);
				boolean enBsAs = Boolean.parseBoolean(array[7]);
				
				PedidoNacional peNa= new PedidoNacional(tipo, id, cliente, cantidad, preUni, destino, peso, enBsAs);
				mapa.put(id, peNa);
				break;
				
			case "U":
				double pesoUrg= Double.parseDouble(array[5]);
				String prioridad = array[6];
				boolean esEnBsAs = Boolean.parseBoolean(array[7]);
				
				PedidoUrgente peUr= new PedidoUrgente(tipo, id, cliente, cantidad, preUni, pesoUrg, prioridad, esEnBsAs); 
				mapa.put(id, peUr);
				break;
				
			case "M":
				double pesoMay = Double.parseDouble(array[5]);
				double algo = Double.parseDouble(array[6]);
				String producto = array[7];
				
				PedidoMayorista pediMay = new PedidoMayorista(tipo, id, cliente, cantidad, preUni, pesoMay, algo, producto);
				mapa.put(id, pediMay);
				break;
				
			case "I":
				String pais= array[5];
				double pesoInter = Double.parseDouble(array[6]);
				String productoInter = array[7];
				
				PedidoInter peInter = new PedidoInter(tipo, id, cliente, cantidad, preUni, pais, pesoInter, productoInter);
				mapa.put(id, peInter);
				break;
				
				
			
			}
			
			
			
			
		}
		
		
	} 
		catch(Exception e) 
		{e.printStackTrace();}
		
		return mapa;
	}
	

}
