package Homework9.Task3;

import java.util.ArrayList;
import java.util.List;

public class MyDictinary<K, V> {
    private List<Pair<K, V>> pairs;

    class Pair<K, V> {
        K key;
        V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }

    public MyDictinary() {
        this.pairs = new ArrayList<>();
    }

    public void add(K key, V value) {
        pairs.add(new Pair<>(key, value));
    }

    public V getAtIndex(int index) {
        if (index < 0 || index >= pairs.size()) {
            throw new IndexOutOfBoundsException("Incorrect index!");
        }
        return pairs.get(index).value;
    }

    public int getSize() {
        return pairs.size();
    }

    @Override
    public String toString() {
        return "MyDictinary{" +
                "pairs: " + pairs;
    }
}