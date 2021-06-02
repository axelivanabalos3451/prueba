package ar.unla.edu.pb2.parcial1;

public class Cliente {

	private Integer codigo;
	private String apellido;
	private String nombre;
	private Integer edad;
	public Cliente(Integer cODIGO_ESPERADO, String aPELLIDO_ESPERADO,
			String nOMBRE_ESPERADO, Integer eDAD_ESPERADA) {
		this.codigo=cODIGO_ESPERADO;
		this.apellido=aPELLIDO_ESPERADO;
		this.nombre=nOMBRE_ESPERADO;
		this.edad=eDAD_ESPERADA;
		
		
	
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
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
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
	

}
