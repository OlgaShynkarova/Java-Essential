package Homework1.Task3;

public class Title {
    public String title;
    public Title(String title) {
        this.title = title;
    }
    public void show(){
        if (title != null){
            System.out.println("Title: " + title);
        }else {
            System.out.println("Title is missing.");
        }
    }
}