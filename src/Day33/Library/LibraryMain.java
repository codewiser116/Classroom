package Day33.Library;

import java.util.ArrayList;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library();
//        System.out.println(library.catalog.size());
//        System.out.println(library.users.size());
        Book book1 = new Book("Book1", "Author1");
        Book book2 = new Book("Book2", "Author2");
        Book book3 = new Book("Book3", "Author3");
        Book book4 = new Book("Book4", "Author4");
        Book book5 = new Book("Book5", "Author5");
        Book book6 = new Book("Book6", "Author6");
        Book book7 = new Book("Book7", "Author7");
        Book book8 = new Book("Book8", "Author8");
        Book book9 = new Book("Book9", "Author9");
        Book book10 = new Book("Book10", "Author10");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
//        System.out.println(library.catalog.size());
//        System.out.println(library.users.size());
        Student student1 = new Student("Zak",1,2);
        Student student2 = new Student("Joe",2,2);
        Teacher teacher1 = new Teacher("Mike",3, 3);
        library.addUser(student1);
        library.addUser(student2);
        library.addUser(teacher1);
//        System.out.println(library.catalog.size());
//        System.out.println(library.users.size());

        library.printUsers();
        library.borrowBook(student1,book1);
        library.printUsers();

        library.borrowBook(student1,book2);
        library.printUsers();

        library.borrowBook(student1,book3);
        library.printUsers();

        library.borrowBook(teacher1, book4);
        library.printUsers();

        library.borrowBook(teacher1, book1);
        library.printUsers();

        library.borrowBook(teacher1, book5);
        library.printUsers();

    }
}
