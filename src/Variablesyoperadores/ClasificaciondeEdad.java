package Variablesyoperadores;

import java.util.Scanner;

public class ClasificaciondeEdad {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su edad");
		int edad = sc.nextInt();
		
		if (edad < 12) {
		    System.out.println("Eres un niño"); 
		}
		else if (edad < 17 ){
	    	System.out.println("Eres un adolescente");
	    }
		else if (edad <= 59 ){
	    	System.out.println("Eres un adulto");
	    }
		
		else{
	    	System.out.println("Eres un adulto mayor");
	    	}
		
		System.out.println("Ejercicio 5:");
			
	}
}