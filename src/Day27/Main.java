package Day27;

public class Main {
    public static void main(String[] args) {
        String str = "aaaxs";
        System.out.println(str.indexOf("x"));
        // 3+1
        // 3 < str.length-1 -> false
    }

    public int[] front11(int[] a, int[] b) {
        if(a.length==0 && b.length==0){
            return new int[]{};
        }
        else if(a.length == 0){
            return new int[]{ b[0] };
        }
        else if(b.length == 0){
            return new int[]{a[0]};
        }
        else{
            return new int[]{a[0],b[0]};
        }
    }

}
