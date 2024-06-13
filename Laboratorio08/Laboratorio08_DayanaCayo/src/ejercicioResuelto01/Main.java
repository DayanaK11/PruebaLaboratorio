package ejercicioResuelto01;
import java.util.*;

public class Main {
	
	public static void main(String [] args) {
		Scanner consola = new Scanner (System.in);
		String resp = "";
		do {
			//ingresamos datos del empleado
			System.out.println("Ingrese NOMBRES del Empleado");
			String nombres = consola.next();
			System.out.println("Ingrese CATEGORIA del Empleado");
			System.out.println("Nombrado | Contratado | Por horas : ");
			String categoria = consola.next();
			System.out.println("Ingrese SUELDO BASICO del Empleado");
			double sueldo = consola.nextDouble();
			System.out.println("Ingrese NUMERO DE HIJOS del Empleado");
			int nroHijos = consola.nextInt();
			
			//creamos instancia de la clase empleado
			Empleado objEmpleado = new Empleado(nombres,categoria, nroHijos, sueldo);
			//llamamos al 2do constructor
			
			objEmpleado.calcularSueldoNeto();
			
			//calculamos sueldos acumulados por cada tipo de empleado
			if(objEmpleado.getCategoria().equals("nombrado"))
			{
				Empleado.sumaSueldosNombrados += objEmpleado.getSueldoNeto();
			}
			else
				if(objEmpleado.getCategoria().equals("contratado")) {
					Empleado.sumaSueldosContratados += objEmpleado.getSueldoNeto();
				}
				else
					if(objEmpleado.getCategoria().equals("por horas")) {
						Empleado.sumaSueldosPorHoras += objEmpleado.getSueldoNeto();
					}

			//MOstramos resultados por empleados
			System.out.println("Bonificacion Categoria : " + objEmpleado.getBonificacionCategoria());
			System.out.println("Bonificacion Escolaridad : " + objEmpleado.getBonificacionEscolaridad());
			System.out.println("Sueldo Neto : " + objEmpleado.getSueldoNeto());
			
			System.out.println("¿Desea seguir (si/no) " );
			resp = consola.next();			
			
		}
		while(resp.equalsIgnoreCase("si") || resp.equalsIgnoreCase("s"));
		
		//Mostrat resultados acumulados finales
		System.out.println("\n------------------------\nRESULTADOS FINALES\n------------------------");
		System.out.println("Total sueldos Nombrados: " + Empleado.sumaSueldosNombrados);
		System.out.println("Total sueldos Contratados: " + Empleado.sumaSueldosContratados);
		System.out.println("Total sueldos Por horas: " + Empleado.sumaSueldosPorHoras);
		System.out.println("Número Empleados con MENOS de 3 Hijos : " + Empleado.contaMenos3Hijos);
		System.out.println("Número Empleados con MENOS de 6 Hijos : " + Empleado.contaMenos6Hijos);
		System.out.println("Número Empleados con MAS de 6 Hijos : " + Empleado.contaMas6Hijos);
		
	}
	

}
