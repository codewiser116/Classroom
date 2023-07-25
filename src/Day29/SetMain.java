package Day29;

import java.util.*;

public class SetMain {
    public static void main(String[] args) {
        HashSet<Integer> integers1 = new HashSet<>();
        integers1.add(1);
        integers1.add(2);
        integers1.add(3);
        integers1.add(4);
        HashSet<Integer> integers2 = new HashSet<>();
        integers2.add(1);
        integers2.add(2);
        integers2.add(5);
        // integers1 - 1, 2, 3, 4
        // integers2 - 1, 2, 5
        // common numbers - 1, 2
        // unique integers1 - 3, 4
        // unique integers2 - 5
//        integers1.clear();
        System.out.println(integers1.contains(1));
        System.out.println(integers2.containsAll(integers1));
        System.out.println(integers2.remove(10));
        System.out.println(integers2);

        Integer[] array2 = integers2.toArray(new Integer[3]);
        System.out.println(Arrays.toString(array2));

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> arrayList2 = new ArrayList<>(integers2);
    }
}
