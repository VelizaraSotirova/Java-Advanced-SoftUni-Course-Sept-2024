package Smart_Array;

import java.util.function.Consumer;

//This structure wil only accept and keep INTEGERS! It will not be GENERIC
public class SmartArray {

    private int[] data;

    // How much numbers we have in our array
    private  int size;

    // How much numbers our array can keep
    private int capacity;

    public SmartArray() {
        this.size = 0;
        this.capacity = 4;
        this.data = new int[capacity];
    }

    public void add(int element) {
        // If the capacity of our custom list is smaller than the count of the numbers, we need to resize it double
        if (this.size == this.capacity) {
            resize();
        }

        // If we have space to add a new integer, we put it
        this.data[size] = element;
        this.size++;
    }

    // Returns the element at the given index
    public int get(int index) {
        // Validate the index
        checkIndex(index);

        // if the index is valid we return the number in this index
        return this.data[index];
    }

    public int remove(int index) {
        // Validate index
        checkIndex(index);

        // Get the element to remove
        int removedElement = this.data[index];

        // Move all the elements after the removed one with a step in left
        for (int i = index; i < size - 1; i++) {
            this.data[i] = this.data[i + 1];
        }
        // Resize the list
        this.data[size - 1] = 0;
        // this.size--;

        // Check if there is too much empty space after removing the element
        if (this.size <= this.capacity / 4) {
            // Resize the list
            shrink();
        }

        return removedElement;
    }

    public void add(int index, int element) {
        // Save the last element because we will lose it
        int lastNumber = this.data[this.size - 1];

        // Move the elements after the given index with one to right
        for (int i = this.size - 1; i > index; i--) {
            this.data[i] = this.data[i - 1];
        }

        // Add the last index to the end
        add(lastNumber);

        // Add the given element to the given index
        this.data[index] = element;
    }

    // CHeck if the list contains an element
    public boolean contains(int element) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == element) {
                return true;
            }
        }
        return false;
    }

    public void forEach (Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.data[i]);
        }
    }




    private void checkIndex(int index) {
        if (index < 0 || index >= this.size) {
            // If the index is between 0 and the size of our list, it will be valid
            throw new IndexOutOfBoundsException("Invalid index!");
        }
    }

    // Resize the list double
    private void resize() {
        // Grow double
        this.capacity *= 2;
        int[] temporary = new int[capacity];

        // Put the elements from the old array to the new, twice bigger one
        for (int i = 0; i <this.data.length; i++) {
            temporary[i] = this.data[i];
        }

        //System.arraycopy(this.data, 0, temporary, 0, this.data.length);

        // Set the old array to be with the new length and elements
        this.data = temporary;
    }

    private void shrink() {
        //Shrink double
        this.capacity /= 2;
        int[] temporary = new int[this.capacity];

        // Put the elements from the old array to the new, twice smaller one
        for (int i = 0; i <this.size; i++) {
            temporary[i] = this.data[i];
        }

        // Set the old array to be with the new length and elements
        this.data = temporary;
    }
}
