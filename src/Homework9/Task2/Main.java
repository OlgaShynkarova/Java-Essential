package Homework9.Task2;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Happy ");
        list.add("New ");
        list.add("Year!");
        System.out.println(list.toString());
        System.out.println(list.getSize());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}