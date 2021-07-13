
public class Principal {
	//usar static acá 
	static int numerador=0;
	static int denominador=10;
	static float division;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sin static aquí
		
		System.out.println("Antes de la división");
		try {
			division = numerador/ denominador;
		}catch(ArithmeticException ex) {
			division =0;
			System.out.println("Error: " + ex.getMessage());
		}
		
		
		System.out.println("Después de la división");
	
	}
}
