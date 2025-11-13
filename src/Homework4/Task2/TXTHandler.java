package Homework4.Task2;

public class TXTHandler extends AbstractHandler{
    @Override
    public void open(){
        System.out.println("Opening TXT document.");
    }
    @Override
    public void create() {
        System.out.println("Creating TXT document.");
    }
    @Override
    public void change() {
        System.out.println("Editing TXT document.");
    }
    @Override
    public void save() {
        System.out.println("Saving TXT document.");
    }
}