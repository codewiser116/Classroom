package Day32;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Andrew", "32532544");
        hashMap.put("Sheyla", "32554344");
        hashMap.put("Maks", "21466564");
        hashMap.put("Aila", "12443743");
        hashMap.put("Nicolai", "19543543");

        for(String i: hashMap.keySet()){
            System.out.println(i);
        }
        System.out.println();
        for(String i: hashMap.values()){
            System.out.println(i);
        }
        System.out.println();
        for(Map.Entry<String, String> e : hashMap.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    }
}
