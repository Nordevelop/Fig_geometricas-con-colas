package misClases;
import java.util.Stack;
import java.math.*;

public class Pitagoras {
  private Queue<Integer>Cola_Pitagoras=null;
  private double cateto1;
	private double cateto2;
  public Pitagoras( double c1, double c2) {//Constructor con parametros
		 Cola_Pitagoras = new LinkedList<double>();
		this.cateto1=c1;
		this.cateto2=c2;
	}
  public double dar_hipotenusa() {
		return(double)Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	}
	public double dar_areaTriangulo_rectangulo() {
		return(double)(cateto1 * cateto2)/2;
	}
}
