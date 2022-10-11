package ejerciciotema2boletin2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		int dia;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduzca el día de la semana por su número: ");
		dia =read.nextInt();
		switch (dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIÉRCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SÁBADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			System.out.println("ERROR");
		}
		read.close();
	}

}
