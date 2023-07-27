package Day30;

public class Book {
    String title;
    String author;
    int publicationYear;

    public Book(String title, String author, int publicationYear){
        this.title = title;
        this.author= author;
        this.publicationYear = publicationYear;
    }

    public void printDetails(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(publicationYear);
        System.out.println();
    }


}
