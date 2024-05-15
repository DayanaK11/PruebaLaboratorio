//Laboratorio Nro 2 - Ejercicio1
//Autor: Dayana Katherine Cayo Lahuana 
package actividad01;
import java.util.*;
public class DemoBatalla {

	public static void main(String[] args) {
		Nave [] misNaves = new Nave[3];  
		Scanner sc = new Scanner(System.in);  

		String nomb, col;  
		int fil, punt;          
		boolean est;  

		for (int i = 0; i < misNaves.length; i++) {  
			System.out.println("Nave " + (i+1));  
			System.out.print("Nombre: ");            
			nomb = sc.next();  
			System.out.println("Fila ");            
			fil = sc.nextInt();  
			System.out.print("Columna: ");            
			col = sc.next();  
			System.out.print("Estado: ");            
			est = sc.nextBoolean();            
			System.out.print("Puntos: ");            
			punt = sc.nextInt();  

			misNaves[i] = new Nave(); //Se crea un objeto Nave y se asigna su referencia a misNaves            

			misNaves[i].setNombre(nomb);            
			misNaves[i].setFila(fil);            
			misNaves[i].setColumna(col);            
			misNaves[i].setEstado(est);            
			misNaves[i].setPuntos(punt);  }  

		System.out.println("\nNaves creadas:");  
		mostrarNaves(misNaves);            
		mostrarPorNombre(misNaves);            
		mostrarPorPuntos(misNaves);  
		System.out.println("\nNave con mayor número de puntos: " + mostrarMayorPuntos(misNaves));           
	}  
	//Método para mostrar todas las naves public 
	static void mostrarNaves(Nave [] flota){      
		for (int i = 0; i < flota.length; i++) {
	        System.out.println("Nave " + (i + 1) + ":");
	        System.out.println("Nombre: " + flota[i].getNombre());
	        System.out.println("Fila: " + flota[i].getFila());
	        System.out.println("Columna: " + flota[i].getColumna());
	        System.out.println("Estado: " + flota[i].getEstado());
	        System.out.println("Puntos: " + flota[i].getPuntos());
	        System.out.println("--------------------------");
	    }
	}  

	//Método para mostrar todas  las naves de un nombre que se pide por teclado 
	public static void mostrarPorNombre(Nave [] flota){
		Scanner sc = new Scanner(System.in);
	    System.out.print("Ingrese el nombre de la nave que desea buscar: ");
	    String nombreBuscado = sc.next();

	    System.out.println("Naves con nombre '" + nombreBuscado + "':");
	    for (Nave nave : flota) {
	        if (nave.getNombre().equalsIgnoreCase(nombreBuscado)) {
	            System.out.println("Nombre: " + nave.getNombre());
	            System.out.println("Fila: " + nave.getFila());
	            System.out.println("Columna: " + nave.getColumna());
	            System.out.println("Estado: " + nave.getEstado());
	            System.out.println("Puntos: " + nave.getPuntos());
	            System.out.println("--------------------------");
	        }
	    }
	}  

	//Método para mostrar todas las naves con un número de puntos inferior o igual  
	//al número de puntos que se pide por teclado public 
	static void mostrarPorPuntos(Nave [] flota){  
		 Scanner sc = new Scanner(System.in);
		    System.out.print("Ingrese el número de puntos máximo: ");
		    int puntosMaximos = sc.nextInt();

		    System.out.println("Naves con puntos igual o inferiores a " + puntosMaximos + ":");
		    for (Nave nave : flota) {
		        if (nave.getPuntos() <= puntosMaximos) {
		            System.out.println("Nombre: " + nave.getNombre());
		            System.out.println("Fila: " + nave.getFila());
		            System.out.println("Columna: " + nave.getColumna());
		            System.out.println("Estado: " + nave.getEstado());
		            System.out.println("Puntos: " + nave.getPuntos());
		            System.out.println("--------------------------");
		        }
		    }
	}  

	//Método que devuelve la Nave con mayor número de Puntos 
	public static Nave mostrarMayorPuntos(Nave [] flota){
		 Nave naveMayorPuntos = flota[0]; 

		    for (int i = 1; i < flota.length; i++) {
		        if (flota[i].getPuntos() > naveMayorPuntos.getPuntos()) {
		            naveMayorPuntos = flota[i];
		        }
		    }

		    return naveMayorPuntos;
	}   
	//Crear un método que devuelva un nuevo arreglo de objetos con todos los objetos previamente ingresados 
	//pero aleatoriamente desordenados  }  
	public static Nave[] navesDesordenadas(Nave[] flota) {
        Nave[] flotaDesordenada = new Nave[flota.length];
        System.arraycopy(flota, 0, flotaDesordenada, 0, flota.length);

        Random rand = new Random();

        for (int i = flotaDesordenada.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            Nave temp = flotaDesordenada[i];
            flotaDesordenada[i] = flotaDesordenada[j];
            flotaDesordenada[j] = temp;
        }

        return flotaDesordenada;
    }

}
