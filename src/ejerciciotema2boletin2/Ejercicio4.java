package ejerciciotema2boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos variables para guardar lo introducido por el usuario
		String primeraTirada;
		String segundaTirada;
		
		int result;//Se guardará el resultado de la suma de los valores de las tiradas
		//Creamos el Scanner
		Scanner read= new Scanner (System.in);
		//Solicitamos al usuario el resultado de cada tirada.
		System.out.print("Introduzca el resultado de la primera tirada: UNO, DOS, TRES, CUATRO, CINCO, SEIS.");
		primeraTirada = read.next();
		System.out.print("Introduzca el resultado de la segunda tirada: UNO, DOS, TRES, CUATRO, CINCO, SEIS.");
		segundaTirada = read.next();
		//Utilizamos dos switch
		switch (primeraTirada) {
		//Dependiendo del valor introducido por el usuario se le mostrará un case determinado.
		case "UNO":
			System.out.println("1");
			break;
		case "DOS":
			System.out.println("2");
			break;
		case "TRES":
			System.out.println("3");
			break;
		case "CUATRO":
			System.out.println("4");
			break;
		case "CINCO":
			System.out.println("5");
			break;
		case "SEIS":
			System.out.println("6");
			break;
		default:
				System.out.println("Dato introducido no válido.");
		}

		switch (segundaTirada) {
		case "UNO":
			System.out.println("1");
			break;
		case "DOS":
			System.out.println("2");
			break;
		case "TRES":
			System.out.println("3");
			break;
		case "CUATRO":
			System.out.println("4");
			break;
		case "CINCO":
			System.out.println("5");
			break;
		case "SEIS":
			System.out.println("6");
			break;
		default:
			System.out.println("Dato introducido no válido.");
	}
		if (primeraTirada>=1 && primeraTirada<=6) {
			
		}
		
		switch (result) {}
	
		
	}

}
