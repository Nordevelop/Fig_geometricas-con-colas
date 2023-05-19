package misClases;
import java.util.LinkedList;
import java.util.Queue;
public class Cuadrado {
   private Queue<Integer>Cola_Cuadrado=null;
   private int lado;
   public Cuadrado(int d){
   Cola_Cuadrado = new LinkedList<Integer>();
   this.lado4=d;
  }
  /*
    * metodos
    */
   public int dar_Area_Cuadrado(){
	return (this.lado*this.lado);
   }
   public int dar_Perimetro_Cuadrado(){
	return(this.lado*4);
   }

}
