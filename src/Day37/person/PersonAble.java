package Day37.person;

public interface PersonAble {
    void sleep();
    void eat();

    default void breath(){
        System.out.println("I breath");
    }
}
