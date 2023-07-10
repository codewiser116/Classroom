package Day20;

import java.util.Arrays;

public class Array2D {
    public static void main(String[] args) {

//        int[] array = {1,1,1,4,5};
//        for(int i = 0; i < array.length; i++){
//            System.out.print(array[i]+" ");
//        }
        // int[][] array2D = new int[4][3];
        // 4 - rows
        // 3 - columns
//        int[][] array2D = { {1,22,13},{3,42,99}, {1,2,34}, {98,11,67} };
//        for(int i = 0; i < array2D.length; i++){
//
//            for(int j = 0; j < array2D[0].length; j++){
//                System.out.print(array2D[i][j]+" ");
//            }
//            System.out.println();
//        }

        int[][] marks1 = new int[3][4];
        int[][] marks2 = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12},
                {13,14,15,16}, {1354, 12, 653, 1243}, {123, 764, 233, 1}};
        // rows start from 0
        // columns start from 0
        System.out.println(Arrays.deepToString(marks1));
        System.out.println(Arrays.deepToString(marks2));
        System.out.println(marks2[0][0]);
        System.out.println(marks2[0][3]);
        System.out.println(marks2[4][2]);
        System.out.println("ROWS = "+marks2.length);
        System.out.println("COLUMNS = "+marks2[0].length);
        marks2[0][0] = 5;
        marks2[marks2.length-1][marks2[3].length-1] = 5;


        int[][] marks3 = { {1,1,1,4}, {5,6,7,8}, {9,10,1,12},
                {1, 1, 233, 1}};
        System.out.println(Arrays.deepToString(marks3));
        for(int i = 0; i < marks3.length; i++){
            for(int j = 0; j < marks3[0].length; j++){
                if(marks3[i][j]==1){
                    marks3[i][j]=0;
                }
            }
        }
        System.out.println(Arrays.deepToString(marks3));
//        for(int i = marks3.length - 1; i >= 0; i--){
//
//            for(int j = marks3[0].length - 1; j>=0; j--){
//                System.out.print(marks3[i][j] + " ");
//            }
//            System.out.println();
//        }
    }
}
