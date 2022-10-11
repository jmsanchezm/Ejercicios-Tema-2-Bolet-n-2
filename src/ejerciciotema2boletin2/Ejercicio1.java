package ejerciciotema2boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaramos la veriable.
		int nota ;//Se guardará la nota introducido por el usuario.
		//Creamos el Scanner
		Scanner read = new Scanner (System.in);
		//Solicitamos al usuario la nota sin decimales.
		System.out.print("Introduzca la nota del alumno sin decimales: ");
		//Ordenamos al Scanner que lea lo introducido por el usuario
		nota=read.nextInt();
		//Utilizamos un switch
		switch (nota){
			//Para los casos en los que el valor entre 0 y 4, se le mostrará INSUFICIENTE al usuario.
			case 0,1,2,3,4 :
				System.out.println("INSUFICIENTE");
				break;
			//Para el caso 5, se le mostrará SUFICIENTE.
			case 5: 
				System.out.println("SUFICIENTE");
				break;
			//Para el caso 6, se le mostrará BIEN.
			case 6:
				System.out.println("BIEN");
				break;
			//Para los casos 7 y 8, se le mostrará NOTABLE.
			case 7,8:
				System.out.println("NOTABLE");
				break;
			//Para los casos 9 y 10, se le mostrará SOBRESALIENTE.
			case 9,10:
				System.out.println("SOBRESALIENTE");
				break;
			//Para lo casos en los que en usuario introduzca un valor erróneo, se le mostrará ERROR
			default:
				System.out.println("ERROR");
		}	
		//Finalmente, cerramos el Scanner.
			read.close();
	}

}
