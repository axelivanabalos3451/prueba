package ar.unla.edu.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

import ar.unla.edu.pb2.parcial1.Enumeradores.Genero;



public class Pelicula extends Producto implements Vendible {

	private Genero genero;
	private Integer anoDeEstreno;
	private String director;
	private Double precioventa;
	
	private List<String>actores= new ArrayList<String>();

	public Pelicula(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, Genero gENERO_ESPERADO,
			Integer aNO_DE_ESTRENO_ESPERADO, String dIRECTOR_ESPERADO) {
		super(cODIGO_ESPERADO,dESCRIPCION_ESPERADA);
		this.genero=gENERO_ESPERADO;
		this.anoDeEstreno=aNO_DE_ESTRENO_ESPERADO;
		this.director=dIRECTOR_ESPERADO;
		
		// TODO Auto-generated constructor stub
	}
	

	
	
	
	public String getDirector() {
		return director;
	}





	public void setDirector(String director) {
		this.director = director;
	}





	public Integer getAnoDeEstreno() {
		return anoDeEstreno;
	}




	public void setAnoDeEstreno(Integer anoDeEstreno) {
		this.anoDeEstreno = anoDeEstreno;
	}




	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public void agregarActor(String aCTOR_1_ESPERADO) {
		actores.add(aCTOR_1_ESPERADO);
		
	}





	public Boolean actua(String aCTOR_1_ESPERADO) {
		for(String actorbuscado:actores) 
		{if(actorbuscado.equals(aCTOR_1_ESPERADO)) 
		{
			
			return true;
		}
			
		}
		return null;
	}





	@Override
	public void setPrecioVenta(Double precioventa) {
		this.precioventa=precioventa;
		// TODO Auto-generated method stub
		
	}





	@Override
	public Double getPrecioVenta() {
		// TODO Auto-generated method stub
		return precioventa;
	}
}
