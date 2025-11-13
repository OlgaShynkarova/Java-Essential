package Homework4.Task2;

public class DOCHandler extends AbstractHandler{
    @Override
    public void open() {
        System.out.println("Opening DOC document.");
    }
    @Override
    public void create() {
        System.out.println("Creating DOC document.");
    }
    @Override
    public void change() {
        System.out.println("Editing DOC document.");
    }
    @Override
    public void save() {
        System.out.println("Saving DOC document.");
    }
}