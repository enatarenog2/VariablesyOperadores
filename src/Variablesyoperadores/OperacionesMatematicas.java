package Variablesyoperadores;

import java.util.Scanner;

public class OperacionesMatematicas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un valor numerico entero");
		int valorint1 = sc.nextInt();
		
		System.out.println("Ingrese otro valor numerico entero");
		int valorint2 = sc.nextInt();
		
		System.out.println("el resultado de la suma es: "+ (valorint1 + valorint2));
		System.out.println("El resultado de la resta es: "+ (valorint1 - valorint2));
		System.out.println("el resultado de la multiplicación es: "+ (valorint1 * valorint2));
		System.out.println("El resultado de la Division es: "+ (valorint1 / valorint2));
		
		//valores Double
		
		System.out.println("ingrese un valor numerico Decimal");
		double valordouble1 = sc.nextDouble();
		
		System.out.println("Ingrese otro valor numerico Decimal");
		double valordouble2 = sc.nextDouble();
		
		System.out.println("el resultado de la suma es: "+ (valordouble1 + valordouble2));
		System.out.println("El resultado de la resta es: "+ (valordouble1 - valordouble2));
		System.out.println("el resultado de la multiplicación es: "+ (valordouble1 * valordouble2));
		System.out.println("El resultado de la Division es: "+ (valordouble1 / valordouble2));
		
		//valores tipo float
		
		System.out.println("ingrese un valor numerico tipo float");
		float valorfloat1 = sc.nextFloat();
		
		System.out.println("Ingrese otro valor numerico tipo float");
		float valorfloat2 = sc.nextFloat();
		
		System.out.println("el resultado de la suma es: "+ (valorfloat1 + valorfloat2));
		System.out.println("El resultado de la resta es: "+ (valorfloat1 - valorfloat2));
		System.out.println("el resultado de la multiplicación es: "+ (valorfloat1 * valorfloat2));
		System.out.println("El resultado de la Division es: "+ (valorfloat1 / valorfloat2));
		
		//valores tipo short
		
		System.out.println("ingrese un valor numerico tipo short");
		short valorshort1 = sc.nextShort();
		
		System.out.println("Ingrese otro valor numerico tipo short");
		short valorshort2 = sc.nextShort();
		
		System.out.println("el resultado de la suma es: "+ (valorshort1 + valorshort2));
		System.out.println("El resultado de la resta es: "+ (valorshort1 - valorshort2));
		System.out.println("el resultado de la multiplicación es: "+ (valorshort1 * valorshort2));
		System.out.println("El resultado de la Division es: "+ (valorshort1 / valorshort2));
		
		// valores tipo byte
		
		System.out.println("ingrese un valor numerico tipo byte");
		byte valorbyte1 = sc.nextByte();
		
		System.out.println("Ingrese otro valor numerico tipo byte");
		byte valorbyte2 = sc.nextByte();
		
		System.out.println("el resultado de la suma es: "+ (valorbyte1 + valorbyte2));
		System.out.println("El resultado de la resta es: "+ (valorbyte1 - valorbyte2));
		System.out.println("el resultado de la multiplicación es: "+ (valorbyte1 * valorbyte2));
		System.out.println("El resultado de la Division es: "+ (valorbyte1 / valorbyte2));
		
		System.out.println("Ejercicio 3");
	}
}
