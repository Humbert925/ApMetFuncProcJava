import java.util.Scanner;

import javax.swing.JOptionPane;

public class FlujoSwitch {
	public static void main (String[]args) {
		//TODO Auto-generated method stub
		
		/*
		 * Switch es una palabra reservada y dentro van unas llaves como sigue:
		 Switch (condici�n){
		 		case valor 1: 
		 		 	code
		 		 	code
		 		 	code
		 		 	break; 
		 		case valor 2: 
		 		 	code
		 		 	code
		 		 	code
		 		 	break;
		 		default:
		 			code per default
		 		 	};
		 El siguiente ejemplo muestra c�mo se estructuran los casos. 
		 Se pueden usar numeros y letras pero a partir del Java 7 las letras
		 * */
		/*int dia =1;
		String mensaje= "";
		
		switch(dia) {
		case 1: 
			mensaje="Lunes";
			break;
		case 2: 
			mensaje="Martes";
			break;
		case 3: 
			mensaje="Miercoles";
			break;
		case 4: 
			mensaje="Jueves";
			break;
		case 5: 
			mensaje="Viernes";
			break;
		case 6: 
			mensaje="Sabado";
			break;
		case 7: 
			mensaje="Domingo";
			break;
		default:
			mensaje = "D�a inv�lido";
			break;
		}
		System.out.println(mensaje);*/
	
		/*
		 *Crear una calculadora que pueda sumar, restar, multiplicar y dividir 2 numeros.
		 *La calcu debe pedir los 2 numeros y posterior a eso preguntar la operacion que
		 *se quiere realizar, el menu es el siguiente;
		 *1. Suma
		 *2. Resta
		 *3. Multiplicaci�n
		 *4. Divisi�n
		 *
		 *al final debe mostrar los resultados de la operacion que se realiz�.
		 *
		 *Suma =10;
		 *Nota: debes usar switch
		 * */
		
		/*int numero1 =();
		String mensaje= "Ingresa un numero";
		int numero2 =();
		String mensaje= "Ingresa otro numero";
		
		switch(operaci�n) {
		case 0:
			mensaje="suma";
			break;
		case 1:
			mensaje="resta";
			break;
		case 2:
			mensaje="multiplicacion";
			break;
		case 3:
			mensaje="divisi�n";
			break;
		default:
			mensaje= "operaci�n inv�lida";
			break;
		}
		System.out.println(mensaje); */
		
		
		/*Scanner intruduce = new Scanner (System.in);
		System.out.println("Elige un opci�n: \n1: suma \n2: resta \n3: multiplicacion \n4: division");
		int operation = intruduce.nextInt();
		switch (operation) {
		case 1: //suma
			float suma1 =Float.parseFloat(JOptionPane.showInputDialog("Intruduce un numero"));
			float suma2 =Float.parseFloat(JOptionPane.showInputDialog("Introduce otro n�mero"));
			float sumatotal = suma1 + suma2;
			
			System.out.println("La suma de " + suma1 + "+" + suma2 + "es igual a:"+ sumatotal);
			break;
		case 2: //resta
			float resta1 =Float.parseFloat(JOptionPane.showInputDialog("Intruduce un numero"));
			float resta2 =Float.parseFloat(JOptionPane.showInputDialog("Introduce otro n�mero"));
			float restatotal = resta1 - resta2;
			
			System.out.println("La resta de " + resta1 + "+" + resta2 + "es igual a:"+ restatotal);
			break;
		case 3: //mult
			float mult1 =Float.parseFloat(JOptionPane.showInputDialog("Intruduce un numero"));
			float mult2 =Float.parseFloat(JOptionPane.showInputDialog("Introduce otro n�mero"));
			float multtotal = mult1 * mult2;
			
			System.out.println("La multiplicacion de " + mult1 + "+" + mult2 + "es igual a:"+ multtotal);
			break;
		case 4: //division
			float div1 =Float.parseFloat(JOptionPane.showInputDialog("Intruduce un numero"));
			float div2 =Float.parseFloat(JOptionPane.showInputDialog("Introduce otro n�mero"));
			float divtotal = div1 / div2;
			
			System.out.println("La divicion de " + div1 + "+" + div2 + "es igual a:"+ divtotal);
			break;
			default:
			System.out.println("intenta de nuevo un n�mero del 1 al 4");	
			//https://thehittoslab.blogspot.com/2019/05/condicionales-en-java-iii-el.html
			//https://www.youtube.com/watch?v=Fsv7siPYG8s (revisar y programar)
		}*/
	
		/*Crear un programa donde se introduzcan los tres �ngulos internos
		 *  de un tri�ngulo y se determine si el tri�ngulo es v�lido o no.
		 */
		
		Scanner lector = new Scanner(System.in);
		
		float anguloA, anguloB, anguloC;
		//
		System.out.println("Ingresa el primer angulo del triangulo:");
		anguloA =lector.nextFloat();
		System.out.println("Ingresa el segundo angulo del triangulo:");
		anguloB =lector.nextFloat();
		System.out.println("Ingresa el tercer angulo del triangulo:");
		anguloC =lector.nextFloat();
		
		float angTot=anguloA +anguloB + anguloC;
		
		if (angTot == 180){
		System.out.println("Los �ngulos corresponden a un tri�ngulo");}
		
		else {System.out.println("Los �ngulos internos no son de un triangulo");}
		
		
		
	
	}

}

