package edu.grinnell.csc207.lists;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    int[] data ;
    int size;

    private void ensureCapacity() {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        ensureCapacity();
        this.data[size] = value;
        size++;
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return size;
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return this.data[index];
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
    if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
    }
    int val = this.data[index];
        
    for(int i = index; i < size - 1; i++) {
        data[i] = data[i + 1];
    }

    size--;
    return val;    
    }
}
