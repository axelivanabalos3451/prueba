package ar.unla.edu.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {

	private String nombre;
	private List<Producto> listap =new ArrayList<Producto>();
	
	public Videoclub(String nOMBRE_VIDEOCLUB) {
		this.nombre=nOMBRE_VIDEOCLUB;
	}
	public void agregarProducto(Producto nuevoProducto) {
		listap.add(nuevoProducto);
		
	}
	

	
	public Producto buscarProducto(Producto nuevoProducto) {
		for(Producto pro:listap) 
		{
			if(pro.getCodigo().equals(nuevoProducto.getCodigo())) 
			{
				return nuevoProducto;
				
			}
			
		}
		return null;
	}
	public boolean vender(Producto nuevoProducto, Cliente nuevoCliente) {
		for(Producto prod:listap) 
		{
			if(prod.getCodigo().equals(nuevoProducto)) 
			{
			 

			
					
					return true;
				}
				
			}
				
			
			
		
		
		return false;
	}

}
