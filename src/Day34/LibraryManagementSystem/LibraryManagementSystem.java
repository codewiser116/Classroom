package Day34.LibraryManagementSystem;

import java.util.ArrayList;

public class LibraryManagementSystem {
    ArrayList<LibraryItem> libraryItems = new ArrayList<>();

    public void addLibraryItem(LibraryItem libraryItem){
        libraryItems.add(libraryItem);
    }

    public void displayItems(){
        for(LibraryItem i : libraryItems){
            System.out.println(i.title);
            if(i instanceof Book){
                System.out.println(((Book) (i)).author);
            }
            else if(i instanceof DVD){
                System.out.println(((DVD)(i)).director);
            }
            System.out.println();
        }
    }

    public void updateItem(String oldTitle, String newTitle){
        for (int i = 0; i < libraryItems.size(); i++) {
            if(libraryItems.get(i).title.equals(oldTitle)){
                libraryItems.get(i).title = newTitle;
            }
        }
    }

    public void deleteItem(LibraryItem libraryItem){
        libraryItems.remove(libraryItem);
    }
}
