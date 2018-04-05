package queue;

import java.util.NoSuchElementException;

@SuppressWarnings("unchecked")
public class LinearQueue<AnyType> implements Queue<AnyType> {

	/*
	 * Write a generic class LinearQueue that implements this interface as a
	 * linear queue. The class must have 3 private fields, the data array, and
	 * the indices f and r that point to the first and the last element in the
	 * queue, in this order. When the queue is empty, f=r=-1.
	 */
	private AnyType[] data; // data array
	private static final int DEFAULT_SIZE = 3; // the default size of the array
	private int f = -1, l = -1; // indices; first and last elements in queue

	// when queue is empty, f=r=-1
	// begins at 0 (first place in data)

	/*
	 * The class has 2 constructors, one that takes as input the size of data,
	 * and one that uses a default size, in this case 3.
	 */
	public LinearQueue() {
		// create a data array of default size 3
		data = (AnyType[]) new Object[DEFAULT_SIZE];
	}

	public LinearQueue(int size) {
		// create a data array of given size
		data = (AnyType[]) new Object[size];
	}

	// Add checks that there is space in data. If not, it increase the size of
	// data,
	// and inserts item. If data is empty before the insertion, initialize f.
	@Override
	public void add(AnyType item) {
		// is data empty?
		if (isEmpty()) {
			// yes, so set first item to 0
			f = 0;
		} else if (l == data.length - 1) {
			// if data is full, double its size
			AnyType[] newData = (AnyType[]) new Object[data.length * 2];

			System.arraycopy(data, f, newData, 0, getSize());
			l = getSize() - 1;
			data = newData;
			f = 0;
		}
		// add item to data in new position and increase last
		data[++l] = item;
	}

	@Override
	public AnyType remove() {
		// is data empty?
		if (isEmpty()) {
			// yes, so nothing to remove
			throw new NoSuchElementException();
		} else {
			// if only element in data, reset f and l to -1
			f++;
			AnyType item = data[f - 1];
			if (f - 1 == l) {
				clear();
			}
			// return the item that was removed
			return item;
		}
	}

	@Override
	public AnyType getFirst() {
		// return the first item in data
		return data[f];
	}

	@Override
	public int getSize() {
		// return number of itmes in data (not the array size)
		return l - f + 1;
	}

	@Override
	public boolean isEmpty() {
		// are there any items in data?
		if (f == -1 || l == -1) {
			// yes, return ture
			return true;
		} else {
			// no, false
			return false;
		}
	}

	@Override
	public void clear() {
		// set f and l to -1 to show that data is empty (does not actually
		// remove the items)
		f = l = -1;
	}

	public void printQueue() {
		// print first and last numbers
		System.out.println("f = " + f + ", r = " + l);
		// print the size of array
		System.out.println("The capacity is " + data.length);
		// print the number of items
		System.out.println("The queue has " + getSize() + " items.");
		// print first and last elements
		System.out.println("The element at the front is: " + getFirst() + ". The element at the rear is: " + data[l]);
		// print list of elements
		for (int i = 0; i < getSize(); i++) {
			System.out.println("data[" + i + "] = " + data[f + i]);
		}
	}
}