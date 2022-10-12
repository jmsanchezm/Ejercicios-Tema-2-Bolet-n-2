package ejerciciotema2boletin2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaramos variables, donde se guardará lo introducido.
		String tipo;
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario su tipo de carnet.
		System.out.print("Introduzca el tipo de carnet: ");
		//Ordenamos al Scanner leer el teclado.
		tipo=read.nextLine();
		//Utilizamos un switch
		switch (tipo) {
		//Dependiendo de lo que introduzca el usuario, se le mostrará en pantalla una cosa u otra.
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
		//En el caso de que introduzca un dato diferente, se le mostrará error.
		default: 
			System.out.println("Categoría no contemplada");
		}
		//Finalmente cerramos el Scanner.
		read.close();
	}

}
