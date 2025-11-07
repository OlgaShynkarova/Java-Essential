package Homework1.Task3;

public class Author {
    public String author;
    public Author(String author) {
        this.author = author;
    }
    public void show(){
        if (author != null){
            System.out.println("Author: " + author);
        }else {
            System.out.println("Author is missing.");
        }
    }
}