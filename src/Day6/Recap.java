package Day6;

public class Recap {
    public static void main(String[] args) {
//        // 123 - digit
//        // *** to get last number anytime, use % 10
//        // getting first digit and so on, depends on number of digits
//        // to get first digit, divide it by 100
//        // to get second digit, divide it by 10 and modulus 10
//        int number = 125;
//        int firstDigit = number / 100;
//        int secondDigit = number / 10 % 10;
//        int thirdDigit = number % 10;
//
//        System.out.println(thirdDigit + ", " + secondDigit + ", " + firstDigit);

        // 9876 - 4 digit
        // 9876 / 10 = 987
        int number = 9876;
        int firstDigit = number / 1000;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int lastDigit = number % 10;
        System.out.println(firstDigit + ", " + secondDigit + ", " + thirdDigit + ", " + lastDigit);
    }
}
