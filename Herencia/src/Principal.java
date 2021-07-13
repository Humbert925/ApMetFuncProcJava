
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal animal = new Animal();
		//System.out.println(animal.comer());
		
		Perro Ernesto = new Perro ();
		System.out.println(Ernesto.ladrar());
		System.out.println(Ernesto.comer());
		System.out.println("---------------------------------------");
		
		Gato Felix = new Gato();
		System.out.println(Felix.comer());
	}

}
