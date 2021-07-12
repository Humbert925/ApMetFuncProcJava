import java.util.Scanner;

public class Saludo {
	public static void main(String[]args) {
	Scanner leer= new Scanner(System.in);	
	System.out.println("¿Cuál es tu nombre?");
	String nombre = leer.nextLine();
	System.out.println(saludo(nombre));
	}
	
	public static String saludo(String saludo) {
	
		return "Hola," +" "+ saludo ;

}/*
public es un atributo para que puedan acceder a los datos de cualquier forma
private es más usado para contraseñas, solo dentro de la misma clase es reconocido
*/
}
