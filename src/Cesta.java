import java.util.ArrayList;
public class Cesta {
    
    private Cliente cliente;
    private ArrayList<Manzana> manzana;
    private ArrayList<Lechuga> lechuga;
    private ArrayList<Leche> leche;
    private double calcular;
    
    public void setCliente(Cliente cliente){
        this.cliente=cliente;
    }
    public void setManzana (ArrayList<Manzana>manzana){
        this.manzana=manzana;
    }
    public void setLechuga(ArrayList<Lechuga>lechuga){
        this.lechuga=lechuga;
    }
    public void setLeche(ArrayList<Leche>leche){
        this.leche=leche;
    }
   /* public void setCalcular(double calcular){
        this.calcular=calcular;
    }*/    
    
    public Cliente getCliente(){
        return cliente;
    }
    public ArrayList<Manzana>getManzana(){
        return manzana;
    }
    public ArrayList<Lechuga>getLechuga(){
        return lechuga;
    }
    public ArrayList<Leche>getLeche(){
        return leche;
    }
    /*public double getCalcular(){
        return calcular;
    }*/
   
  
   

}
