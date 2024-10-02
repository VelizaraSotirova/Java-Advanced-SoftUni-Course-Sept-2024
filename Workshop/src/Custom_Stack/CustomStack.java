package Custom_Stack;

import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class CustomStack {
    private static final int initialCapacity = 4;
    private int capacity;
    private int size;
    private int[] items;

    public CustomStack() {
        this.capacity = initialCapacity;
        this.items = new int[this.capacity];
    }

    public int getSize() {
        return this.size;
    }

    public void push(int element) {
        //Resize the stack if the size is equal the capacity
        if (this.size == this.capacity) {
            resize();
        }
        this.items[this.size++] = element;
    }

    public int pop() {
        // Check if the stack is empty, because we would not be able to pop an element
        checkIfEmpty();

        // Get the last element
        int element = this.items[this.size - 1];
        // Resize the list
        this.size--;

        return element;
    }

    public void peek() {
        // Check if the stack is empty
        checkIfEmpty();

        // Get the last element
        int lastElement = this.items[this.size - 1];

        // Visualize it
        System.out.println(lastElement);
    }

    public void forEach(Consumer<Integer> consumer) {
        for (int i = 0; i < this.size; i++) {
            consumer.accept(this.items[i]);
        }
    }


    private void checkIfEmpty() {
        if (this.size == 0) {
            throw new NoSuchElementException("Custom Stack is empty!");
        }
    }

    private void resize() {
        // Double the stack size
        this.capacity *= 2;
        // Create a temporary array to collect the elements from the old array
        int[] temporary = new int[this.capacity];

        // \fill the temporary array with the elements from the item[]
        for (int i = 0; i < this.items.length; i++) {
            temporary[i] = this.items[i];
        }

        // Put back the elements to the item[], which is already with double capacity
        this.items = temporary;
    }
}
