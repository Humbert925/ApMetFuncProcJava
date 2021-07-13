
public class Perro extends Animal{
	
	String raza= "";
	String color= "";
	float peso= 0;

	
	public String ladrar () {
		return "gruaf";
	}
	
	@Override
	// Muestra el polimorfismo sobre el método
	public String comer() {
		return "comiendo croquedas";
	}
	
	
	

}
