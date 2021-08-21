import java.util.*;

class MyBook {
    String name, author;

    public MyBook(String name, String authore) {
        this.name = name;
        this.author = authore;

    }
}

class MyLibrary {
    public ArrayList<MyBook> books;

    public MyLibrary(ArrayList<MyBook> books) {
        this.books = books;
    }

    public void addBook(MyBook book) {
        System.out.println("The book has been added to library");
        this.books.add(book);
    }

    public void issueBook(MyBook books, String issued_to) {

        System.out.println("The book name " + this.books + " has issued to " + issued_to);
        this.books.remove(books);
    }

    public void returnBook(MyBook b) {
        this.books.add(b);
    }
}

public class LibSystem {
    public static void main(String[] args) {
        ArrayList<MyBook> bk = new ArrayList<>();
        MyBook b1 = new MyBook("pythone", " robert");
        bk.add(b1);
        MyLibrary l = new MyLibrary(bk);

    }
}