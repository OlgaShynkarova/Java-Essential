package Homework4.Task2;

public class XMLHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Opening XML document.");
    }
    @Override
    public void create() {
        System.out.println("Creating XML document.");
    }
    @Override
    public void change() {
        System.out.println("Editing XML document.");
    }
    @Override
    public void save() {
        System.out.println("Saving XML document.");
    }
}