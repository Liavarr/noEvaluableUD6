package noEvaluableUD6;

import java.util.Scanner;

public class Ejercicio2 {
	public static void main(String[] args) {
		//Variables 7 declaracion de Scanner
		boolean condicion = true;
		int numAmigos = 0;
		boolean asistirCondicion = true;
		Scanner sc = new Scanner(System.in);
		
		//Bucle para pedir el numero de amigos a añadir
		while (condicion) {
			System.out.println("Introduce un número de amigos del 1 al 6:");
			numAmigos = sc.nextInt();
			if (numAmigos <= 0 || numAmigos >6) {
				System.out.println("Número no valido.");
			} else {
				condicion = false;
			}
		}
		
		//Declaracion del Array 
		Amigo[] amigo = new Amigo[numAmigos];
		//Consumir el nextLine
		sc.nextLine();
		
		//Bucle para pedir los nombres
		for (int i = 0; i < amigo.length; i++) {
			System.out.println("Introduce el amigo numero: "+(i+1));
			System.out.println("Nombre: ");
			String nombre = sc.nextLine();
			System.out.println("Número: ");
			int numero = sc.nextInt();
			sc.nextLine();
			boolean asistir = true;
			while (asistirCondicion) {
				System.out.println("¿Asistirá? (Introduzca Si o No)");
				String asistira = sc.nextLine();
				asistira = asistira.toLowerCase();
				if ("si".equals(asistira)) {
					asistir = true;
					asistirCondicion = false;
				} else if("no".equals(asistira)){
					asistir = false;
					asistirCondicion = false;
				} else {
					System.out.println("Valor no válido");
				}
			}
			amigo[i] = new Amigo(nombre, numero, asistir);
			asistirCondicion = true;
		}
		
		//Bucle para mostrar los nombres
		for (int i = 0; i < amigo.length; i++) {
			System.out.println("El amigo numero "+(i+1)+" es \n"+amigo[i].mostrarAmigo(amigo[i]));
			System.out.println("===============");
		}
		//Cerrar el Scanner
		sc.close();
	}
}
