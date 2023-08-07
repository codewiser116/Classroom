package Day37.animals;

public class Parrot extends Animal implements FlyAble{


    @Override
    public void fly() {
        System.out.println("FLY");
    }
}
