package ar.unla.edu.pb2.parcial1;

import ar.unla.edu.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego extends Producto implements Alquilable {

	private TipoDeConsola consola;
	private Double precio;
	public Videojuego(Integer CODIGO_ESPERADO, String DESCRIPCION_ESPERADA, TipoDeConsola cONSOLA_ESPERADA) {
		super(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
		this.consola=cONSOLA_ESPERADA;
		// TODO Auto-generated constructor stub
	}
	public TipoDeConsola getTipo() {
		// TODO Auto-generated method stub
		return consola;
	}
	@Override
	public void setPrecioAlquiler(Double pRECIO_ALQUILER) {
		this.precio= pRECIO_ALQUILER;
		
	}
	@Override
	public Double getPrecioAlquiler() {
		// TODO Auto-generated method stub
		return precio;
	}


}
