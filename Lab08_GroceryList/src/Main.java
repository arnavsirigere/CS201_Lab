import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static int totalMenuOptions = 6;

    public static void main(String[] args) {

        GroceryList groceryList = new GroceryList(scanner);

        printMenu();

        while (true) {

            int option = getOption();

            switch (option) {
                case 0: {
                    String item = groceryList.addNewItem();
                    System.out.printf("Successfully added the item %s in grocery list!\n", item);
                    break;
                }

                case 1: {
                    String item = groceryList.removeItem();
                    System.out.printf("Successfully removed the item %s from grocery list!\n", item);
                    break;
                }

                case 2: {
                    boolean itemExists = groceryList.checkItem();
                    System.out.printf("The item %s exist in the grocery list\n", itemExists ? "does" : "does not");
                    break;
                }

                case 3: {
                    groceryList.printList();
                    break;
                }

                case 4: {
                    int itemCount = groceryList.getItemCount();
                    System.out.printf("The grocery list has %d item%s.\n", itemCount, itemCount == 1 ? "" : "s");
                    break;
                }

                case 5: {
                    groceryList.clearList();
                    System.out.println("The grocery list has been successfully cleared!\n");
                    break;
                }

                case 6: {
                    System.out.print("Exiting the menu . . .");
                    return;
                }
            }

            System.out.println("");
        }
    }

    public static int getOption() {
        int option = -1;
        boolean invalidInputProvided = false;

        try {

            System.out.printf("Please select an action by entering a number between 0 and %s: \n", totalMenuOptions);

            while (option < 0 || option > totalMenuOptions) {
                if (invalidInputProvided) {
                    System.out.printf("Please select an action by entering a number between 0 and %s: \n", totalMenuOptions);
                }

                if (scanner.hasNextInt()) {
                    option = scanner.nextInt();
                    if (option < 0 || option > totalMenuOptions) {
                        System.out.printf("Invalid input! The selected action must lie within 0 to %s! Please try again!\n", totalMenuOptions);
                    }
                } else {
                    System.out.println("Invalid input, that's not a number! Please try again!");
                    scanner.next();
                }

                invalidInputProvided = true;
            }
        } catch(Exception e) {
            System.out.println("Ann error occurred : " + e.getMessage());
        }

        return option;
    }

    public static void printMenu() {
        String menu = """
                =======================
                  GROCERY LIST MENU
                =======================
                0 - Add Grocery Item
                1 - Remove Grocery Item
                2 - Check Item Existence in List
                3 - Display Sorted Grocery List
                4 - View total items in grocery list
                5 - Clear grocery list
                6 - Exit
                ------------------------
                 \n""";

        System.out.print(menu);
    }
}