package Day33.Library;

import java.util.ArrayList;

public class User {
    String name;
    int id;
    int maxBooks;

    ArrayList<Book> borrowedBooks = new ArrayList<>();

    public User(String name, int id, int maxBooks){
        this.name = name;
        this.id = id;
        this.maxBooks = maxBooks;
    }

    public void addBorrowedBook(Book book){
        borrowedBooks.add(book);
    }
}
