package ejerciciotema2boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaramos vaiables, donde se guardará lo introducido por el usuario.
		int a,b,c,d,e,f;
		String result;
		//Creamos el Scanner
		Scanner read=new Scanner (System.in);
		//Solicitamos al usuario dos números
		System.out.println("Introduzca un número: ");
		a = read.nextInt();
		System.out.println("Introduzca otro número: ");
		b=read.nextInt();
		//Se le abrirá un menú y tendrá que elegir alguna de estas opciones.
		System.out.println("ELIGE UNA OPCIÓN:SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN.");
		result = read.next();
		//Utilizamos un switch
		switch (result) {
		//Dependiendo de la elección del usuario, hará cálculos diferentes, con sus correspondientes respuestas
		case "SUMA":
			System.out.println("La suma de los datos introducidos es " + (c = a + b) );
			break;
		case "RESTA":
			System.out.println("La resta de los datos introducidos es " + (d = a - b));
			break;
		case "MULTIPLICACIÓN":
			System.out.println("La multiplicación de los datos introducidos es " +(e = a * b));
			break;
		case "DIVISIÓN":
			System.out.println("La división de los datos introducidos es " + (f = a / b));
			break;
		//En el caso de la introducción de un dato erróneo, se le mostrrá error.
			default:
				System.out.println("ESA OPCIÓN NO ES VÁLIDA.");
		}
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}
