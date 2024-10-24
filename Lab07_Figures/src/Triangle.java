public class Triangle extends Figure {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    // Getter method to retrieve height
    public double getHeight() {
        return height;
    }

    // Getter method to retrieve base
    public double getBase() {
        return base;
    }

    // Setter method to modify height
    public void setHeight(double height) {
        this.height = height;
    }

    // Setter method to modify base
    public void setBase(double base) {
        this.base = base;
    }

    // Implementing the abstract method to return the number of sides
    @Override
    public int getNumberOfSides() {
        return 3;
    }

    // Implementing the abstract method to calculate the area
    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    // toString method to provide string representation
    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + String.format("%.2f", getBase()) +
                ", height=" + String.format("%.2f", getHeight()) +
                ", area=" + String.format("%.2f", calculateArea()) +
                ", number of sides=" + getNumberOfSides() +
                "}\n";
    }
}
