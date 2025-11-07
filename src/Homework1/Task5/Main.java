package Homework1.Task5;

public class Main {
    public static void main(String[] args) {
        Adress adress = new Adress();
        adress.setIndex(61064);
        adress.setCountry("Ukraine");
        adress.setCity("Lviv");
        adress.setStreet("Stryiska");
        adress.setHouse(10);
        adress.setApartment(41);
        System.out.println("Adress: " +
                "\nIndex " + adress.getIndex() +
                "\nCountry " + adress.getCountry() +
                "\nCity " + adress.getCity() +
                "\nStreet " + adress.getStreet() +
                "\nHouse " + adress.getHouse() +
                "\nApartment " + adress.getApartment());
    }
}