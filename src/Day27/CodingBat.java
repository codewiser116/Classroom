package Day27;

public class CodingBat {
    public static void main(String[] args) {
        System.out.println(stringYak("ybkpayck"));
    }

    public static String stringYak(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'y' &&  str.charAt(i+2) == 'k'){
                i+=2;
            }
            else{
                result+=str.charAt(i);
            }
        }
        return result;
    }


}
