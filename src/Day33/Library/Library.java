package Day33.Library;

import java.util.ArrayList;

public class Library {

    ArrayList<Book> catalog = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
//        System.out.println(user.name +" has been added successfully!");
    }

    public void addBook(Book book){
        catalog.add(book);
//        System.out.println(book.title + " has been added successfully");
    }

    public void borrowBook(User user, Book book){
        if(user.maxBooks>0){
            if(catalog.contains(book)){
                user.addBorrowedBook(book);
                catalog.remove(book);
                user.maxBooks--;
            }
            else{
                System.out.println("This book is not available");
            }
        }
        else{
            System.out.println(user.name+" can't borrow more than "+ user.borrowedBooks.size());
        }
    }

    public void printUsers(){
        for (User user : users) {
            System.out.println("Name: "+user.name);
            System.out.println("ID: "+user.id);
            System.out.println("Can borrow: "+user.maxBooks);
            System.out.println("Borrowed books: "+user.borrowedBooks);
            System.out.println();
        }
    }
}
