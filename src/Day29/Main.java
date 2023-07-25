package Day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(5);
//        System.out.println(integers);
//        System.out.println(integers.get(0));
//        integers.set(0,10);
//        System.out.println(integers);
//        System.out.println(integers.size());
//        integers.remove(0);
//        System.out.println(integers);
//        integers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
//        System.out.println(integers);
//        integers.clear();
//        System.out.println(integers);
//        System.out.println(integers.isEmpty());
//
//
//
//
//        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2));
//        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(4,5,3,6));
//        arrayList1.addAll(arrayList2);
//        // arrayList1 = 1,2,4,5,3,6
//        // arrayList2 = 4,5,3,6
//        System.out.println(arrayList1);
//        arrayList1.removeAll(arrayList2);
//        System.out.println(arrayList1);
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Integer> integers2 = (ArrayList<Integer>) integers.clone();
        System.out.println(integers);
        System.out.println(integers2);
        integers2.set(0,10);
        System.out.println(integers);
        System.out.println(integers2);
        // sort 2nd ArrayList
        Collections.sort(integers2);
        System.out.println(integers2);
    }
}
