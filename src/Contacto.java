public class Contacto {

	private String nombre;
	private String apellido;
	private String dni;
	private int movil;

	//set//
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public void setApellido(String apellido){
		this.apellido=apellido;
	}
	public void setDni(String dni){
		this.dni=dni;
	}
	public void setMovil(int movil){
		this.movil=movil;
	}

	//get//
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public String getDni(){
		return dni;
	}
	public int getMovil(){
		return movil;
	}
}
