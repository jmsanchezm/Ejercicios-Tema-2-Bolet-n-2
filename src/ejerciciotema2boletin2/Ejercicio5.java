package ejerciciotema2boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String tipo;
		Scanner read = new Scanner (System.in);
		System.out.print("Introduzca el tipo de carnet: ");
		tipo=read.nextLine();
		switch (tipo) {
		case "E":
			System.out.println("El carnet es para remolques");
			break;
		case "D":
			System.out.println("El carnet es para autobuses");
			break;
		case "C1","C2","C3","C4","C5":
			System.out.println("EL carnet es para camiones.");
			break;
		case "A":
			System.out.println("El carnet es para motocicletas.");
			break;
		case "B1","B2":
			System.out.println("El carnet es para automóviles");
			break;
		default: 
			System.out.println("Categoría no contemplada");
		}
		read.close();
	}

}
