package Homework8.Task5;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Animal("Vaska", 45, false);
        Animal cat1 = new Animal("Vaska", 45, false);
        Animal cat2 = cat;
        System.out.println(cat);
        System.out.println(cat.equals(cat1));
        System.out.println(cat.equals(cat2));
        System.out.println(cat == cat1);
        System.out.println(cat == cat2);
        System.out.println(cat.hashCode());
        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
    }
}