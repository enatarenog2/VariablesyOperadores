package Variablesyoperadores;

import java.util.Scanner;

public class DiadelaSemana {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero del 1 al 7: ");
		int diadelasemana = sc.nextInt();
		
		switch (diadelasemana) {
		case 1: 
			System.out.println("Dia Lunes");
			break;
			
		case 2:
			System.out.println("Dia Martes");
			break;
		
		case 3: 
			System.out.println("Dia Miercoles");
			break;
			
		case 4:
			System.out.println("Dia Jueves");
			break;
			
		case 5: 
			System.out.println("Dia Viernes");
			break;
			
		case 6:
			System.out.println("Dia Sabado");
			break;
			
		case 7: 
			System.out.println("Dia Domingo");
			break;	
		
		 default:
             System.out.println("Número inválido");
             break;
			
		}
		System.out.println("Ejercicio 6:");
	}
}