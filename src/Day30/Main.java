package Day30;

public class Main {
    public static void main(String[] args) {
        Library library = new Library("MT PL","1");
//        System.out.println(library.libraryName);
//        System.out.println(library.address);
//        System.out.println(library.bookshelf);
        Book book1 = new Book("A1", "P1", 2000);
        Book book2 = new Book("A2","P2",2005);
        Book book3 = new Book("A3","P3",1993);
        Book book4 = new Book("A4","P4",2021);

//        library.bookshelf.add(book1);
//        library.bookshelf.add(book2);
//        library.bookshelf.add(book3);
//        library.bookshelf.add(book4);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

//        library.bookshelf.get(0).printDetails();
//        library.bookshelf.get(1).printDetails();
//        library.bookshelf.get(2).printDetails();
//        library.bookshelf.get(3).printDetails();

        library.printDetails();
    }
}
