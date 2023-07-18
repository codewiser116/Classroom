package Day25;

public class Person {
    static int wallet = 5000;
    String project = "Sony";
    String wifi;


    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println("BEFORE");
        System.out.println(Person.wallet);
        System.out.println(person2.wallet);

        person1.wallet = 4000;
        person2.wallet = 1000;
        System.out.println("AFTER");
        System.out.println(person1.wallet);
        System.out.println(person2.wallet);

    }
}
