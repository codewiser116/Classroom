package Day15WhileLoop;

public class IntroToWhileLoop {

    public static void main(String[] args) {
        /*
        print number from 1 to 10 using for loop
         */

        for (int i = 1; i <= 10; i++){
            System.out.println("for loop: " + i);
        }

        //print numbers from 1 to 10 using while loop

        int k = 1;

        while (k <= 10){
            System.out.println("while loop: " + k);
            k++;
        }

        //using while loop, print "I'm good at coding" 20 times

        int l = 1;
        while (l <= 20){
            System.out.println("I'm good at coding");
            l++;
        }


        // print numbers from 50 to 1

        int b = 50;

        while (b > 0){
            System.out.println(b);
            b = b - 5;
        }

        /*
        Create 10 boolean variables: using int, short, double, String
         */

        boolean b1 = 1 < 10;

        String s1 = "efkhjrnaelrgnlaer";
        boolean b2 = s1.contains("a");

        boolean b3 = s1.length() > 20;

        boolean b4 = "b3".length() == 8;

        boolean b5 = "Chicago".charAt(0) == 'c';

        while(s1.length() > 20){
            System.out.println("inside while loop");
        }


        System.out.println("code after while loop");











    }
}
