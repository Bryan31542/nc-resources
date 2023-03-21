package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Ex03 {

	public static void main(String[] args) {
		
		// Maps
		System.out.println("------------ Manejo de Maps ------------");

		// Map<Type, Type>
		// Map<Character, String> map = new HashMap<>();
		Map<Character, String> map = new TreeMap<>();
		
		map.put('a', "Valor 01");
		map.put('b', "Valor 02");
		map.put('x', "Valor 03");
		map.put('h', "Valor 04");
		map.put('t', "Valor 05");
		map.put('e', "Valor 06");
		
		// does not follow an order
		System.out.println(map);
		
		// TreeMap sort the information according to the key
		System.out.println("Valor a: " + map.get('a'));
	
		Iterator<Character> keysIterator = map.keySet().iterator();
		
		while (keysIterator.hasNext()) {
			String valueString = map.get(keysIterator.next());
			
			System.out.println("Valor: " + valueString);
		}
		
		// Lambdas - anonymous functions 
		
		// Streams
		// functional methods to manipulate collections
		// from one collection gets all the information and convert it to an object to make
		// functional logic
	}

}
