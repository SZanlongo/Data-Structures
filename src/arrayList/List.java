package arrayList;

public interface List<T> {
    // add an item

    void add(T item);
    // add at a given index

    void add(int i, T item);
    // remove at a given index

    T remove(int i);
    // get the value at a given index

    T get(int i);
    // set the value at i to v
    // return the old value

    T set(int i, T v);
    // clear the array

    void clear();
    // return the size

    int size();
}