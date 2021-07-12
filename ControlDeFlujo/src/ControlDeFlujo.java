import java.util.Scanner;

public class ControlDeFlujo {
	public static void main(String[]args) {/*{
		//TODO Auto-generated method stub
	
		Scanner leerEdad = new Scanner(System.in);
		System.out.println("Ingresa tu edad");
		int edad= leerEdad.nextInt();
		String mensaje = votar(edad);
		
		System.out.println(mensaje);
	}
	
	public static String votar (int edad) {
		String mensaje= "";
		if (edad >=18) {
			mensaje= "Felicidades, puedes votar";			
		} else {
			mensaje ="No puedes votar...ha-ha. Come frutas y verduras ;) ";
		}
		return mensaje;
	}*/
	/*
	Escribir un programa que pida el nombre y la edad de un participante
	si la edad es mayor o igual a 18 y menor o igual a 29, mostrar un
	mensaje que diga "Felicidades + nombreIngresado, estas aceptado en
	el programa de generation Java Full Stack".
	En caso de no cumplirse la condición, mostrar un mensaje que diga
	"No cumples lo requisitos para el bootcamp Java Full Stack
 
	 */
	Scanner readName = new Scanner (System.in);
	Scanner readAge = new Scanner (System.in);
	System.out.println("Ingresa tu nombre y edad");
	String name = readName.next();
	int age = readAge.nextInt();
	//acá es donde se colocan las variables 
	String mensaje = aceptar(age, name);
	
	System.out.println(mensaje);
	
	}
	//aqui se ponen los tipos de datos y luego la variable
	public static String aceptar (int age, String name) {
		String mensaje="";
		if (age>=18 && age<=29) {
			mensaje="Felicidades" + name + "estas aceptado en el programa de generation Java Full Stack";
		} else {
			mensaje = "No cumples lo requisitos para el bootcamp Java Full Stack :( ";
		}return mensaje;
	}
	
}
	

	/*
		 * if(condition[que se evalua]) si se cumple[ejecuta, sino sigue iterando] {
		 * codigo
		 * codigo
		 * codigo}
		 * 
		 * -------------------------------------------------------
		 * 
		 * "si no se cumple la condicion se ejecuta el else"
		 * if (condition) si se cumple {
		 * codigo
		 * codigo
		 * codigo
		 * }else {
		 * 	codigo
		 * 	codigo
		 * 	codigo}
		 * 
		 * -------------------------------------------------------
		 * if (condition) si se cumple {
		 * codigo
		 * codigo
		 * codigo
		 * }else if (condition) si se cumple {
		 * 	codigo
		 * 	codigo
		 * 	codigo} else if (condition) si se cumple {
		 * 
		 * 		}else {}"cuando no se cumple ninguna condicion"
		 * 
		 *INDICACIONES
		 *Se lee la edad del usuario por consola, sí la edad es
		 *mayor a 18 años, se muestra un mensaje al usuario que 
		 *puede votar, en caso contrario se mostrara un mensaje 
		 *incidando que no puede votar
		 * 
		 * */