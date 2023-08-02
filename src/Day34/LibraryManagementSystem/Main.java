package Day34.LibraryManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        Book book1 = new Book("Book1","Author1");
        Book book2 = new Book("Book2","Author2");
        DVD dvd1 = new DVD("DVD1","Director1");
        DVD dvd2 = new DVD("DVD2","Director2");
        libraryManagementSystem.addLibraryItem(book1);
        libraryManagementSystem.addLibraryItem(book2);
        libraryManagementSystem.addLibraryItem(dvd1);
        libraryManagementSystem.addLibraryItem(dvd2);
        libraryManagementSystem.displayItems();
        libraryManagementSystem.deleteItem(book1);
        libraryManagementSystem.deleteItem(dvd1);
        libraryManagementSystem.updateItem("Book2","New Title");
        libraryManagementSystem.displayItems();
    }
}
