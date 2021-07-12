package Paquete1;

public class Persona_1 {
	String nombre = "";
	/*Modificador de acceso 'default', se puede acceder a los atributos
	 * y objetos dentro de mismo paquete*/
	
	private int edad = 0;
	/*Modificador de acceso privado, se puede acceder 
	 * sólo dentro de la misma clase*/
	
	protected String domicilio="";
	/*Modificador protected, se puede acceder 
	 * dentro de la misma clase y del mismo paquete*/
	public float estatura =0; 
	
	String saludar () {
		return "Hola, mi nombre es"+ this.nombre + 
				"mi edad es" + this.edad + this.domicilio +
				"mi estatura es" + this.estatura;
	
	}
}
