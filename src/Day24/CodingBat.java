package Day24;

public class CodingBat {
    public static void main(String[] args) {
        String str = "awordxxdx";
        System.out.println(stringX(str));
    }

    public static String stringX(String str) {
        String result = "";
        result+= str.charAt(0);
        for(int i = 1; i < str.length()-1; i++){
            if(str.charAt(i) != 'x'){
                result+= str.charAt(i);
            }
        }
        result+= str.charAt(str.length()-1);
        return result;
    }


}
