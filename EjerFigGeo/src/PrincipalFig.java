
public class PrincipalFig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area area = new Area();
		//para pedir datos es desde ac�, se usa
		
		Triangulo sup1 = new Triangulo ();
		Cuadrado sup2 = new Cuadrado ();
		Circulo sup3 = new Circulo ();
		
		System.out.println(sup1.areaT());
		System.out.println(sup2.areaC());
		System.out.println(sup3.areaCir());
	}

}

/*EJERCICIO CONSISTE EN: 
 * Crea una clase padre FigurasGeometricas con un m�todo calcular �rea.
 * Escribir 3 clases hijos que hereden de figuras geom�tricas, 
 * definir los atributos y m�todos necesarios para calcular el �rea, 
 * y al final crear objetos de esas 3 clases que sean capaces de
 *  calcular las respectivas areas
 */
