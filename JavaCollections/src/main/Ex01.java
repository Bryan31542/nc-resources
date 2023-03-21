package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("------------ Manejo de Listas ------------");
		
		List<Integer> numbers = new ArrayList<>();
		
		 numbers.add(1);
		 numbers.add(4);
		 numbers.add(6);
		 numbers.add(11);
		 numbers.add(15);
		 numbers.add(17);
		
		System.out.println(numbers);
		
		 // numbers.remove(0);
		
		System.out.println("------------");
		
		for (int i = 0; i < numbers.size(); i++) {
			int value = numbers.get(i);
			System.out.println("Valor " + i + ": " + value);
		}
		
		System.out.println("------------");
		
		Iterator<Integer> listIterator = numbers.iterator();
		
		// iterator design pattern
		while (listIterator.hasNext()) {
			// works as a pointer, gets the elements and pass to the next
			int value = listIterator.next(); 
			
			// obtains the value and then pass to the next position if there is
			System.out.println("Valor :" + value);
		}
		
		// stack implementation 
		System.out.println("------------ Manejo de Stacks ------------");
		
		// is we use List we will not be able to use push() and pop() because the parent
		// does not know the son's methods
		
		// List<Integer> numbersStackIntegers = new Stack<>();
		Stack<Integer> numbersStackIntegers = new Stack<>();
		
		// List is an interface that can we can not instance
		
		numbersStackIntegers.push(1);
		numbersStackIntegers.push(3);
		numbersStackIntegers.push(14);
		numbersStackIntegers.push(19);
		numbersStackIntegers.push(21);
		
		System.out.println(numbersStackIntegers);
		
		System.out.println("------------");
		
		Iterator<Integer> stackIterator = numbersStackIntegers.iterator();
		
		while (stackIterator.hasNext()) {
			int value = numbersStackIntegers.pop();
			System.out.println("Value: " + value);
			System.out.println(numbersStackIntegers);
			
		}
		
		// Sets do now allow duplicate elements
		
		
	}
}