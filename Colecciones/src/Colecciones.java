import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Set; 
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Colecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*La coleeccion Set no puede contener elementos duplicados
		 * s?lo tiene los metodos "heredados" de Collection
		 * Existen difrerentes tipos de implementaciones
		 * 
		 * HashSet: Esta implementaci?n almacena los elementos en una tabla hash.
		 * Es la que mejor rendimeinto tiene. 
		 * Los elementos no tienen un orden.*/
		
		/*Set<String> frutas = new LinkedHashSet();
		frutas.add("Manzana");
		frutas.add("Mango");
		frutas.add("Durazno");
		frutas.add("Kiwi");
		frutas.add("Pera");
		frutas.add("Pi?a");
		frutas.add("Cereza");
		frutas.add("Fresa");
		frutas.add("Mandarina");
		frutas.add("Naranja");
		frutas.add("Maracuy?");
		frutas.add("Carambola");
		frutas.add("Granada");
		frutas.add("Mel?n");
		frutas.add("Sand?a");
		frutas.add("Platano");
		frutas.add("Zarzamora");
		frutas.add("Mamey");
		frutas.add("Guayaba");
		frutas.add("Zapote Negro");
		
		for (String fruta: frutas) {
			System.out.println(fruta);
		}*/
		
		/*System.out.println(frutas.contains("Aguacate"));*/
		
		/*usar "HashSet" muestra los resultados desordenados, tiene que ver con 
		como trbaja la m?quina y su memoria.
		
		Usar "TreeSet" ordena alfab?ticamente si son strings o numericamente s? 
		las variables son numeros.
		
		Usar "LinkedHashSet" muestra la lista como se registraron los datos.
		 	**Para usar cada uno de esos comandos, 
		 	  debes importar, java.util."method" **
		*/
		
		/*La interfaz List define 
		   
		   Acceso posicional a elementos: manipula elementos en funci?n 
		   de su posici?n en la lista.
		   
		   B?squeda de elementos: busca un elemento concreto de la lista 
		   y devuelve su posici?n.
		   
		   Rango de operaci?n: permite realizar ciertas operaciones 
		   sobre ragos de elementos dentro de la propia lista.
*/
		/*
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Manzana");
		frutas2.add("Mango");
		frutas2.add("Durazno");
		frutas2.add("Kiwi");
		frutas2.add("Pera");
		frutas2.add("Pi?a");
		frutas2.add("Cereza");
		frutas2.add("Fresa");
		frutas2.add("Mandarina");
		frutas2.add("Naranja");
		frutas2.add("Maracuy?");
		frutas2.add("Carambola");
		frutas2.add("Granada");
		frutas2.add("Mel?n");
		frutas2.add("Mel?n");
		frutas2.add("Sand?a");
		frutas2.add("Platano");
		frutas2.add("Zarzamora");
		frutas2.add("Mamey");
		frutas2.add("Guayaba");
		frutas2.add("Zapote Negro");
		
		for (String f: frutas2) {
			System.out.println(f);
			
			int pera = frutas2.indexOf("Pera");
			System.out.println(pera);
			System.out.println(frutas2.get(pera));
			
			/*
			 int dato primitivo
			 Integer es un objeto*/
			/*
			List<Integer> agenda = new ArrayList<Integer>();
			agenda.add(123);
			agenda.add(456);
			agenda.add(789);
			
			for(Integer a: agenda) {
				System.out.println(a);
			}*/
		
	
		//LinkedList
		/*List<String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		for(String an: animales) {
			System.out.println(an);
		}*/
		
		/*
		 * La interfaz MAP asocia claves a valores. 
		 * No puede contener claves duplicadas y 
		 * cada clave s?lo puede tener asociado un valor
		 * 
		 * Implementaciones
		 * HashMap
		 * TreeMap
		 * LinkedHashMap
		 * 
		 * Map a veces es usado como diccionario
		 * */
		
		
		/*HashMap; es la implementaci?n con mejor rendimiento pero, 
		 * no garantiza ingun orden a la hora de realizar iteraciones*/
		/*
		Map <String,String> diccionario= new HashMap();
		//diccionario.put(clave, valor)
		diccionario.put("elemento1", "Nombre1");
		diccionario.put("telefono", "121212");
		diccionario.put("llave", "werwer");
		
		System.out.print(diccionario.get("elemento1"));
		
		for(Map.Entry<String, String> entry: diccionario.entrySet()) {
			
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		};*/
		
		
		/*---------------------------------------------------------------------------*/
		/*TreeMap; Ordena los elementos de menor a hayor dependiendo de las claves*/
		/*
		Map <String,String> diccionario2= new TreeMap();
		//diccionario.put(clave, valor)
		diccionario2.put("elemento1", "Nombre1");
		diccionario2.put("telefono", "121212");
		diccionario2.put("llave", "werwer");
		
		System.out.print(diccionario2.get("elemento1"));
		
		for(Map.Entry<String, String> entry: diccionario2.entrySet()) {
			
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		};*/
		
		/*LinkedHashMap; */
		
		Map <String,String> diccionario3= new LinkedHashMap();
		//diccionario.put(clave, valor)
		diccionario3.put("elemento1", "Nombre1");
		diccionario3.put("telefono", "121212");
		diccionario3.put("llave", "werwer");
		
		System.out.print(diccionario3.get("elemento1"));
		
		for(Map.Entry<String, String> entry: diccionario3.entrySet()) {
			
			System.out.println(entry.getKey()+ ":" + entry.getValue());
		};
	 }
	}
		
	


