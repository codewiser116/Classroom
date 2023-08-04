package Day36.shape;

public class Rectangle extends Shape{
    String name = "rectangle";

    @Override
    public void myShapeIs() {
        System.out.println("Rectangle");
    }

    public void rectangleMethod(){
        System.out.println("Rectangle method");
    }
}
