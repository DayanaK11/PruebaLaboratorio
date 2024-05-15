package ejercicioResuelto01;
import java.util.*;

public class Main {
	
	int [][] notas; //arreglo bidimensional
	static Scanner consola=new Scanner(System.in);
	int n,m; //cantidad de filas y cantidad de columnas
	
	private void dimensionarArreglo() {
		System.out.println("Ingrese la cantidad de filas: ");
		n = consola.nextInt();
		System.out.println("Ingrese la cantidad de columnas: ");
		m = consola.nextInt();
		
		//dimensionamos arreglo
		notas = new int [n][m];
	}
	
	private void llenarArreglo() {
		Random generador = new Random();
		for(int fila = 0; fila<notas.length; fila++) {
			for(int columna = 0; columna < notas[0].length; columna ++) {
				notas[fila][columna] = generador.nextInt(20) + 1;
			}
		}
	}
	
	private void imprimirArreglo() {
		for(int f = 0; f<notas.length; f++) {
			for(int c = 0; c < notas[0].length; c ++) {
				System.out.print(notas[f][c] + "\t");
			}
			System.out.println(""); //salto de linea
		}
	}
	
	private void buscarNumero(int notaBuscada) {
		for(int f = 0; f<notas.length; f++) {
			for(int c = 0; c < notas[0].length; c ++) {
				if(notas[f][c] == notaBuscada) {
					System.out.println("Encontrado en ==> Fila : " + f + " Columna : " + c);
				}
			}
		}
	}
	
	private double calcularPromedio() {
		double suma = 0.00, promedio = 0.00;
		for(int f = 0; f<notas.length; f++) {
			for(int c = 0; c < notas[0].length; c ++) {
				suma += notas[f][c];			
			}			
		}
		promedio = suma / (notas.length * notas[0].length);//nro. fila  * nro. columnas
		return promedio;
	}

	public static void main(String[] args) {
		
		Main objPrincipal = new Main();
		objPrincipal.dimensionarArreglo();
		objPrincipal.llenarArreglo();
		objPrincipal.imprimirArreglo();
		System.out.println("Ingrese la NOTA Busacada : ");
		int nota = consola.nextInt();
		objPrincipal.buscarNumero(nota);
		//calcular promedio y retorna resultado
		double prom = objPrincipal.calcularPromedio();
		System.out.println("El promedio es : " + prom);
	}

}
