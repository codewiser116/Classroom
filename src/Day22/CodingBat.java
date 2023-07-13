package Day22;

public class CodingBat {
    public static void main(String[] args) {
        int[] array = {1, 2, 13, 2, 1, 13};
        System.out.println(sum13(array));
    }

    public static String stringTimes(String str, int n) {
        String result = "";
        for(int i = 1; i <= n; i++){
            result+=str;
        }
        return result;
    }
    public static int sum13(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==13){
                i+=2;
            }
            else{
                sum+=nums[i];
            }
        }
        return sum;
    }



}
