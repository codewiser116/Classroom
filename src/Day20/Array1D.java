package Day20;

public class Array1D {
    public static void main(String[] args) {
        int minValue = Integer.MIN_VALUE;
        System.out.println(minValue);

        int[] array = {1,2,100,100,99,99,5};
        int counterFor99 = 0, counterFor100 = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]==99){
                counterFor99++;
            }
            else if(array[i]==100){
                counterFor100++;
            }
        }
        if(counterFor99>=1 && counterFor100>=1){
            System.out.println("Good luck!");
        }
        else{
            System.out.println("See you tomorrow!");
        }
    }
}
