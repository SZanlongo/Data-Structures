package arrayList;

import java.util.NoSuchElementException;

public class ArrayListTester {

	public static void main(String[] args) {
		System.out.println("Testing the ArrayList");
		System.out.println("=====================\n\n");

		// test add(T v) and size()
		System.out.println("We form an array list of strings");
		ArrayList<String> cast = new ArrayList<String>();
		System.out.println("We add Kirk");
		cast.add("Kirk");
		System.out.println("We add Spock, Bones, Christine,  and " + "Scotty");
		cast.add("Spock");
		cast.add("Bones");
		cast.add("Christine");
		cast.add("Scotty");

		System.out.println("The list has: " + cast.size() + " profs.");

		System.out.println("We print the array list.");
		cast.printArray();

		// test add(int i, t v)
		System.out.println("We add Uhura at index 3");
		cast.add(3, "Uhura");
		System.out.println("\nWe add Chekov at index 1");
		cast.add(1, "Chekov");

		System.out.println("We print the array list.");
		cast.printArray();

		System.out.println("At index 4 we have " + cast.get(4));

		try {
			System.out.println("\nWe try to insert Sulu at index 8.");
			cast.add(8, "Sulu");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("We cannot do it.");
		}

		// test set, remove, and get
		System.out.println("We change the prof at 2 to Janice");
		String last = cast.set(2, "Janice");
		System.out.println("Ming replaces " + last + ".");

		System.out.println("We remove the prof at 1");
		last = cast.remove(1);

		System.out.println("We print the array list.");
		cast.printArray();

		try {
			System.out.println("We try to remove the prof at index 6.");
			last = cast.remove(6);
			System.out.println("The prof is " + last);
		} catch (NoSuchElementException e) {
			System.out.println("We cannot do it.");
		}

		System.out.println("We clear the array list.");
		cast.clear();
		cast.printArray();

		System.out.println("We try to get the prof at index 0.");
		try {
			last = cast.get(0);
			System.out.println("The prof is " + last);
		} catch (NoSuchElementException e) {
			System.out.println("We cannot do it.");
		}
		System.out.println("I hope that your program worked!");
	}
}