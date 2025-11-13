package Homework5.Task6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Iryna Yaroslavivna");
        teachers.add("Orysya Myronivna");
        teachers.add("Khrystyna Vasylivna");
        teachers.add("Nina Andriivna");
        teachers.add("Ivan Oleksandrovych");
        System.out.println(teachers);
        System.out.println("The best teacher's index is " + teachers.indexOf("Iryna Yaroslavivna"));
        System.out.println("The worst teacher's index is " + teachers.indexOf("Khrystyna Vasylivna"));
    }
}