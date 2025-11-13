package Homework5.Task4;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(51);
        arrayList.add(27);
        arrayList.add(82);
        arrayList.add(16);
        System.out.println(arrayList);
        ListIterator <Integer> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            Integer integer = listIterator.next();
            listIterator.set(integer + 1);
        }
        System.out.println(arrayList);
    }
}