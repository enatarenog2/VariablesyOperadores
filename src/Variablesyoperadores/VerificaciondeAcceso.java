package Variablesyoperadores;

import java.util.Scanner;

public class VerificaciondeAcceso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final String usuarioCorrecto = "Usuario1";
		final String contraseñaCorrecta = "12345";
		
		System.out.println("Ingrese su nombre de usuario: ");
		String nombreUsuario = sc.nextLine();
		
		System.out.println("Ingrese su Contraseña: ");
		String contraseña = sc.nextLine();
		
		if (nombreUsuario.equals(usuarioCorrecto) && contraseña.equals(contraseñaCorrecta)) {
            System.out.println("Acceso concedido");
            //el .equals sirve para comparar dos valores logicos
        }
		else if (nombreUsuario.equals(usuarioCorrecto) && !contraseña.equals(contraseñaCorrecta)) {
            System.out.println("Contraseña incorrecta");
        }
		else {
			System.out.println("Usuario no resgistrado.");
		}

	}
}