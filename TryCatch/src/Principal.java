
public class Principal {
	//usar static ac� 
	static int numerador=10;
	static Integer denominador=2;
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
		}catch(NullPointerException ex) {
			division =0;
			System.out.println("Error: " + ex.getMessage());
			System.out.println("Segundo catch");
		}finally {
			System.out.println("Despu�s de la divisi�n");
		}
	}
}
/*Dentro de esos parentesis, 
 * s� se usa Exception captar� todos los errores
 * ArithmeticException ex iba dentro del catch*/