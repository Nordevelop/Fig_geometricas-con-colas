package misClases;
import java.util.LinkedList;
import java.util.Queue;
public class Rectangulo{
   private Queue<Integer>Cola_Rectangulo=null;
	 private int lado2;
   private int lado3;
	 public Rectangulo(int d){
	   Cola_Rectangulao = new LinkedList<Integer>();
	   this.lado2=d;
   }
    public int dar_Perimetro_Rectangulo(){
		   return (this.lado2*2+this.lado3*2); //l1 * 2 + l2 *2
  	}
	  public int dar_Superficie_Rectangulo(){
		   return (this.lado2*this.lado3);
	  }
 }
