package ejerciciotema2boletin2;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		//Declaramos variable para guardar lo introducido por el usuario.
		int dia;
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario un día de la semana.
		System.out.print("Introduzca el día de la semana por su número: ");
		//Ordenamos al Scanner leer el teclado.
		dia =read.nextInt();
		//Utilizamos un switch
		switch (dia) {
		//Dependiendo de lo que introduzca el usuario, se le mostrará en pantalla una cosa u otra.
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
		//En el caso de que introduzca un número mayor a 7, se le mostrará error.
		default:
			System.out.println("ERROR");
		}
		//Finalmente, cerramos el Scanner.
		read.close();
	}

}
