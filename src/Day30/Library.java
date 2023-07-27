package Day30;

import java.util.ArrayList;

public class Library {

    String libraryName;
    String address;
    ArrayList<Book> bookshelf = new ArrayList<>();

    public Library(String libraryName, String address){
        this.libraryName = libraryName;
        this.address = address;
    }

    public void addBook(Book book){
        bookshelf.add(book);
    }

    public void printDetails(){
        System.out.println(libraryName);
        System.out.println(address);
        for(Book i: bookshelf){
            i.printDetails();
        }
    }

}
