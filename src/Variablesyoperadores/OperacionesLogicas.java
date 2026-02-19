package Variablesyoperadores;

import java.util.Scanner;

public class OperacionesLogicas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un valor numerico");
		int valor1 = sc.nextInt();
		
		System.out.println("Ingrese un segundo valor numerico");
		int valor2 = sc.nextInt();
		
		System.out.println("el primer valor es mayor que el segundo?" +(valor1>valor2));
		System.out.println("el primer valor es menor que el segundo?" +(valor1<valor2));
		System.out.println("el primer valor es igual que el segundo?" +(valor1==valor2));
		
		//operadores AND y OR
		System.out.println("ambos valores son positivos?" +(valor1>0 && valor2>0));
		System.out.println("solo un valor es positivo?" +(valor1>0 || valor2>0));
		
		System.out.println("Ejercicio 4:");
	}
}
