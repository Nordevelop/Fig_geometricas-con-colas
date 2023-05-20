package misClases;
import java.math.*;

public class Cubo {
	/*propiedades de la clase cubo() 
	 * encapsulados con acceso restringido 
	 * fuera de la clase Cubo
	 * author Nordevelop
	 */
	private double lado4;
	private Queue<Integer>Cola_Cubo=null;
	public Cubo(double g){ //constructor con argumento
	Cola_Cubo = new LinkedList<Integer>();
	   this.lado4=g;
	}
	/*
	 * Metodos
	 */
	public double Dar_Area_Cubo(){
		return (6*Math.pow(lado4, 2));
	}
	public double Dar_Volumen_Cubo(){
		return (Math.pow(lado4, 3));
	}
}

	
