package Advanced.Homework5.Task3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.Callable;

public class Cat {
    private String name;
    private int age;
    protected String color;

    public Cat() {
        this.name = null;
        this.age = 0;
        this.color = null;
    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private void voice() {
        System.out.println("Meow!");
    }

    public void catInfo() {
        System.out.println("Name: " + name + ". Age : " + age + ". Color: " + color);
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        Class<?> cl = Cat.class;
        System.out.println(s + "Class name: " + s1 + cl.getName());
        Field[] fields = cl.getDeclaredFields();
        System.out.println(s + "Fields: ");
        for (Field field : fields) {
            System.out.println(s1 + Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " "
                    + field.getName());
        }
        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        System.out.println(s + "Constructors: ");
        for (Constructor<?> constructor : constructors) {
            System.out.print(s1 + Modifier.toString(constructor.getModifiers()) + " "
                    + constructor.getName() + "(");
            parameterList(constructor.getParameterTypes());
        }
        System.out.println(s + "Methods: ");
        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {
            System.out.print(s1 + Modifier.toString(method.getModifiers()) + " "
                    + method.getReturnType().getSimpleName() + " " + method.getName() + "(");
            parameterList(method.getParameterTypes());
        }
    }

    public static void parameterList(Class<?>[] paramTypes) {
        for (int i = 0; i < paramTypes.length; i++) {
            System.out.print(paramTypes[i].getSimpleName());
            if (i < paramTypes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}