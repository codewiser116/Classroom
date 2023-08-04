package Day36.shape;

public class ShapeMain {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.myShapeIs();
        System.out.println("Variable = "+circle1.name);
        System.out.println("------------");
        Circle circle2 = new Circle();
        circle2.myShapeIs();
        circle2.circleMethod();
        System.out.println("Variable = " +circle2.name);
    }
}
