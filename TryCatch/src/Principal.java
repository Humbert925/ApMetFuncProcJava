
public class Principal {
	//usar static ac� 
	static int numerador=0;
	static int denominador=10;
	static float division;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sin static aqu�
		
		System.out.println("Antes de la divisi�n");
		try {
			division = numerador/ denominador;
		}catch(ArithmeticException ex) {
			division =0;
			System.out.println("Error: " + ex.getMessage());
		}
		
		
		System.out.println("Despu�s de la divisi�n");
	
	}
}
