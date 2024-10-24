import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class GroceryList {

    private final LinkedList<String> groceryList = new LinkedList<String>();
    private final Scanner scanner;

    public GroceryList(Scanner scanner) {
        this.scanner = scanner;
    }

    public String addNewItem() {
        String item = "";

        try {
            do {
                System.out.print("Enter the grocery item: ");
                item = scanner.next();

                if (groceryList.contains(item)) {
                    System.out.println("Item already exists in the grocery list. Please enter a different item: ");
                }
            } while (groceryList.contains(item));

            groceryList.add(item);
            sortItems();

        } catch(Exception e) {
            System.out.println("Ann error occurred : " + e.getMessage());
        }

        return item;
    }

    public String removeItem() {
        String item = "";

        try {
            do {
                System.out.print("Enter the grocery item you want to remove: ");
                item = scanner.next();

                if (!groceryList.contains(item)) {
                    System.out.println("Item does not exist in the grocery list. Please enter a different item: ");
                }
            } while (!groceryList.contains(item));

            groceryList.remove(item);

        }  catch(Exception e) {
            System.out.println("Ann error occurred : " + e.getMessage());
        }

        return item;
    }

    public boolean checkItem() {
        System.out.print("Enter the item you would like to check for: ");
        String item = scanner.next();
        return groceryList.contains(item);
    }

    public void printList() {
        try {
            if (groceryList.isEmpty()) {
                System.out.println("The grocery list is empty.");
            } else {
                System.out.println("Here is the sorted Grocery List:");
                for (int i = 0; i < groceryList.size(); i++) {
                    System.out.printf("%d - %s\n", i, groceryList.get(i));
                }
            }
        } catch(Exception e) {
            System.out.println("Ann error occurred : " + e.getMessage());
        }
    }

    public int getItemCount() {
        return groceryList.size();
    }

    public void clearList() {
        groceryList.clear();
    }

    public void sortItems() {
        groceryList.sort(Comparator.naturalOrder());
    }
}