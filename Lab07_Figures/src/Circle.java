public class Circle extends Figure {
    private double radius;

    // Constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter method to retrieve radius
    public double getRadius() {
        return radius;
    }

    // Setter method to modify radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementing the abstract method to return the number of sides
    @Override
    public int getNumberOfSides() {
        return 0;
    }

    // Implementing the abstract method to calculate the area
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    // toString method to provide string representation
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + String.format("%.2f", getRadius()) +
                ", area=" + String.format("%.2f", calculateArea()) +
                ", number of sides=" + getNumberOfSides() +
                "}\n";
    }
}
