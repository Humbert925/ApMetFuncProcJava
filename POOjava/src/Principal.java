import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Menu cajero. 
		 * 1. Retiro
		 * 2. Dep�sito
		 * 3. Imprimir saldo
		 * 4. Estado de cuenta
		 * 5. Agregar beneficiario
		 * 6. Salir
		 * */
		
		CuentaBancaria cuenta_personal =new CuentaBancaria("Humbert", 0.00f);
		
		int option = 0;
		
		do {
			Scanner leer = new Scanner (System.in);
			
			//imprime menu
			System.out.println("Men� cuenta bancaria");
			System.out.println("Ingresa la opci�n deseada");
			System.out.println("1. Retiro");
			System.out.println("2. Dep�sito");
			System.out.println("3. Imprimir saldo");
			System.out.println("4. Estado de cuenta");
			System.out.println("5. Agregar beneficiario(proximamente)");
			System.out.println("6. Salir");
			
			option = leer.nextInt();
			
			switch(option) {
				case 1: 
					System.out.println("Ingrese la cantidad que desea retirar");
					float monto = leer.nextFloat();
					cuenta_personal.retiros(monto);
					System.out.println("*************************************");
					break;
					
				case 2: 
					System.out.println("Ingrese la cantidad que desea depositar");
					float deposito = leer.nextFloat();
					cuenta_personal.depositos(deposito);
					System.out.println("*************************************");
					break;
					
				case 3:
					System.out.println("El monto total de su saldo es: " 
				+ cuenta_personal.consultarSaldo());
					System.out.println("*************************************");
					break;
					
				case 4:
					System.out.printf("Sus movimientos son los siguientes: "+ 
				"Retiros: " +  
				"Dep�sitos: "+  
				"Balance: "   );		
					System.out.println("*************************************");
					break;
					
				case 5: 
					System.out.println("Ingrese el nombre del beneficiario");
					String nombre = leer.nextLine();
					cuenta_personal.beneficiario = nombre; 
					System.out.println("*************************************");
					break;
					
				
		} 
		}while (option!=6);
			
		}
		
		/*
		CuentaBancaria cuenta_personal =new CuentaBancaria();
		cuenta_personal.beneficiario="Humberto Morales";
		
		System.out.println("Ingresa un monto a depositar");
		Scanner leer =new Scanner(System.in);
		float deposito= leer.nextFloat();
		
		
		System.out.println("Ingresa un monto a retirar");
		float retiro = leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.printf("Tu saldo actual es %.2f ", cuenta_personal.consultarSaldo());
		
		System.out.println(cuenta_personal.beneficiario);
		
		CuentaBancaria cuenta_David = new CuentaBancaria();
		cuenta_David.beneficiario = "David Carrillo";
		System.out.println(cuenta_David.beneficiario); */
		
		//cuenta_personal; 

	}


