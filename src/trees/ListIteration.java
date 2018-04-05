package trees;

import java.util.*;

public class ListIteration {

	public static void main(String[] args) {
		System.out.println("Test java.util.ListIterator");
		System.out.println("===========================\n\n");

		System.out.println("Form the list Jim, McCoy, Spock, Sulu, Uhura.");
		LinkedList<String> profs = new LinkedList<String>();
		profs.add("Jim");
		profs.add("McCoy");
		profs.add("Spock");
		profs.add("Sulu");
		profs.add("Uhura");

		System.out.println("The list is ");
		printList(profs);

		// print the indices of each prof
		System.out.println("The index of each prof:");
		for (int i = 0; i < profs.size(); i++) {
			System.out.println("profs[" + i + "] = " + profs.get(i));
		}

		// Set a list iterator and check some of its methods
		System.out.println("We set the list iterator at index 2");
		ListIterator<String> it = profs.listIterator(2);
		it.add("Scotty the Chef");

		System.out.println("We add Scotty the Chef.\n\nThe list is ");
		printList(profs);
		// the last visited item was McCoy

		// Set a list iterator and check some of its methods
		System.out.println("\nWe set the list iterator at index 2, move back and remove.");
		it = profs.listIterator(2);
		String p = it.previous();
		System.out.println("We removed " + p + ".");
		it.remove();

		System.out.println("The list is ");
		printList(profs);

		System.out.println("\nWe set the list iterator at index 2, move forward and remove.");
		it = profs.listIterator(2);
		p = it.next();
		System.out.println("We removed " + p + ".");
		it.remove();

		System.out.println("The list is ");
		printList(profs);

	}

	public static <T> void printList(List<T> l) {
		if (l.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			for (T e : l) {
				System.out.println(e);
			}
		}
	}
}