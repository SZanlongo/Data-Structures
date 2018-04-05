package trees;

import java.util.*;

public class TreeSetIterator {

	public static void main(String[] args) {
		System.out.println("Print a Collection with an Iterator");
		System.out.println("===================================\n\n");

		System.out.println("We form an array list with the names Kirk, Bones, Spock");
		ArrayList<String> friends = new ArrayList<String>();
		friends.add("Kirk");
		friends.add("Bones");
		friends.add("Spock");

		System.out.println("\nThe list of friends:");
		printCollection(friends);

		System.out.println("\nWe form a set of the integers 7, 3, 5");
		TreeSet<Integer> integers = new TreeSet<Integer>();
		integers.add(7);
		integers.add(3);
		integers.add(5);

		System.out.println("\nThe list of integers:");
		printCollection(integers);

	}

	// print a collection
	public static <T> void printCollection(Collection<T> c) {
		Iterator<T> itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
