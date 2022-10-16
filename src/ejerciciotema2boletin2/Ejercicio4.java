package ejerciciotema2boletin2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaramos variables para guardar lo introducido por el usuario
		String primeraTirada;
		String segundaTirada;
		int tirada1=0;
		int tirada2=0;
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
			tirada1 = 1;
			break;
		case "DOS":
			tirada1 = 2 ;
			break;
		case "TRES":
			tirada1 = 3 ;
			break;
		case "CUATRO":
			tirada1 = 4 ;
			break;
		case "CINCO":
			tirada1 = 5 ;
			break;
		case "SEIS":
			tirada1 = 6 ;
			break;
		default:
				System.out.println("Dato introducido no válido.");
		}

		switch (segundaTirada) {
		case "UNO":
			tirada2 = 1;
			break;
		case "DOS":
			tirada2 = 2;
			break;
		case "TRES":
			tirada2 = 3;
			break;
		case "CUATRO":
			tirada2 = 4;
			break;
		case "CINCO":
			tirada2 = 5;
			break;
		case "SEIS":
			tirada2 = 6;
			break;
		default:
			System.out.println("Dato introducido no válido.");
	}
		/*Utilizamos un if para en el caso en el que los datos introducidos 
		sean erróneos, no se muestre la suma.*/
		if (tirada1>0 && tirada2>0) {
			System.out.println("La suma de las dos tiradas es " + ( tirada1 + tirada2 ));
		}else {
			System.out.println("Debido a los datos erróneos, no se puede efectuar la suma se las tiradas.");
		}
		//Finalmente, cerramos el Scanner
		read.close();
		
	}

}
