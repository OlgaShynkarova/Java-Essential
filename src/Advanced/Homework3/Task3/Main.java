package Advanced.Homework3.Task3;

public class Main {
    public static void main(String[] args) {
        String string = "Most subclasses, however, will override some of the methods defined " +
                "here in order to provide higher efficiency, additional functionality, or both.";
        String string1 = string.substring(0, string.length() / 2);
        String string2 = string.substring(string.length() / 2 - 1);
        System.out.println(string1);
        System.out.println(string2);
    }
}