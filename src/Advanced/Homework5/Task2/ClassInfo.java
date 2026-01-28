package Advanced.Homework5.Task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Scanner;

public class ClassInfo {
    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the full class name (for example, java.util.ArrayList): ");
        String className = scanner.nextLine();
        try {
            Class<?> cl = Class.forName(className);
            System.out.println(s + "Class name: " + s1 + cl.getName());
            int modifiers = cl.getModifiers();
            System.out.println(s + "Modifiers: " + s1 + Modifier.toString(modifiers));
            Class<?> superClass = cl.getSuperclass();
            if (superClass != null) {
                System.out.println(s + "SuperClass: " + s1 + superClass.getName());
            }
            Class<?>[] interfaces = cl.getInterfaces();
            System.out.println(s + "Interaces: " + s1);
            if (!isEmpty(interfaces)) {
                for (Class<?> interf : interfaces) {
                    System.out.print(interf.getName() + "; ");
                }
            }
            System.out.println();
            Field[] fields = cl.getDeclaredFields();
            System.out.println(s + "Fields: " + s1);
            if (!isEmpty(fields)){
                for (Field field : fields) {
                    System.out.println(Modifier.toString(field.getModifiers()) + " "
                            + field.getType().getSimpleName() + " " + s2 + field.getName() + s1);
                }
            }
            Constructor<?>[] constructors = cl.getDeclaredConstructors();
            System.out.println(s + "Constructors: ");
            if (!isEmpty(constructors)){
                for (Constructor<?> constructor : constructors) {
                    System.out.print(s1 + Modifier.toString(constructor.getModifiers()) + " "
                            + s2 + constructor.getName() + "(");
                    parameterList(constructor.getParameterTypes());
                }
            }
            Method[] methods = cl.getDeclaredMethods();
            System.out.println(s + " Methods: ");
            if (!isEmpty(methods)){
                for (Method method : methods) {
                    System.out.print(s1 + Modifier.toString(method.getModifiers()) + " "
                            + method.getReturnType().getSimpleName() + " " + s2 + method.getName() + "(");
                    parameterList(method.getParameterTypes());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        scanner.close();
    }
    public static boolean isEmpty(Object[] objects){
        if (objects.length > 0){
            return false;
        }else {
            System.out.println("not found!");
            return true;
        }
    }
    public static void parameterList(Class<?>[] paramTypes){
        for (int i = 0; i < paramTypes.length; i++) {
            System.out.print(paramTypes[i].getSimpleName());
            if (i < paramTypes.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}