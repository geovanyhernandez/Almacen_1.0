import java.util.ArrayList;
import java.util.Scanner;
public class Manzana{
	private String tipoManzana;
	private String procedencia;
	private String color;
	private Double eurosKilo;
	private Distribuidor distribuidor;
	
 ArrayList <Manzana>manza = new ArrayList <Manzana>();
 ArrayList <Distribuidor>distri = new ArrayList <Distribuidor>();

	//set//
	public void setTipoManzana(String tipoManzana){
		this.tipoManzana=tipoManzana;
	}
	public void setProcedencia(String procedencia){
		this.procedencia=procedencia;
	}
	public void setColor(String color){
		this.color=color;
	}
	public void setEurosKilo(Double eurosKilo){
		this.eurosKilo=eurosKilo;
	}
	public void setDistribuidor(Distribuidor distribuidor){
		this.distribuidor=distribuidor;
	}
	 

	//get//
	public String getTipoManzana(){
		return tipoManzana;
	}
	public String getProcedencia(){
		return procedencia;
	}
	public String getColor(){
		return color;
	}
	public Double getEurosKilo(){
		return eurosKilo;
	}
	public Distribuidor getDistribuidor(){
		return distribuidor;
	}

  Scanner sc = new Scanner(System.in);


	protected void crearmanzana(){
		System.out.println("cuantas manzanas desea añadir?");
		int numeromanzana=sc.nextInt();
		for (int a=0; a<numeromanzana; a++) {
			 	Manzana manzana = new Manzana();
			 	Distribuidor distribu = new Distribuidor();
			 	
			 
			 	System.out.println("tipo de manaza");
			 	manzana.setTipoManzana(sc.next());

			 	System.out.println("procendecia de manzana");
			 	manzana.setProcedencia(sc.next());

			 	System.out.println("color de manzana");
			 	manzana.setColor(sc.next());

			 	System.out.println("a cuanto euros el kilo");
			 	manzana.setEurosKilo(sc.nextDouble());

			 	System.out.println("introduce el nombre del distribuidor");
			 	String distr = sc.next();
			 	distribu.setNombre(distr);
			 	
			 	
			 	for (int d=0; d<distri.size();  d++) {
			 		String distri_array=distri.get(d).getNombre();
			 		if (distr.equalsIgnoreCase(distri_array)){
			 			manzana.setDistribuidor(distri.get(d));
			 		
			 		}
			 	}
		
		 	manza.add(manzana);
		 }    
				 	

	}
	protected void vermanzana(){
		System.out.println("\n****manzanas****");
	 		System.out.println("");
	  		 for (int m=0; m<manza.size(); m++) {


		  	 	System.out.println("tipo de manzana "         + manza.get(m).getTipoManzana());
		  	 	System.out.println("procedencia de manzana "  + manza.get(m).getProcedencia());
		  	 	System.out.println("euros el kilo manzana "   + manza.get(m).getEurosKilo());
		  	 	System.out.println("color de manzana "        + manza.get(m).getColor());

		  	 	System.out.println("\n***DISTRIBUIDOR***");

		  	 	System.out.println("distribuidor "     + manza.get(m).getDistribuidor().getNombre());
		  	 	System.out.println("CIF "              + manza.get(m).getDistribuidor().getCIF());
		  	 	System.out.println("pais "        + manza.get(m).getDistribuidor().getDireccion().getPais());
		        System.out.println("contacto movil "   + manza.get(m).getDistribuidor().getPersonaContacto().getMovil());

	  		}

	}
	
	
}