package Day39.amazon;

public class Book extends Item{

    private String author;
    private int pages;
    private int year;

    public Book(String name, double price, double rating, String author, int pages, int year) {
        super(name, price, rating);
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
