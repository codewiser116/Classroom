package Day25;

public class Codingbat {

    public static void main(String[] args) {
        System.out.println(stringMatch("abz","abzlk"));
    }

    public static int stringMatch(String a, String b) {
        int counter = 0;
        int minLength = Math.min(a.length(), b.length());

        for(int i = 0; i < minLength-1; i++){
            String aFirstTwo = a.substring(i, i+2);
            String bFirstTwo = b.substring(i, i+2);
            if(aFirstTwo.equals(bFirstTwo)){
                counter++;
            }
        }
        return counter;
    }


    public static boolean noTriples(int[] nums) {
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2]){
                return false;
            }
        }
        return true;
    }
    public static String frontTimes(String str, int n) {
        // "batch3" 2
        // batbat
        int range = 3;
        if(str.length()<3){
            range = str.length();
        }
        String result = "";
        result+=str.substring(0,range);
        return result.repeat(n);
    }




}

