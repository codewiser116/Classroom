package Day25;

public class Human {
    int age;
    String name;

    public Human() {
        System.out.println("Hello");
    }

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void bestParametersOfPerson(double height, double weight){

    }

    public static void main(String[] args) {
        Human human1 = new Human(26,"Alex");
        Human human2 = new Human(66,"John");
        Human human3 = new Human(12,"Max");
    }

}
