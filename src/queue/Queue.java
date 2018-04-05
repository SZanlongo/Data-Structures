package queue;

public interface Queue<AnyType> {

	// add an item
	void add(AnyType item);

	// remove an item, throw NoSuchElementException if the queue is empty
	AnyType remove();

	// get the first element without removing it
	// throw NoSuchElementException if the queue is empty
	AnyType getFirst();

	// get the size
	int getSize();

	// check if the queue is empty
	boolean isEmpty();

	// empty the queue
	void clear();
}