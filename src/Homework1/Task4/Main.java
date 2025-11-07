package Homework1.Task4;

public class Main {
    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer("HP" , 8, "AMD Ryzen 3.");
        computers[1] = new Computer("Apple", 12, "M1.");
        computers[2] = new Computer("Dell", 8, "Intel.");
        computers[3] = new Computer("Asus", 16, "Intel.");
        computers[4] = new Computer("Lenovo", 12, "Intel.");
        for (Computer computer : computers) {
            computer.showInfo();
        }
    }
}