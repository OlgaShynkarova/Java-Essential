package Homework1.Task3;

public class Content {
    public String content;
    public Content(String content) {
        this.content = content;
    }
    public void show(){
        if (content != null){
            System.out.println("Content: " + content);
        }else {
            System.out.println("Content is missing.");
        }
    }
}