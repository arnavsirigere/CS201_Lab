public abstract class Figure implements FigureInterface {

    // Implementing the abstract method from FigureInterface
    @Override
    public abstract int getNumberOfSides();

    // New abstract method to return the area of the figure
    public abstract double calculateArea();
}
