package org.iesalandalus.programacion.reservasaulas.mvc.modelo.dominio;

public enum Tramo {
	MANANA("Mañana"), TARDE("Tarde");
	
	private String cadenaAMostrar;

	private Tramo(String cadenaAMostrar) {
		this.cadenaAMostrar=cadenaAMostrar;
	}
	
	public String toString() {
		return this.cadenaAMostrar;
	}
}
