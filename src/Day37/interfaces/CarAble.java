package Day37.interfaces;

public interface CarAble {

    int price = 0;

    void start();
    void stop();
    void accelerate();
    void turnRight();
    void turnLeft();

    default void hello(){

    }

}
