package Homework9.Task3;

public class Main {
    public static void main(String[] args) {
        MyDictinary<Integer, String> dictinary = new MyDictinary<>();
        dictinary.add(1, "One");
        dictinary.add(2, "Two");
        dictinary.add(3, "Three");
        dictinary.add(4, "Four");
        dictinary.add(5, "Five");
        System.out.println(dictinary.toString());
        System.out.println(dictinary.getSize());
        System.out.println(dictinary.getAtIndex(1));
        System.out.println(dictinary.getAtIndex(4));
    }
}