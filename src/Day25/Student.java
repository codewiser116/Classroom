package Day25;

public class Student {

    static String batchName = "Batch Three";

    String studentName;
    String studentEmail;

    public void eatingWatermelon(){

        String name = "";
        System.out.println("eating watermelon");
    }

    public static void studiesAtCodewise(){
        System.out.println("studies at Codewise");
    }




    public static void main(String[] args) {
        Student john = new Student();
        john.studentName = "john";
        john.studentEmail = "john@gmail.com";

        Student lisa = new Student();
        lisa.studentName = "lisa";
        lisa.studentEmail = "lisa@gmail.com";

        System.out.println(lisa.studentName);
        lisa.studentName = "elizabeth";

        System.out.println(batchName); //
        System.out.println(lisa.studentName);

        System.out.println(john.batchName); //batch five
        System.out.println(john.studentEmail); //





    }


}
