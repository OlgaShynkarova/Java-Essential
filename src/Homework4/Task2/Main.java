package Homework4.Task2;

public class Main {
    public static void main(String[] args) {
        AbstractHandler[] handlers = {new DOCHandler(), new TXTHandler(), new XMLHandler()};
        for (AbstractHandler handler:handlers) {
            handler.create();
            handler.open();
            handler.change();
            handler.save();
            System.out.println();
        }
    }
}