package ar.unla.edu.pb2.parcial1;

import ar.unla.edu.pb2.parcial1.Enumeradores.Estado;

public abstract class Producto {

	private Integer codigo;
	private String descripcion;
	private Estado est;
	private Cliente cli;
	public Producto(Integer CODIGO_ESPERADO,String DESCRIPCION_ESPERADA) 
	{
		this.codigo=CODIGO_ESPERADO;
		this.descripcion=DESCRIPCION_ESPERADA;
		
	}

	
	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}


	public Object getEstadoActual() {
		
		return null;
	}


	public void setEstado(Estado eSTADO_INICIAL_ESPERADO) {
		this.est=eSTADO_INICIAL_ESPERADO;
		
	}



	

	
}
