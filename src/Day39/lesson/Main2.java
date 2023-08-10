package Day39.lesson;

public class Main2 {
    public static void main(String[] args) {
        // remove all digits and symbols
        // reverse
        String word = "word123hi@hi"; // ihihdrow
        word = getDoneTask(word);
        System.out.println(word);
    }
        public static String removeDigitsSymbols(String word){
            String result = "";
            for(int i = 0; i<word.length(); i++){
                if(Character.isLetter(word.charAt(i))){
                    result += word.charAt(i);
                }
            }
            return result;
        }

        public static String reverse(String word){
            String reversedWord = "";
            for (int i = word.length()-1; i >=0; i--){
                reversedWord += word.charAt(i);
            }
            return reversedWord;
        }

        public static String getDoneTask(String word){
            word = removeDigitsSymbols(word);
            word = reverse(word);
            return  word;
        }




}
