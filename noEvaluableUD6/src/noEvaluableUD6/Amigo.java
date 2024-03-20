package noEvaluableUD6;

import noEvaluableUD6.Amigo;

public class Amigo {
	//Atributos
	String nombre;
	int numero;
	boolean asistir;
	
	//Constructores
	public Amigo() {
		
	}
	
	public Amigo(String nombre, int numero, boolean asistir) {
		this.nombre = nombre;
		this.numero = numero;
		this.asistir = asistir;
	}

	//Getters and Setters
	public String getNombre() {
		return nombre;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public boolean getAsistir() {
		return asistir;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAsistir(boolean asistir) {
		this.asistir = asistir;
	}
	
	public String mostrarAmigo(Amigo amigo) {
		String asistir;
		if (amigo.getAsistir()) {
			asistir = "Sí";
		} else {
			asistir = "No";
		}
		return "Nombre: "+amigo.getNombre()+"\nNúmero: "+amigo.getNumero()+"\n¿Asistirá a la fiesta?: "+asistir;
	}
	
}
