package misClases;
import java.math.*;
import java.util.Qeue;
import java.util.LinkedList;
public class Esfera {
	/*Author Nordevelop
	 * 
	 */
  private Queue<Integer>Cola_Esfera=null;
	private float radio2;

	public Esfera(float m){ //clase constructor con argumentos
     Cola_Esfera = new LinkedList<Integer>();
	
		this.radio2=m;

	}
	public float Dar_Superficie_Esfera(){ //metodo
		return (float) (4*Math.PI*Math.pow(radio2, 2)); //superficie devuelve S= 4πr**2
	}
	public float Dar_Volumen_Esfera(){
		return (float)(4*Math.PI*Math.pow(radio2, 3))/3;  //volumen  devuelve V=(4πr**3) / 3
	}
	
}
