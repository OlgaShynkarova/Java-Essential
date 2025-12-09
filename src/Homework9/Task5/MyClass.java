package Homework9.Task5;

public class MyClass {
    public static <T> T factoryMethod(Class<T> clas) {
        try {
            return clas.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static class ExampleA {
        public ExampleA() {
            System.out.println("Class ExampleA");
        }
    }

    public static class ExampleB {
        public ExampleB() {
            System.out.println("Class ExampleB");
        }
    }

    public static void main(String[] args) {
        ExampleA a = factoryMethod(ExampleA.class);
        ExampleB b = factoryMethod(ExampleB.class);
    }
}