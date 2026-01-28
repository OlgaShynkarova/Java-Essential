package Advanced.Homework5.Task4;

import java.lang.reflect.Field;

public class Cat extends Animal {
    public void changeAnimalFields() {
        Class<?> animal = Animal.class;
        try {
            Field animalName = animal.getDeclaredField("name");
            animalName.setAccessible(true);
            animalName.set(this, "Tom");
            Field animalAge = animal.getDeclaredField("age");
            animalAge.setAccessible(true);
            animalAge.set(this, 5);
            Field animalBreed = animal.getDeclaredField("breed");
            animalBreed.set(this, "British");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "Cat{" + "name='" + this.getName() +
                "', age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat);
        cat.changeAnimalFields();
        System.out.println(cat);
    }
}