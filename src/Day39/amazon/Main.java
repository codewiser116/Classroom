package Day39.amazon;

public class Main {
    public static void main(String[] args) {


        Amazon amazon = new Amazon();

        Book book1 = new Book("Book1",25, 4, "Author1",
                259, 2006);
        Book book2 = new Book("Book2", 60, 5, "Author2",
                100, 2005);

        Smartphone smartphone1 = new Smartphone("Smartphone1", 800,
                4, 512, 12, 5.9,4);



        amazon.addItem(book1);
        amazon.addItem(book2);
        amazon.addItem(smartphone1);

        System.out.println(amazon.getItems().size()); //3
        amazon.removeItem("Book2"); // removes
        System.out.println(amazon.getItems().size()); // 2
        amazon.displayItems(); // displays 2 items
        amazon.updateItem("Smartphone1");
        amazon.displayItems(); // displays 2 items


    }
}
