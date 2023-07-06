package Day18;

import java.util.Arrays;

public class Session1 {
    public static void main(String[] args) {
        short[] shortArray = new short[]{1,2,3,4,5};
        short[] shortArray2 = {1,2,3,4};
        short[] shortArray3 = new short[2];
        shortArray3[0] = 5;
        shortArray3[1] = 123;
        System.out.println("BEFORE");
        System.out.println(Arrays.toString(shortArray));
        System.out.println(Arrays.toString(shortArray2));
        shortArray[shortArray.length-1] = 23;
        shortArray2[0] = 34;
        shortArray2[shortArray2.length-1] = 99;
        System.out.println("AFTER");
        System.out.println(Arrays.toString(shortArray));
        System.out.println(Arrays.toString(shortArray2));
    }
}
