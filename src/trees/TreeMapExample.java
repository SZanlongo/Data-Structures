package trees;

import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;

public class TreeMapExample {

	public static <KeyType, ValueType> void printMap(String msg, Map<KeyType, ValueType> m) {
		System.out.println(msg + ":");
		Set<Map.Entry<KeyType, ValueType>> entries = m.entrySet();

		for (Map.Entry<KeyType, ValueType> thisPair : entries) {
			System.out.print(thisPair.getKey() + "; ");
			System.out.println(thisPair.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String, String> phone1 = new TreeMap<String, String>();

		phone1.put("Kirk", "(800)111-1111");
		phone1.put("McCoy", "(800)222-2222");
		phone1.put("Spock", "(800)333-3333");
		phone1.put("Scotty", "(800)444-4444");
		phone1.put("Sulu", "(800)555-5555");
		phone1.put("Chekov", "(800)666-6666");
		// print the map
		System.out.println("The map:");
		printMap("phone 1", phone1);

		//
		System.out.println("phone1.get(\"Scotty\"): " + phone1.get("Scotty"));

		// print the keys
		System.out.println("\nThe keys are: ");
		Set<String> keys = phone1.keySet();
		// print the collection
		for (String val : keys) {
			System.out.println(val);
		}

		System.out.println("\nThe values are: ");
		Collection<String> values = phone1.values();
		// print the collection
		for (String val : values) {
			System.out.println(val);
		}

		keys.remove("Janice");
		keys.remove("Spock");
		values.remove("(800)222-2222");

		System.out.println("After Janice, Spock and (800)222-2222 are removed");
		System.out.println("\nThe map is: ");
		printMap("phone 1", phone1);
	}
}