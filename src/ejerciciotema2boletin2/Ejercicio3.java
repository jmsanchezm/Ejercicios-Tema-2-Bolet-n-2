package ejerciciotema2boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int a,b,c,d,e,f;
		String result;
		Scanner read=new Scanner (System.in);
		System.out.println("Introduzca un número: ");
		a = read.nextInt();
		System.out.println("Introduzca otro número: ");
		b=read.nextInt();
		System.out.println("ELIGE UNA OPCIÓN:SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN.");
		result = read.next();
		switch (result) {
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
			default:
				System.out.println("ESA OPCIÓN NO ES VÁLIDA.");
		}
		read.close();
	}

}
