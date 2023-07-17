package Day24;

public class Zoo {
    public static void main(String[] args) {
        Animal snake = new Animal("Snake",3,
                "SNAKE", "BLACK", "BIG");
        snake.print();
        Animal dog = new Animal("Dog", 6, "DOG", "GREY",
                "SMALL", "4");
        dog.print();

    }

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }

}
