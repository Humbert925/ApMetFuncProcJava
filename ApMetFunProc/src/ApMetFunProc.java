import java.util.Scanner;
import javax.swing.JOptionPane;
public class ApMetFunProc {
	public static void main (String[]args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el primer numero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el segundo numero"));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tercer numero"));
					
			if(n1>n2 && n1>n3){
				JOptionPane.showMessageDialog(null, "El primer numero es mayor: "
						+n1, "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
				}else if (n2>n1 && n2>n3) {
					JOptionPane.showMessageDialog(null, "El segundo numero es mayor: "
							+n2, "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
					
				}else if (n3>n2 && n3>n1) {
					JOptionPane.showMessageDialog(null, "El tercer numero es mayor: "
							+n3, "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
					}
				else if (n3<=n2 || n3<=n1) {
					JOptionPane.showMessageDialog(null, "Hay 2 numeros mayores: "
							+n3, "Informaci�n", JOptionPane.INFORMATION_MESSAGE);
				}else {
						JOptionPane.showMessageDialog(null, "Los numeros son iguales: ");
					}
			
		}

}

/*Debe dise�ar un programa que reciba 3 n�meros por consola y determine cual de los 3 n�meros es el mayor.
Plus: Imprimir los n�meros ordenados de mayor a menor.
Plus: Imprimir los n�meros ordenados de menor a mayor.
// referencia: https://www.youtube.com/watch?v=6k2f5IihCwA
//			   https://www.programarya.com/Cursos/Java/Funciones

			
*/