package misClases;
import java.util.LinkedList;
import java.util.Queue;
import java.math.*;
public class Cilindro {
  private Queue<Integer>Cola_Clindro=null;
  private double radio;
  private double altura;
  public Cilindro (double g, double h){
      Cola_Cilindro = new LinkedList<Integer>();
      this.radio = g;
      this.altura = h;
  }
  public float Dar_Area_Cilindro() {
		return (float) (2*Math.PI*(radio + altura)); 
	}
	public float Dar_Volumen_Cilindro(){
	  return (float) (Math.PI*Math.pow(this.radio, 2)*altura);
	  }
}
 
