package Day36.shape;

public class Circle extends Shape{
    String name = "circle";

    protected Circle(){

    }

    @Override
    public void myShapeIs() {
        System.out.println("Circle");
    }

    public void circleMethod(){
        System.out.println("Circle method");
    }
}
