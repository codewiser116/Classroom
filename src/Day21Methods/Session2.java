package Day21Methods;

public class Session2 {
    public static void main(String[] args) {
        int[] array = {5, 10, 15, 20, 25, 4};
        calculateAverageOfArray(array);

        int[] array2 = {2342, 1354, 11, 3245};
        calculateAverageOfArray(array2);

        int[] array3 = {121, 34, 1, 99, 32};
        calculateAverageOfArray(array3);
    }


    public static int calculateSumOfArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+= array[i];
        }
        return sum;
    }

    public static double calculateAverage(int sum, int size){
        return (double)sum/size;
    }

    public static void calculateAverageOfArray(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum+= array[i];
        }
        System.out.println((double)sum/array.length);
    }
}
