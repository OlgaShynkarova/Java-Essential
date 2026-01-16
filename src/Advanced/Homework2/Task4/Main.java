package Advanced.Homework2.Task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> familyCity = new HashMap<>();
        familyCity.put("Varshaw", "Ivanovy");
        familyCity.put("Kyiv", "Perovy");
        familyCity.put("London", "Abramovychi");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the city: ");
        String city = scanner.nextLine().trim();
        if (familyCity.containsKey(city)) {
            System.out.println(familyCity.get(city));
        } else
            System.out.println("The family is not found in this city.");
        scanner.close();
    }
}