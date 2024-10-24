public class Main {
    public static void main(String[] args) {
        // Testing Circle
        Circle circle = new Circle(5.0);
        circle.displayFigureName("Circle");
        System.out.println(circle.toString());

        // Testing Triangle
        Triangle triangle = new Triangle(4.0, 3.0);
        triangle.displayFigureName("Triangle");
        System.out.println(triangle.toString());

        // Testing Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.displayFigureName("Rectangle");
        System.out.println(rectangle.toString());
    }
}
