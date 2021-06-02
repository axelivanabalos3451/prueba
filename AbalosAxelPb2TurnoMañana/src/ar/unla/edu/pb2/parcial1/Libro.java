package ar.unla.edu.pb2.parcial1;

import ar.unla.edu.pb2.parcial1.Enumeradores.Estado;

public class Libro extends Producto{

	private String autor;
	private String editorial;
	private Estado est;
	public Libro(Integer CODIGO_ESPERADO, String DESCRIPCION_ESPERADA,
			String aUTOR_ESPERADO, String eDITORIAL_ESPERADA) {
		super(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
		this.autor=aUTOR_ESPERADO;
		this.editorial=eDITORIAL_ESPERADA;
		// TODO Auto-generated constructor stub
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Estado getEst() {
		return est;
	}
	public void setEst(Estado est) {
		this.est = est;
	}
	

}
