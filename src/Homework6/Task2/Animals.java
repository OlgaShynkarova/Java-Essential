package Homework6.Task2;

public enum Animals {
    CAT(3), DOG(2), RABBIT(4);
    private final int age;
    Animals(int age) {
        this.age = age;
    }
    @Override
    public String toString(){
        return "Name: " + this.name() + ", age: " + age + "years.";
    }
}