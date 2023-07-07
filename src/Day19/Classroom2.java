package Day19;

import java.util.Arrays;

public class Classroom2 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println(Arrays.toString(intArr));
//        System.out.println(intArr[0] * 2);
//        System.out.println(intArr[1] * 2);
//        System.out.println(intArr[2] * 2);
//        System.out.println(intArr[3] * 2);
//        System.out.println(intArr[4] * 2);
//        System.out.println(intArr[5] * 2);
//        System.out.println(intArr[6] * 2);
//        System.out.println(intArr[7] * 2);
//        System.out.println(intArr[8] * 2);
//        System.out.println(intArr[9] * 2);
        for(int i = 0; i < intArr.length; i++){
             intArr[i]*=2;
        }

        System.out.println(Arrays.toString(intArr));
    }
}
