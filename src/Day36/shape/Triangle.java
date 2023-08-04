package Day36.shape;

public class Triangle extends Shape{
    String name = "triangle";

    @Override
    public void myShapeIs() {
        System.out.println("Triangle");
    }

    public void triangleMethod(){
        System.out.println("Triangle method");
    }
}
