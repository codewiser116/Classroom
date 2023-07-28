package Day31;

import java.util.*;

public class HashMapExercises {
    public static void main(String[] args) {
//        HashMap<String, Double> stockPrices = new HashMap<>();
//        stockPrices.put("apple",400.90);
//        stockPrices.put("tesla",1200.32);
//        stockPrices.put("meta",300.43);
//        stockPrices.put("bofa",5000.5);
//        stockPrices.put("slack",123.54);
//        stockPrices.put("macdonalds",98.12);
//
//        double highestStockPrice = 0;
//        highestStockPrice = Math.max(stockPrices.get("apple"),
//                stockPrices.get("tesla")); // 1200.32
//        highestStockPrice = Math.max(highestStockPrice, stockPrices.get("meta"));
//        // 1200.32
//        highestStockPrice = Math.max(highestStockPrice, stockPrices.get("bofa"));
//        // 5000.5
//        highestStockPrice = Math.max(highestStockPrice, stockPrices.get("slack"));
//        // 5000.5
//        highestStockPrice = Math.max(highestStockPrice, stockPrices.get("macdonalds"));
//        // 5000.5
//        System.out.println(highestStockPrice); // 5000.5
        HashMap<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("Apple",2);
        fruitPrices.put("PineApple",1);
        fruitPrices.put("Cherry",3);


        System.out.println(findPrice(fruitPrices, "Apple"));

        HashMap<String, Integer> cars = new HashMap<>();
        cars.put("Toyota",2000);
        cars.put("Mercedes",1000);
        cars.put("BMW",3000);

//        for (String i: cars.keySet()){
//            System.out.println(i);
//        }
//
//        for (Integer i : cars.values()){
//            System.out.println(i);
//        }
//
//        for(Map.Entry<String, Integer> entry : cars.entrySet()){
//            System.out.println(entry.getKey() +" "+ entry.getValue());
//        }

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("Bill", "Gates");
        hashMap.put("Mark", "Zuckerberg");
        hashMap.put("Ali", "Mike");
        hashMap.put("Michael", "Andrew");

//        for(Map.Entry<String, String> entry : hashMap.entrySet()){
//            if(entry.getValue().length()>=6){
//                System.out.println(entry.getKey() + " " + entry.getValue());
//            }
//        }
        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        hashMap1.put(5,1);
        System.out.println(hashMap1);

    }

    public static int findPrice(HashMap<String, Integer> fruits, String fruitName){
        return fruits.get(fruitName);
    }

    public static Integer findPriceCar(HashMap<String, Integer> cars, String brand){
        return cars.get(brand);
    }





}
