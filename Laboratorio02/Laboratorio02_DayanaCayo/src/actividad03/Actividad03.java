//Laboratorio Nro 2 - Ejercicio3
//Autor: Dayana Katherine Cayo Lahuana 
package actividad03;
import java.util.*;
public class Actividad03 {

	public static void main(String[] args) {
		//DECLARACION Y CREACION DE LOS ARREGLOS 
		final int N = 21; 

		String equipo1 [] = new String [N]; 
		String equipo2 [] = new String [N]; 

		inicializarEquipo(equipo1); 
		inicializarEquipo(equipo2); 

		System.out.println("----------EQUIPO1----------"); 
		mostrarEquipo(equipo1); 
		System.out.println("----------EQUIPO2----------"); 
		mostrarEquipo(equipo2); 

		System.out.println("----------TITULARES EQUIPO1----------"); 
		mostrarEquipo(seleccionarTitulares(equipo1)); 
		System.out.println("----------TITULARES EQUIPO2----------"); 
		mostrarEquipo(seleccionarTitulares(equipo2)); 

		int golesEquipo1 = generarGoles(); 
		int golesEquipo2 = generarGoles(); 

		System.out.println("--------------MARCADOR---------------"); 
		System.out.println("EQUIPO1 : "+ golesEquipo1 + " VS " + "EQUIPO2 :  "+golesEquipo2); 

				    System.out.println("--------------GANADOR---------------"); 
		System.out.println(determinarGanador(golesEquipo1, golesEquipo2)); 
	}

	//METODO DE INICIALIZAR JUGADORES 
	public static void inicializarEquipo(String equipo[]) 
	{ 
		String nombre = "Jugador"; 
		for(int i = 0;i<equipo.length; i++) 
		{ 
			equipo[i] = nombre + (i+1); 
		} 
	} 

	//METODO DE MOSTRAR JUGADORES 
	public static void mostrarEquipo(String equipo[]) 
	{ 
		for(int i = 0;i<equipo.length; i++) 
		{   
			System.out.println(equipo[i]); 
		} 
	} 

	// METODO DE 11 TITULARES 
	public static String[] seleccionarTitulares(String[] equipo) { 
		Random random = new Random(); 
		String[] titulares = new String[11]; 
		boolean[] seleccionados = new boolean[equipo.length]; 

		for (int i = 0; i < 11; i++)  
		{ 
			int index; 
			do  
			{ 
				index = random.nextInt(equipo.length); 
			}  
			while (seleccionados[index]); 

			titulares[i] = equipo[index]; 
			seleccionados[index] = true; 
		} 
		return titulares; 
	}
	//METODO PARA GENERAR LOS GOLES DEL 1 AL 7 
	public static int generarGoles() { 
		Random random = new Random(); 
		return random.nextInt(8);  
	}    
	//METODO PARA CONOCER EL GANADOR 
	public static String determinarGanador(int golesEquipo1, int golesEquipo2) { 
		if (golesEquipo1 > golesEquipo2) { 
			return "EQUIPO 1"; 
		} else if (golesEquipo2 > golesEquipo1) { 
			return "EQUIPO 2"; 
		} else { 
			return "EMPATE"; 
		} 
	}

}
