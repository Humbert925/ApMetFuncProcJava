import java.util.Scanner;

import javax.swing.JOptionPane;

public class CiclosJava {
	
	public static void main (String[]args) {
		//TODO Auto-generated method stub
		/*
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);*/
		
		// o puedes usar un ciclo for
		/*
		 Ciclo "for"
		 for (variable de inicializaci?n; variable de inicializaci?n < 10;
		 variable ++);
		  */
		/*for (int i=0; i<=5; i++) {
			System.out.println(i+1);
		}*/
		
		/*Existen diferentes m?todos de llegar al mismo resultado de impresion. 
		 * 1. Dar un valor inicial de 1, que la cond. sea <=5 e imprima i;
		 * 2. Dar un valor inicial de 0, que la cond. sea <5 e imprima i+1
		 * 3. dar un valor inicial de 0, que la cond. sea <=5 e imprima i, 
		 * con est? ?ltima s?lo cambia la numeraci?n desde cero*/
	/*Crear un metodo que reciba por parametro un n?mero y nos muestre la 
	* tabla de multiplicar de ese n?mero
*/
		/*Scanner ni = new Scanner(System.in);
		System.out.println("Ingresa un n?mero:");
		float n = ni.nextFloat();
		
		for (float i=1; i<=10; i++) {
		System.out.println(i*n);*/
		
		/*
		Scanner numero =new Scanner (System.in);
		System.out.println("Elije un numero");
		float num = numero.nextFloat();
		multiplicar (int)};
		  		  
		public static void mult (int num){
		  
		for (float i=1; i<=10; i++){
		System.out.println(num + "x" + i + "=" + (i*num));
		 }*/ 
		
		/*EJERCICIO
		 * hacer un ejercicio que pida un numero y de la suma de sus 
		 * numeros pares e impares*/
		
		/*
		int numero=0;
		int par = 0;
		int impar = 0;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));
		
		for(int i= 1; i<=numero; i++){
			if (i %2 ==0) {
				par = par + i ;
			} else {
				impar = impar + i;
		
		}};
		System.out.println
		("Tu numero es" + numero+ "y la suma de los pares es:" + par );
		System.out.println
		("Tu numero es" + numero+ "y la suma de los impares es:" + impar );
			
		};*/
/*lo que modifiqu? fue la condicion del if, cambiando numero por i, 
 * esto se debe a que estaba planteando una condicion que no correspond?a
 * pues se ejecutaba sobre una varible diferente. 
 * Contribuci?n para resolver de: ClaraI. y C?sar */
		
	
		
			
		/*
		 Ciclo while
		 while (condition){
		 code
		 code
		 code
		 }
		 
		 Escribir un programa que pida 2 numeros por consola de manera reiterada.
		 La ejecuci?n del programa termina cuando los numeros ingresados sean 
		 iguales
		 1
		 Nota: utilizar un ciclo while
		 
		 */
		
		/*Idea 1
		 * Scanner reader = new Scanner(System.in);
		int numero1 = 0;
		numero1 = reader.nextInt();		
		int numero2 = 0;
		numero2 = reader.nextInt();	
		
		while (numero1!= numero2) {
			
		}*/
		
		/* Idea 2 -funciona-
		Scanner numero = new Scanner (System.in);
		int num1 =0, num2 =1;
		
		 while (num1!=num2){
			System.out.println("Type a number:");
			num1=numero.nextInt();
			System.out.println("Type another number:");
			num2=numero.nextInt();
		} 
		 System.out.println("Please wait, loading...");*/
		
		/*
		  do {
		  code
		  code
		  code
		  num1 = lo que lea el scanner
		  num1 = lo que lea el scanner
		  while()
		  }
		  */
		/*Scanner numero = new Scanner (System.in);
		int num1 =0, num2 =1;
		
		do {
			System.out.println("Type a number:");
			num1=numero.nextInt();
			System.out.println("Type another number:");
			num2=numero.nextInt();
		}while (num1!=num2); 
		numero.close()
		//con "close" ya no se leen datos desde consola, delimita los datos de entrada 
		
		 System.out.println("Please wait, loading...");*/
		 //referencias 
		 //https://www.youtube.com/watch?v=fCjjRxjLbdk
		 //https://www.youtube.com/watch?v=PzytyVu0U1A
		 //https://www.youtube.com/watch?v=lr5vi6tct5w
		 
		}}
	 
		
	
	
	
	

