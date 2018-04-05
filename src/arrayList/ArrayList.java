package arrayList;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

// the array list is implemented as the initial
// segment [0:size-1] of arr
@SuppressWarnings("unchecked")
public class ArrayList<T> implements List<T> {
	// the initial size of arr

	private static final int INIT = 3;
	private int size = 0; // the size of the array list
	private T[] arr; // the array

	// construct an empty array list
	public ArrayList() {
		// intial size determined by INIT, which is now 3
		arr = (T[]) new Object[INIT];
	}

	// insert the value v at index i
	// if i is out of index, throw an index out of bounds
	// exception. If the arr is full, create an array of twice
	// the size of arr, copy arr onto the new array and make
	// the new array the object array
	// Then do the insertion
	@Override
	public void add(int i, T v) {
		// is i negative?
		// is it larger than the array?
		// then i is invalid and throw an error
		if (i < 0 || i > arr.length + 1) {
			throw new IndexOutOfBoundsException();
		} else {
			// is size = length? make space by doubling size of array
			if (arr.length == size) {
				T[] newArr = (T[]) Array.newInstance(arr[0].getClass(), size * 2);
				System.arraycopy(arr, 0, newArr, 0, size);
				arr = newArr;
			}
			// do we need to insert the item before another one?
			// this saves the pc some time by preventing unnecessary use of
			// arraycopy
			if (i == size) {
				// no? then add at the end
				arr[i] = v;
			} else {
				// yes? then move everything to the right by 1, and insert the
				// item
				System.arraycopy(arr, i, arr, i + 1, size - i);
				arr[i] = v;
			}
			size++;
		}
	}

	// add in the last location
	@Override
	public void add(T v) {
		// add at end (indicated by size)
		add(size, v);
	}

	// return the value at i
	// if i is out of bounds throw a no such element exception
	@Override
	public T get(int i) {
		// is i negative?
		// is it larger than the array?
		// then i is invalid and throw an error
		if (i < 0 || i > size - 1) {
			throw new NoSuchElementException();
		} else {
			return arr[i];
		}
	}

	// remove the value at i
	// if i is out of bounds throw a no such element exception
	@Override
	public T remove(int i) {
		// is i negative?
		// is it larger than the array?
		// then i is invalid and throw an error
		if (i < 0 || i > size - 1) {
			throw new NoSuchElementException();
		}
		// temporarily store the return value (which will be deleted)
		T returnValue = arr[i];
		System.arraycopy(arr, i + 1, arr, i, size - i);
		// decrease size
		size--;
		// return the removed item
		return returnValue;
	}

	// set the value at i to v return the old value
	// if i is out of bounds throw an array index out of bounds
	// exception
	@Override
	public T set(int i, T v) {
		// is i negative?
		// is it larger than the array?
		// then i is invalid and throw an error
		if (i < 0 || i > size - 1) {
			throw new IndexOutOfBoundsException();
		}
		// temporarily store the item that will bve changed
		T temp = arr[i];
		// set the item to its new value
		arr[i] = v;
		// return the old item
		return temp;
	}

	// clear the array sets size to zero
	@Override
	public void clear() {
		size = 0;
	}

	// returns the size
	@Override
	public int size() {
		return size;
	}

	// print the slice arr[0:size-1]
	public void printArray() {
		// is array empty?
		if (size == 0) {
			// then print that its empty!
			System.out.println("The array is empty.");
		} else {
			// loop throug all items and print each one
			System.out.println("\n" + "The array is:");
			for (int i = 0; i < size; i++) {
				// output as item position, then item
				System.out.println("arr[" + i + "] = " + arr[i]);
			}
		}
	}
}