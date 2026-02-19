package Variablesyoperadores;
import java.util.Scanner;

public class Variables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un valor Entero");
		int valorEntero = sc.nextInt();
		System.out.println("El Valor entero es: " + valorEntero);
		
		System.out.println("Ingrese un valor decimal ");
		double valorDecimal = sc.nextDouble();		
		System.out.println("El Valor Decimal es: " + valorDecimal);		
		
		sc.nextLine(); // para limpiar el buffer

		System.out.println("Ingrese un nombre");
		String valorString = sc.nextLine();
		System.out.println("El nombre es: " + valorString);
		
		System.out.println("Ingrese un valor booleano (true/false)");
		boolean valorBooleano = sc.nextBoolean();
		System.out.println("El valor booleano es: " + valorBooleano);
		
		System.out.println("Ejercicio 2");
	
	

	}
}

