package Homework9.Task2;

import java.util.Arrays;

public class MyList<E> {
    private Object[] objects;
    private int capacity = 10;
    private int size = 0;

    public MyList() {
        this.objects = new Object[capacity];
    }

    public MyList(Object[] objects) {
        this.objects = new Object[capacity];
    }

    public void add(E o) {
        if (size == capacity) {
            objects = increaseCapacity();
        }
        objects[size] = o;
        size++;
    }

    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return objects[index];
    }

    public int getSize() {
        return size;
    }

    private Object[] increaseCapacity() {
        int newCapacity = capacity * 2;
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(objects, 0, newArray, 0, size);
        objects = newArray;
        capacity = newCapacity;
        return newArray;
    }

    @Override
    public String toString() {
        return "MyList: " +
                "objects: " + Arrays.toString(objects) +
                ", capacity: " + capacity +
                ", size: " + size;
    }
}