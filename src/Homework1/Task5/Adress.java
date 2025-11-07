package Homework1.Task5;

public class Adress {
    private int index;
    private String country;
    private String city;
    private String street;
    private int house;
    private int apartment;

//    public Adress(int index, String country, String city, String street, int apartment) {
//        this.index = index;
//        this.country = country;
//        this.city = city;
//        this.street = street;
//        this.apartment = apartment;
//    }

    public int getHouse() {
        return house;
    }
    public void setHouse(int house) {
        this.house = house;
    }
    public int getIndex() {
        return index;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }
    public int getApartment() {
        return apartment;
    }
    public void setApartment(int apartment) {
        this.apartment = apartment;
    }
}