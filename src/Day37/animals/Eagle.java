package Day37.animals;

public class Eagle extends Animal implements FlyAble{


    @Override
    public void fly() {
        System.out.println("I am eagly and I can fly");
    }
}
