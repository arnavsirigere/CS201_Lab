import java.io.*;
import java.util.Scanner;

public class MaterialTemperature {
    public static void main(String[] args) {
        // Writing data to new text file

        String[] initialMaterialData = {
                "AluminumBased,Aluminum,1.25,2.5,0.000013,10000000,23",
                "Metal,Brass,2.25,25.0, 0.00001,13000000,40",
                "Metal,Copper,2.25,25.0,0.0000094,16000000,37",
                "Cellulose,CelluloseAcetate,2.5,5.0,0.000130,20000000,89",
                "Metal,Lead,2.25,25.0, 0.000017,2300000,100",
                "Glass,Hard,0.4,3.0,0.0000059,90000000,150",
                "Metal,Steel,2.25, 25.0,0.0000067,29000000,10",
                "Metal,Iron,2.25,25.0, 0.0000067,13000000,26"
        };

        try {
            // Create print writer object to create new file
            PrintWriter printWriter = new PrintWriter("temperature.txt");

            // Write data
            for (String materialData : initialMaterialData) {
                printWriter.println(materialData);
            }

            printWriter.close();

            System.out.println("Successfully wrote data to new text file!\n");

        } catch(FileNotFoundException e) {
            System.out.println("There was an error: " + e.getMessage()); // Print error message
        }

        // Appending data to existing text file

        String[] newMaterialData = {
                "Metal,Iron,0.25,25.0, 0.0000067,13000000,56",
                "Glass,Pyrex,1.4,3.0,0.000004,17000000,200"
        };

        try {
            // Create print writer object using file writer to append data
            FileWriter fileWriter = new FileWriter("temperature.txt", true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Append extra data
            for (String materialData : newMaterialData) {
                printWriter.println(materialData);
            }

            printWriter.close();

            System.out.println("Successfully appended data to existing text file!\n");

        } catch(IOException e) {
            System.out.print("An error occurred: " + e.getMessage()); // Print error message
        }

        // Reading data from text file

        try {
            // Create scanner object to read data form file
            File file = new File("temperature.txt");
            Scanner fileScanner = new Scanner(file);

            int dataCounter = 0; // Total data entries in file
            double temperatureSum = 0; // Sum of temperatures of all materials

            do {
                String dataEntry = fileScanner.nextLine(); // Data entry line from file

                displayFormattedData(dataEntry); // Display formatted data entry

                // Retrieve temperature of material

                String[] dataPoints = dataEntry.split(",");

                double temperature = Double.parseDouble(dataPoints[dataPoints.length - 1]);
                temperatureSum += temperature;

                dataCounter++;
            } while(fileScanner.hasNext());

            double temperatureAvg = temperatureSum / dataCounter; // Compute average temperature

            System.out.printf("The average temperature is %.2f", temperatureAvg); // Print average temperature

        } catch(FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage()); // Print error message
        }
    }

    // Method to display formatted data entries

    public static void displayFormattedData(String dataEntry) {
        String[] dataHeaders = { "Category", "Name of Material", "Cross-Sectional Area", "Length of Material", "Coefficient of Thermal Expansion", "Young’s Modulus", "Temperature" };
        String[] dataPoints = dataEntry.split(",");

        for (int i = 0; i < dataHeaders.length; i++) {
            System.out.printf("%s: %s\n", dataHeaders[i], dataPoints[i]);
        }

        System.out.println("\n");
    }
}
