package Day28;


import java.util.ArrayList;
import java.util.List;

public class IntroToArrayList {
    public static void main(String[] args) {

        /*
        There are two ways to declare ArrayList:
            1. using ArrayList class
            2. using List interface
         */

        ArrayList<String> cities = new ArrayList<>();
        String [] citiesAr = new String[10];

        List<String> countries = new ArrayList<>();

        /*
        When you add elements into ArrayList, they get added
        one by one. Whatever element added first, will be the first
         */

        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Washington");

        System.out.println(cities.size()); //3
        System.out.println(cities);

        System.out.println(cities.get(2));

        cities.set(0, "Chicago");
        System.out.println(cities);


        /*
        1. Create ArrayList of Strings with 5 of your favorite foods
        2. print arraylist
        3. print the number of elements in arraylist
        4. change the first element to "Oromo"
        5. add one more element "Lasagna"
        6. print the size
        7. print the arraylist
         */

        ArrayList<String> foods = new ArrayList<>();
        foods.add("sushi");
        foods.add("manty");
        foods.add("avocado toast");
        foods.add("plov");
        foods.add("lagman");

        System.out.println(foods);

        for (int i = 0; i < foods.size(); i++){
            System.out.println(foods.get(i));
        }

        System.out.println("The number of foods: " + foods.size());

        foods.set(0, "oromo");
        foods.add("lasagna");

        System.out.println(foods.size());

        System.out.println(foods);
        System.out.println(foods.get(1));

        foods.remove(0);
        System.out.println(foods);

        System.out.println(foods.get(1));

        foods.remove("lagman");
        System.out.println(foods);

        foods.remove(foods.size() - 1);
        System.out.println(foods);

        foods.set(0, "plov");

        System.out.println(foods);
        foods.remove("plov");
        System.out.println(foods);

        foods.clear();

        System.out.println(foods);
        System.out.println(foods.size());


        foods.add("pizza");
        foods.add("ice cream");

        System.out.println(foods.contains("pizzA")); //false
        System.out.println(foods.contains("ice cream")); //true

        System.out.println(foods.isEmpty());
        foods.clear();
        System.out.println(foods.isEmpty());





    }
}
