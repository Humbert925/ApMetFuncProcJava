
public class Principal {
	//usar static acá 
	static int numerador=10;
	static Integer denominador=2;
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
		}catch(NullPointerException ex) {
			division =0;
			System.out.println("Error: " + ex.getMessage());
			System.out.println("Segundo catch");
		}finally {
			System.out.println("Después de la división");
		}
	}
}
/*Dentro de esos parentesis, 
 * sí se usa Exception captará todos los errores
 * ArithmeticException ex iba dentro del catch*/