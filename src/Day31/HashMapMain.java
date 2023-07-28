package Day31;

import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("England", "London");
        capitals.put("Italy", "London");
        capitals.put("Canada", "REMOVED");
        capitals.put("Afghanistan", "London");
        capitals.put("England1", "Boston");
        System.out.println(capitals);
        capitals.remove("England");
        capitals.remove("Italy");
        System.out.println(capitals);
        System.out.println(capitals.isEmpty());

        System.out.println(capitals.get("Afghanistan"));
        System.out.println(capitals.remove("Canada"));
    }
}
