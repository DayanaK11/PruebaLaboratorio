//Laboratorio Nro 2 - Ejercicio2
//Autor: Dayana Katherine Cayo Lahuana 
package actividad02;
import java.util.*;

public class Principal02 {
	
	public static void main (String []args) {
		final int N=5;
		Jugador equipo [] = new Jugador [N];
		Scanner input=new Scanner(System.in);
		
		for(int i=0; i<equipo.length;i++) {
			equipo[i]= new Jugador();
			System.out.println("Ingresar Nombre");
			equipo[i].setNombre(input.next());
			System.out.println("Ingresar Nivel");
			equipo[i].setNivel(input.nextInt());
		}
		
		for(int i=0; i<equipo.length;i++) {
			System.out.println("Jugador " + (i+1) );
			System.out.println("Nombre: " + equipo[i].getNombre());
			System.out.println("Nivel: " + equipo[i].getNivel());
			System.out.println("--------------------------------");
		}
		
		input.close();
	}
	
}