package queue;

import java.util.NoSuchElementException;

public class QueueTester {

	public static void main(String[] args) {

		System.out.println("Testing Queues");
		System.out.println("==============\n\n\n");

		System.out.println("\nWe form a queue with the names Kirk, McCoy, Spock.");

		LinearQueue<String> cast = new LinearQueue<String>();
		cast.add("Kirk");
		cast.add("McCoy");
		cast.add("Spock");

		System.out.println("\nWe remove one prof.");
		System.out.println("We removed " + cast.remove() + ".");

		System.out.println("We remove another prof.");
		System.out.println("We removed " + cast.remove() + ".");

		System.out.println("\nWe print the queue.");
		cast.printQueue();

		System.out.println("\nWe add Khan.");
		cast.add("Khan");
		System.out.println("We print the queue.");
		cast.printQueue();

		System.out.println("\nWe add the names Sulu and Chekov");
		cast.add("Sulu");
		cast.add("Chekov");

		System.out.println("\nThe queue is ");
		cast.printQueue();
		System.out.println("We add Enterprise and Galileo");
		cast.add("Enterprise");
		cast.add("Galileo");

		System.out.println("\nThe queue is: ");
		cast.printQueue();

		System.out.println("\nThe queue has " + cast.getSize() + " persons.");
		System.out.println("We delete 4 names.");
		for (int i = 1; i <= 4; i++) {
			System.out.println("The deleted name is " + cast.remove());
		}

		System.out.println("\nThe queue is: ");
		cast.printQueue();

		System.out.println("The name on top is " + cast.getFirst());
		System.out.println("We delete 2 more names.");
		for (int i = 1; i <= 2; i++) {
			System.out.println("The deleted name is " + cast.remove());
		}
		System.out.println("\nNow, isEmpty() is " + cast.isEmpty());

		System.out.println("We try to remove a name.");
		try {
			@SuppressWarnings("unused")
			String name = cast.remove();
		} catch (NoSuchElementException e) {
			System.out.println("We get a NoSuchElementException");
		}

		System.out.println("\nNow, let us add Janice and Christine");
		cast.add("Janice");
		cast.add("Christine");
		System.out.println("The size is " + cast.getSize());

		cast.printQueue();
	} // end main
}