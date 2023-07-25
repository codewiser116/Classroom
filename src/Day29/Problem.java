package Day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
        // 1
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("dog","cat","dog","bird","bird","fish"));
        HashSet<String> hashSet = new HashSet<>(arrayList);
//        System.out.println(hashSet);

        // hashSet -> dog dog dog
        // dog
        // hashSet.contains("dog")
        // 2
//        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
//        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(4,5,6,7,8));
//
//        HashSet<Integer> commonNumbers = new HashSet<>(set1);// 1 2 3 4 5
//        // 1 2 3 4 5 -> commonNumbers
//        // 4 5 6 7 8 -> set2
//        // retainAll - saves only common numbers
//        commonNumbers.retainAll(set2);
////        for(Integer i : set1){
////            if(set2.contains(i)){
////                commonNumbers.add(i);
////            }
////        }
//        for (Integer i: commonNumbers){
//            System.out.println(i);
//        }
        // 3
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> integers = new HashSet<>();
        int counter = 0;
        for(int i = 1; i <= 6; i++){
            int number = scanner.nextInt();
            if(integers.contains(number)){
                counter++;
            }
            else{
                integers.add(number);
            }
        }
        System.out.println(counter);
    }
}
