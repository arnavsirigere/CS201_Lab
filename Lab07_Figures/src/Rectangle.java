public class Rectangle extends Figure {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Getter method to retrieve length
    public double getLength() {
        return length;
    }

    // Getter method to retrieve width
    public double getWidth() {
        return width;
    }

    // Setter method to modify length
    public void setLength(double length) {
        this.length = length;
    }

    // Setter method to modify width
    public void setWidth(double width) {
        this.width = width;
    }

    // Implementing the abstract method to return the number of sides
    @Override
    public int getNumberOfSides() {
        return 4;
    }

    // Implementing the abstract method to calculate the area
    @Override
    public double calculateArea() {
        return length * width;
    }

    // toString method to provide string representation
    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + String.format("%.2f", getLength()) +
                ", width=" + String.format("%.2f", getWidth()) +
                ", area=" + String.format("%.2f", calculateArea()) +
                ", number of sides=" + getNumberOfSides() +
                "}\n";
    }
}
