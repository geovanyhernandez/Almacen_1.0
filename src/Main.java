import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public  static void main(String[] args)throws IOException {
		int opcion=0;
		Scanner sc = new Scanner(System.in); 
		do{
		
			System.out.println("¿que opcion desea elegir?");
			System.out.println("1-introducir Manzanas");
			System.out.println("2-introducir Leche");
			System.out.println("3-introducir Lechuga");
			System.out.println("3-ver Cliente");

			System.out.println("Que eleccion deseas elegir?");	
		    opcion= sc.nextInt();

		    switch(opcion) {
			case 1:
				{
				   Manzana manzana = new Manzana();
				   manzana.crearmanzana();
				   manzana.vermanzana();
				   break;
				}
		}		

		}while(opcion !=2);	
		sc.close();
	}
}







/*
       	 ArrayList <Distribuidor>distri = new ArrayList <Distribuidor>();
       	 ArrayList <Manzana>manza = new ArrayList <Manzana>();
       	 ArrayList <Leche>lech = new ArrayList <Leche>();
       	 ArrayList <Lechuga>lechu = new ArrayList <Lechuga>();
       	 ArrayList <Cliente>clien = new ArrayList <Cliente>(); 
       	
       	 
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Nº de opcion a realizar : 1-2-3-4");
    	 int opcion = sc.nextInt();
    	 
    	 
    	 
		 FileReader fr = new FileReader("distribuidores.txt");
		 BufferedReader br = new BufferedReader(fr); 
	
		 String a;
		 String [] campo = null;
		 String [] campo2 = null;
		 String [] campo3 = null;
	
			
		  while((a = br.readLine()) !=null) {
		  
			 	Distribuidor distribuidor = new Distribuidor();
			 	Direccion direccion       = new Direccion();
			 	Contacto contacto         = new  Contacto();

			    campo = a.split("#");
			 	
			    distribuidor.setNombre(campo[0]);
			 	distribuidor.setCIF(campo[1]);
			 
			 	campo2=campo[2].split(",");
			    
			 	direccion.setPais(campo2[0]);
			    
			 	direccion.setCalle(campo2[1]);
			    direccion.setNumeroPortal(Integer.parseInt(campo2[2]));
			    direccion.setNumeroPiso(Integer.parseInt(campo2[3]));
			    direccion.setPuerta(campo2[4]);
			    
				distribuidor.setDireccion(direccion);  
			 	campo3=campo[3].split(",");
			 	
			 	contacto.setNombre(campo3[0]);
			 	contacto.setApellido(campo3[1]);
			 	contacto.setDni(campo3[2]);
			 	contacto.setMovil(Integer.parseInt(campo3[3]));
			 	
			 	distribuidor.setPersonaContacto(contacto);
			 	

			 	distri.add(distribuidor);
		 	
		 	
		 	}
		 	
		 	switch(opcion){
    	 	
    	     case 1: 
		 	
		 	System.out.println("distribuidores:");
		 for (int b=0; b<distri.size(); b++) {
		 	System.out.println("--------------------------------");	
		 	System.out.println("Nombre "+distri.get(b).getNombre());	
		 	System.out.println("CIF "+distri.get(b).getCIF());
		 
		 	System.out.println("Pais "+distri.get(b).getDireccion().getPais());
		
		 
		 }
		
		break;
		
		case 2:	
		 //comienza la segunda parte

		 
	  	  System.out.println("\n ingresar informacion  productos");
	  	 
	  	  
	     //ArrayList <Manzana>manza = new ArrayList <Manzana>();

		 System.out.println(" manzanas ");
	     
	     for (int c=0; c<1; c++) {
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
		 	
		  //ArrayList <Lechuga>lechu = new ArrayList <Lechuga>();
		   System.out.println(" Lechugas ");

		   for (int e=0; e<1; e++) {
		   		Lechuga lechuga = new Lechuga();
		   		Distribuidor distribuidor = new Distribuidor();

		   		System.out.println("tipo de lechuga");
		 	    lechuga.setTipoLechuga(sc.next());

		 	    System.out.println("procedencia de lechuga");
		 	    lechuga.setProcedencia(sc.next());

		 	    System.out.println("color de  lechuga");
		 	    lechuga.setColor(sc.next());

		 	    System.out.println("a cuantos euros la unidad");
		 	    lechuga.setEurosUnidad(sc.nextDouble());

		 	    
		 	    System.out.println("distribuidor de las lechuga");
		 	    String distr= sc.next();
		 	    distribuidor.setNombre(distr);

		 	    for (int d=0; d<distri.size();  d++) {
			 		String distri_array=distri.get(d).getNombre();
			 		if (distr.equalsIgnoreCase(distri_array)){
			 			lechuga.setDistribuidor(distri.get(d));
			 		}

		 	    	}
		 	    	
		 	    	lechu.add(lechuga);	
		 	   } 	

		//ArrayList <Leche>lech = new ArrayList <Leche>();
		  System.out.println(" Leche ");

		  for (int c=0; c<2; c++) {
			  	Leche leche = new Leche();
			  	Distribuidor distribuidor = new Distribuidor();


			  	System.out.println("tipo de leche");
			 	leche.setTipo(sc.next());

			 	System.out.println("procedencia de leche");
			 	leche.setProcedencia(sc.next());


			 	System.out.println("a cuantos euros el litro");
			 	leche.setEurosLitro(sc.nextDouble());

			 	System.out.println("distribuidor de leche");
			 	String distr = sc.next();
			 	distribuidor.setNombre(distr);

			 	for (int d=0; d<distri.size();  d++) {
				 		String distri_array=distri.get(d).getNombre();
			 		if (distr.equalsIgnoreCase(distri_array)){
			 			leche.setDistribuidor(distri.get(d));
			 		}
				 }
		 	    	int codleche=300;                  		//quinta parte
		 			leche.setCod_Barras(codleche);         //quinta parte
			 		lech.add(leche);
			    }
		 	

	 		System.out.println("****manzanas****");
	 		System.out.println("");
	  		 for (int m=0; m<manza.size(); m++) {


		  	 	System.out.println("\ntipo de manzana "         + manza.get(m).getTipoManzana());
		  	 	System.out.println("\nprocedencia de manzana "  + manza.get(m).getProcedencia());
		  	 	System.out.println("\neuros el kilo manzana "   + manza.get(m).getEurosKilo());
		  	 	System.out.println("\ncolor de manzana "        + manza.get(m).getColor());

		  	 	System.out.println("***DISTRIBUIDOR***");

		  	 	System.out.println("\ndistribuidor "     + manza.get(m).getDistribuidor().getNombre());
		  	 	System.out.println("\nCIF "              + manza.get(m).getDistribuidor().getCIF());
		  	 	System.out.println("\npais "        + manza.get(m).getDistribuidor().getDireccion().getPais());
		  
		  	 	System.out.println("\ncontacto movil "   + manza.get(m).getDistribuidor().getPersonaContacto().getMovil());

	  		}
	  		System.out.println("****Lechuga****");
	  		System.out.println("");
	  		for (int b=0; b<lechu.size(); b++) {
	  			System.out.println("\ntipo de lechuga  "          + lechu.get(b).getTipoLechuga());
		  	 	System.out.println("\nprocedencia de lechuga "    + lechu.get(b).getProcedencia());
		  	 	System.out.println("\neuros unidad de lechuga "   + lechu.get(b).getEurosUnidad());
		  	 	System.out.println("\ncolor de lechuga"           + lechu.get(b).getColor());

		  	 	System.out.println("***DISTRIBUIDOR***");

		  	 	System.out.println("\ndistribuidor "     + lechu.get(b).getDistribuidor().getNombre());
		  	 	System.out.println("\nCIF "              + lechu.get(b).getDistribuidor().getCIF());
		  	    System.out.println("\ndireccion "        + lechu.get(b).getDistribuidor().getDireccion().getPais());
		  	 	System.out.println("\ncontacto movil "   + lechu.get(b).getDistribuidor().getPersonaContacto().getMovil());
		  	 }
		  	 System.out.println("****Leche****");
		  	 System.out.println("");
		  	 for (int c=0; c<lech.size(); c++) {
		  	 	System.out.println("\ntipo de leche  "          + lech.get(c).getTipo());
		  	 	System.out.println("\nprocedencia de leche "    + lech.get(c).getProcedencia());
		  	 	System.out.println("\neuros el litro leche "    + lech.get(c).getEurosLitro());
		  	
		  	 	System.out.println("***DISTRIBUIDOR***");

		  	 	System.out.println("\ndistribuidor "     + lech.get(c).getDistribuidor().getNombre());
		  	 	System.out.println("\nCIF "              + lech.get(c).getDistribuidor().getCIF());
		  	    System.out.println("\ndireccion "        + lech.get(c).getDistribuidor().getDireccion().getPais());
		  	 	System.out.println("\ncontacto movil "   + lech.get(c).getDistribuidor().getPersonaContacto().getMovil());
		  	 }	
		  	 break;
		  	 
		  	 case 3:
		  	 
		  	 //tercera parte 
			 //ArrayList <Cliente>clien = new ArrayList <Cliente>(); 
		     FileReader fr2 = new FileReader("Clientes.txt");
		     BufferedReader br2 = new BufferedReader(fr2); 
		     String [] campo4 = null;
		     System.out.println("Clientes:");
		     String a2;
	 	
	 	    	 
		     while((a2 = br2.readLine()) !=null) {
		     	
		     	Cliente cliente = new Cliente();
		     	Direccion direccion = new Direccion();
		    
		     	campo4= a2.split(",");
		     
		     	cliente.setNombre(campo4[0]);
		     	cliente.setApellidos(campo4[1]);
		        cliente.setDNI(campo4[2]);
		        //direccion.setDireccion(campo2[3]);//este no va lo cambie por el de abajo
		        
		        direccion.setCalle(campo4[3]);//prob
		        
		     	cliente.setNum_socio(Double.parseDouble(campo4[4]));
		     	cliente.setDto(Double.parseDouble(campo4[5]));
		        cliente.setDireccion(direccion);
			 
			    clien.add(cliente);
		     }
		  	 
		  	  for (int b=0; b<clien.size(); b++) {
		 	System.out.println("--------------------------------");	
		 	System.out.println("Nombre "			 +clien.get(b).getNombre());	
		 	System.out.println("Apellido "			 +clien.get(b).getApellidos());
		 	System.out.println("Dni " 				 +clien.get(b).getDNI());
		    System.out.println("direccion "          +clien.get(b).getDireccion().getCalle());
		 	System.out.println("Numero de socio "    +clien.get(b).getNum_socio());
		 	System.out.println("Numero de descuento "+clien.get(b).getDto());
		 
		 
		 	}
		    break;
    	
    		case 4:
    			System.out.println("cuantos productos desea añadir a la  cesta? ");
    			int añadir = sc.nextInt();
    			
    		    for (int aa=0; aa<añadir; aa++){
    					System.out.println("inserte el codigo de barra del producto " + (aa+1));
    					int producto1 = sc.nextInt();
    				
    			} 
		  	 //  System.out.println("inserte el nombre de cliente ");
		  	 
    	 } 	 
    	 //vaciamos los arraylist
		  	 manza.clear();
			 lech.clear();
			 lechu.clear();
			 distri.clear();
			 clien.clear();
			 cest.clear();
    	 

	}
}*/
