package misClases;
import java.util.LinkedList;
import java.util.Queue;
import java.math.*;
public class Circulo {
private double radio1; 
private Queue<Integer>Cola_Circulo=null;
public Circulo(double k){
    Cola_Circulo = new LinkedList<Integer>();
  this.radio1= k;
} 
public double Dar_Perimetro_Circulo(){
   	return (double) Math.PI*2*radio1; // radio1 para no repetir el la propiedad de la clase cilindro
}
public double Dar_Superficie_Circulo(){ //DarSuperficie1 para no repetir el metodo del cuadrado
     	return (float) Math.PI*Math.pow(radio1, 2);
 }

}  
  
  
