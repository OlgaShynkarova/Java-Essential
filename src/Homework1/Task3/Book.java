package Homework1.Task3;

public class Book {
    public Title title;
    public Author author;
    public Content content;
    public Book(Title title, Author author, Content content) {
        this.title = title;
        this.author = author;
        this.content = content;
    }
    public void show(){
        title.show();
        author.show();
        content.show();
    }
    public static void main(String[] args) {
        Title title = new Title("Jane Eyre");
        Author author = new Author("Charlotte Bronte");
        Content content = new Content("The novel by the English writer Charlotte Bronte.");
        Book book = new Book(title, author, content);
        book.show();
    }
}