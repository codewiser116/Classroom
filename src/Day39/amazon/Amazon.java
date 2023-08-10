package Day39.amazon;

import java.util.ArrayList;
import java.util.Scanner;

public class Amazon {
    private ArrayList<Item> items = new ArrayList<>();


    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(String name){
        for (int i = 0; i < items.size(); i++) {
            if(items.get(i).getName().equals(name)){
                items.remove(i);
                i--;
            }
        }
    }

    public void displayItems(){
        for (Item item : items) {
            System.out.println(item.getName());
            System.out.println(item.getPrice());
            System.out.println(item.getRating());
            System.out.println();
        }
    }

    public void updateItem(String name){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < items.size(); i++){
            if(items.get(i).getName().equals(name)){
                System.out.println("Enter new name:");
                String newName = scanner.nextLine();
                System.out.println("Enter new price");
                double newPrice = scanner.nextDouble();
                System.out.println("Enter new rating");
                double rating = scanner.nextDouble();

                items.get(i).setName(newName);
                items.get(i).setPrice(newPrice);
                items.get(i).setRating(rating);
            }
        }
    }



}
