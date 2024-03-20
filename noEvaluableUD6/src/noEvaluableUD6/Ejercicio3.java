package noEvaluableUD6;

public class Ejercicio3 {
	public static void main(String[] args) {
		//Variables
		String texto = "Estos son pruebas de DAM";
		String texto2 = " para la asignatura de Programacion";
		int numero = 123;
		int indice = 0;
		
		//Mayusculas y minusculas:
		System.out.println("Este es el texto en Mayusculas: "+texto.toUpperCase());
		System.out.println("Este es el texto en minusculas: "+texto.toLowerCase());
		
		//Medidas
		System.out.println("Esta es la longitud del texto :"+texto.length());
		
		//Cambiar numeros a letras
		String str = String.valueOf(numero);
		System.out.println("Esta es una conversion del texto y el numero a solo caracter: "+texto+str);
		
		//Concatenar texto:
		String textoConcatenado = texto + texto2;
		System.out.println("Este es el texto concatenado: "+ textoConcatenado);
		
		//Texto a reemplazar
		String textoReemplazo = texto.replace("DAM", "DAW");
		System.out.println("Este es el texto cambiando DAM por DAW :"+textoReemplazo);
		
		//Comprobaciones boolean:
		System.out.println("¿La cadena contiene la palabra prueba? "+texto.contains("prueba"));
		System.out.println("¿La cadena está vacía? "+texto.isEmpty());
		System.out.println("¿La cadena está termina con el texto 'DAM'? "+texto.endsWith("DAM"));
		System.out.println("¿La primera cadena es la misma que la segunda? "+texto.equals(texto2));
		System.out.println("¿Cual es la diferencia léxica entre la primera y la segunda cadena? "+texto.compareTo(texto2));
		
		//Busqueda de letras concretas
		indice = texto.indexOf('o');
		System.out.println("La primera ocurrencia de 'o' está en la posición: " + indice);
		indice = texto.lastIndexOf('o');
		System.out.println("La última ocurrencia de 'o' está en la posición: " + indice);
		System.out.println("A partir de la 10ª letra tenemos: "+texto.substring(5));
	}
}
