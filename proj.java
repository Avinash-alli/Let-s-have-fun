import java.util.*;

class Book {
    String name, author;

    public Book(String name, String authore) {
        this.name = name;
        this.author = authore;

    }
}

class Library {
    public ArrayList<Book> books;
}