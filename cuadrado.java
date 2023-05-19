package misClases;

import java.util.Stack;

public class Cuadrado {
	private Queue<Integer>Cola_CajaRectangular=null;
	private int lado;
	public Cuadrado(int d){
  Cola_CajaRectangular = new LinkedList<Integer>();
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
