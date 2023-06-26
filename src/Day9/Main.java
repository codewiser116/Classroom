package Day9;

public class Main {
    public static void main(String[] args) {
        int age = 55;
        // 1st level - 4 letters or more - child
        // 2nd level - 6 letters or more - teen
        // 3rld level - 10 letters or more - adult
        if (age>=18 && age <=50){
            System.out.println("It is an adult");
        }

        else if(age>50){
            System.out.println("It is a senior");
        }
        else if(age>12){
            System.out.println("It is a teen");
        }

    }
}
