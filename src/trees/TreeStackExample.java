package trees;

import java.util.*;

public class TreeStackExample {

	public static void main(String[] args) {
		System.out.println("Testing Stacks");
		System.out.println("==============\n\n");

		System.out.println("We form a stack of integers,");
		System.out.println(" and put 10, 20, 30, 40 in it.");

		Stack<Integer> numbers = new Stack<Integer>();
		numbers.push(10);
		numbers.push(20);
		numbers.push(30);
		numbers.push(40);

		System.out.println("We print the stack");
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println("numbers[" + i + "] = " + numbers.get(i));
		}

		// test pop
		System.out.println("\nWe pop the stack.");
		int out = numbers.pop();
		System.out.println("We popped " + out + ".");
		System.out.println("We print the stack.");
		// uses an iterator
		for (Integer cur : numbers) {
			System.out.println(cur);
		}

		// test peek
		System.out.println("\nWe peek at the stack.");
		out = numbers.peek();
		System.out.println("We peeked at " + out + ".");
		System.out.println("We print the stack.");
		// uses an iterator
		for (Integer cur : numbers) {
			System.out.println(cur);
		}

		/*
		 * does not work // check for concurrent modification exception
		 * System.out.println("\nWe try to push in an enhanced loop.");
		 * for(Integer cur: numbers) { try { System.out.println(cur); if
		 * (cur.equals(20)) numbers.push(50); } catch(Throwable e) {
		 * System.out.println("We got an exception.");
		 * 
		 * } }
		 */

		// test clear, empty, popping an empty stack
		System.out.println("\nWe empty the stack.");
		numbers.clear();

		if (numbers.empty()) {
			System.out.println("The stack is empty.");
		}

		System.out.println("We pop the stack.");
		try {
			out = numbers.pop();
		} catch (EmptyStackException e) {
			System.out.println("We get an exception.");
		}
	}
}
