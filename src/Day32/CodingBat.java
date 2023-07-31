package Day32;

import java.util.HashMap;

public class CodingBat {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a","hello");
        hashMap.put("b","hello");

        if(hashMap.containsKey("a") &&
                hashMap.containsKey("b") &&
                hashMap.get("a").equals(hashMap.get("b"))){
            hashMap.remove("a");
            hashMap.remove("b");
        }
        // a = "", b = "candy"
    }
}
