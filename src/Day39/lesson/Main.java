package Day39.lesson;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = new ArrayList<>();
        lions.add(new Lion("lion1",1));
        lions.add(new Lion("lion2",2));
        lions.add(new Lion("lion3",3));
        lions.add(new Lion("lion4",4));

//        for (Lion lion : lions) {
//            System.out.println("Name: "+ lion.getName());
//            System.out.println("Age : "+ lion.getAge());
//            System.out.println();
//        }
        Lion lion = new Lion("lion5", 5);
        System.out.println(lion.getName() + " " + lion.getAge());
        lion.setName("lion6");
        lion.setAge(20);
        System.out.println(lion.getName() + " " + lion.getAge());

    }
}
