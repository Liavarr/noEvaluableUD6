package noEvaluableUD6;

import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		//Variables 7 declaracion de Scanner
		boolean condicion = true;
		int numAmigos = 0;
		Scanner sc = new Scanner(System.in);
		
		//Bucle para pedir el numero de amigos a añadir
		while (condicion) {
			System.out.println("Introduce un número de amigos del 1 al 6");
			numAmigos = sc.nextInt();
			if (numAmigos <= 0 || numAmigos >6) {
				System.out.println("Número no valido");
			} else {
				condicion = false;
			}
		}
		
		//Declaracion del Array 
		String[] amigo = new String[numAmigos];
		//Consumir el nextLine
		sc.nextLine();
		
		//Bucle para pedir los nombres
		for (int i = 0; i < amigo.length; i++) {
			System.out.println("Introduce el amigo numero: "+(i+1));
			amigo[i] = sc.nextLine();
		}
		
		//Bucle para mostrar los nombres
		for (int i = 0; i < amigo.length; i++) {
			System.out.println("El amigo numero "+(i+1)+" es "+amigo[i]);
		}
		//Cerrar el Scanner
		sc.close();
	}
}
