package trees;

import java.util.TreeSet;
import java.util.HashSet;

public class TreeSetExample {

	public static void main(String[] args) {
		System.out.println("Testing TreeSet and HashSet");
		System.out.println("===========================\n\n");

		System.out.println("We form a tree with the names:\nJim, Spock, Christine, Scotty, Uhura, Chekov, Bones");

		TreeSet<String> names = new TreeSet<String>();
		names.add("Jim");
		names.add("Spock");
		names.add("Christine");
		names.add("Scotty");
		names.add("Uhura");
		names.add("Chekov");
		names.add("Bones");

		// get(i) does not work for this class
		System.out.println("\nPrint the set.");
		for (String n : names) {
			System.out.println(n);
		}

		// We try to add Uhura
		System.out.println("\nWe try to add Uhura.");
		boolean out = names.add("Uhura");
		if (out) {
			System.out.println("The add succeeded.");
		} else {
			System.out.println("The add failed.");
		}

		System.out.println("\nPrint the set.");
		for (String n : names) {
			System.out.println(n);
		}

		// check contains
		System.out.println("\nWe check if the set contains Christine.");
		out = names.contains("Christine");
		if (out) {
			System.out.println("Christine is in the set.");
		} else {
			System.out.println("Christine is not in the set.");
		}

		// remove Christine
		System.out.println("We remove Christine.");
		names.remove("Christine");
		System.out.println("\nPrint the set.");
		for (String n : names) {
			System.out.println(n);
		}

		System.out.println("\nThe first name in the set is " + names.first() + ".");
		System.out.println("\nThe last name in the set is " + names.last() + ".");

		// now let us deal with the hash set
		System.out.println("\nNow, the hash sets");
		System.out.println("We form a hash set with the names Jim, Spock, Bones, Scotty.");
		HashSet<String> s = new HashSet<String>();
		s.add("Jim");
		s.add("Spock");
		s.add("Bones");
		s.add("Scotty");

		System.out.println("We print the set.");
		for (String n : s) {
			System.out.println(n);
		}

		System.out.println("\nWe try to delete Papa Spock.");
		out = s.remove("Papa Spock");
		if (out) {
			System.out.println("The remove succeeded.");
		} else {
			System.out.println("The remove failed.");
		}

		System.out.println("We print the set.");
		for (String n : s) {
			System.out.println(n);
		}

	}
}