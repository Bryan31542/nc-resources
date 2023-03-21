
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex04 {

	public static void main(String[] args) {
		
		// Streams
		System.out.println("------------ Manejo de Streams ------------");

		List<Integer> numbersIntegers = new ArrayList<>();
		Collections.addAll(numbersIntegers, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		System.out.println(numbersIntegers);
		
		System.out.println("------------ Manejo de forEach ------------");
		numbersIntegers.stream()
			.forEach((number) -> {
				System.out.println("forEach: " + number);
				
			});
		
		System.out.println("------------ Manejo de Map ------------");
		
		List<Integer> doublesIntegers = numbersIntegers.stream()
				.map(num -> num * 2).collect(Collectors.toList());
		
		System.out.println(doublesIntegers);
		
		List<Persona> people = new ArrayList<>();
		people.add(new Persona());
		people.add(new Persona());
		people.add(new Persona());
		
		Iterator<Persona> peronaIterator = people.iterator();
		
		while(peronaIterator.hasNext()) {
			Persona persona = peronaIterator.next();
			System.out.println(persona);
		}
			
	}

}
