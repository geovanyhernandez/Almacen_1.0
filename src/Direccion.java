public class Direccion {
	private String pais;
	private String calle;
	private int numeroPortal;
    private int numeroPiso;
    private String puerta;


 	public void setPais(String pais){
 		this.pais=pais;
 	}
 	public void setCalle(String calle){
 		this.calle=calle;
 	}
 	public void setNumeroPiso(int piso){
 		this.numeroPiso=piso;
 	}
 	public void setNumeroPortal(int numeroPortal){
 		this.numeroPortal=numeroPortal;
 	}
 	public void setPuerta(String puerta){
 		this.puerta=puerta;
 	}

 	//get//
 
 	public String getPais(){
 		return pais;
 	}
 	public String getCalle(){
 		return calle;
 	}
 	public int getNumeroPiso(){
 		return numeroPiso;
 	}
 	public int getNumeroPortal(){
 		return numeroPortal;
 	}
 	public String getPuerta(){
 		return puerta;
 	}

}