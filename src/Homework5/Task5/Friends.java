package Homework5.Task5;

import java.util.ArrayList;
import java.util.Collections;

public class Friends {
    public static void main(String[] args) {
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Sofiia");
        friends.add("Victoria");
        friends.add("Anna");
        friends.add("Lusy");
        friends.add("Lin");
        friends.add("Mariia");
        System.out.println(friends);
        Collections.sort(friends);
        System.out.println(friends);
    }
}