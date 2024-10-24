public interface FigureInterface {

    // Abstract method to return number of sides of figure
    int getNumberOfSides();

    // Default method to print the name of the figure
    default void displayFigureName(String figureName) {
        System.out.println("This figure is a " + figureName + ".");
    }
}
