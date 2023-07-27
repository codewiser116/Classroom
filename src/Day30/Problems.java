package Day30;

import java.util.*;

public class Problems {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(1,10);
        }
        System.out.println(Arrays.toString(array));

        ArrayList<String> strList = new ArrayList<>();

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                strList.add(String.valueOf(array[i]));
            }
        }
        System.out.println("list size = "+strList.size());

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(strList);
        System.out.println(linkedHashSet.size());
        System.out.println(linkedHashSet);
    }

    public static void exercise1(){
        Random random = new Random();
        ArrayList<Integer> integers = new ArrayList<>(15);
        for(int i = 0; i < 15; i++){
            integers.add(random.nextInt(10,50));
        }
        for(Integer i: integers){
            System.out.print(i+" ");
        }
        for(int i = 0; i < integers.size(); i++){
            if(integers.get(i)%2==0){
                integers.set(i, integers.get(i) * 5);
            }
        }
        System.out.println();
        for (Integer i: integers) {
            System.out.print(i+" ");
        }
    }

    public static void exercise2(){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(random.nextInt(10,50));
        }

        System.out.println(list);
        System.out.println("Enter a number between 0 - 9");
        int x = scanner.nextInt();

        while(x < 0 || x > 10){
            System.out.println("Enter a number");
            x = scanner.nextInt();
        }

        for(int i = x; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
