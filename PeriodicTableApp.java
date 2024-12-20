import java.util.Scanner;
import java.util.HashMap;

public class PeriodicTableApp {
    public static void main(String[] args) {
        // Create a HashMap to store element details
        HashMap<String, String[]> periodicTable = new HashMap<>();

        // Add elements to the periodic table
        periodicTable.put("Hydrogen", new String[]{"H", "1", "1.008", "Non-metal"});
        periodicTable.put("Helium", new String[]{"He", "2", "4.0026", "Noble Gas"});
        periodicTable.put("Lithium", new String[]{"Li", "3", "6.94", "Alkali Metal"});
        periodicTable.put("Beryllium", new String[]{"Be", "4", "9.0122", "Alkaline Earth Metal"});
        periodicTable.put("Boron", new String[]{"B", "5", "10.81", "Metalloid"});
        periodicTable.put("Carbon", new String[]{"C", "6", "12.011", "Non-metal"});
        periodicTable.put("Nitrogen", new String[]{"N", "7", "14.007", "Non-metal"});
        periodicTable.put("Oxygen", new String[]{"O", "8", "15.999", "Non-metal"});
        periodicTable.put("Fluorine", new String[]{"F", "9", "18.998", "Halogen"});
        periodicTable.put("Neon", new String[]{"Ne", "10", "20.180", "Noble Gas"});
        periodicTable.put("Sodium", new String[]{"Na", "11", "22.990", "Alkali Metal"});
        periodicTable.put("Magnesium", new String[]{"Mg", "12", "24.305", "Alkaline Earth Metal"});
        periodicTable.put("Aluminum", new String[]{"Al", "13", "26.982", "Post-Transition Metal"});
        periodicTable.put("Silicon", new String[]{"Si", "14", "28.085", "Metalloid"});
        periodicTable.put("Phosphorus", new String[]{"P", "15", "30.974", "Non-metal"});
        periodicTable.put("Sulfur", new String[]{"S", "16", "32.06", "Non-metal"});
        periodicTable.put("Chlorine", new String[]{"Cl", "17", "35.45", "Halogen"});
        periodicTable.put("Argon", new String[]{"Ar", "18", "39.948", "Noble Gas"});
        periodicTable.put("Potassium", new String[]{"K", "19", "39.098", "Alkali Metal"});
        periodicTable.put("Calcium", new String[]{"Ca", "20", "40.078", "Alkaline Earth Metal"});
        periodicTable.put("Scandium", new String[]{"Sc", "21", "44.956", "Transition Metal"});
        periodicTable.put("Titanium", new String[]{"Ti", "22", "47.867", "Transition Metal"});
        periodicTable.put("Vanadium", new String[]{"V", "23", "50.942", "Transition Metal"});
        periodicTable.put("Chromium", new String[]{"Cr", "24", "51.996", "Transition Metal"});
        periodicTable.put("Manganese", new String[]{"Mn", "25", "54.938", "Transition Metal"});
        periodicTable.put("Iron", new String[]{"Fe", "26", "55.845", "Transition Metal"});
        periodicTable.put("Cobalt", new String[]{"Co", "27", "58.933", "Transition Metal"});
        periodicTable.put("Nickel", new String[]{"Ni", "28", "58.693", "Transition Metal"});
        periodicTable.put("Copper", new String[]{"Cu", "29", "63.546", "Transition Metal"});
        periodicTable.put("Zinc", new String[]{"Zn", "30", "65.38", "Transition Metal"});
        periodicTable.put("Gallium", new String[]{"Ga", "31", "69.723", "Post-Transition Metal"});
        periodicTable.put("Germanium", new String[]{"Ge", "32", "72.63", "Metalloid"});
        periodicTable.put("Arsenic", new String[]{"As", "33", "74.922", "Metalloid"});
        periodicTable.put("Selenium", new String[]{"Se", "34", "78.971", "Non-metal"});
        periodicTable.put("Bromine", new String[]{"Br", "35", "79.904", "Halogen"});
        periodicTable.put("Krypton", new String[]{"Kr", "36", "83.798", "Noble Gas"});
        periodicTable.put("Rubidium", new String[]{"Rb", "37", "85.468", "Alkali Metal"});
        periodicTable.put("Strontium", new String[]{"Sr", "38", "87.62", "Alkaline Earth Metal"});
        periodicTable.put("Yttrium", new String[]{"Y", "39", "88.906", "Transition Metal"});
        periodicTable.put("Zirconium", new String[]{"Zr", "40", "91.224", "Transition Metal"});

        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            // Display menu
            System.out.println("\nPeriodic Table App");
            System.out.println("1. Search by Element Name");
            System.out.println("2. Search by Symbol");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    // Search by element name
                    System.out.print("Enter element name: ");
                    String name = scanner.nextLine();
                    if (periodicTable.containsKey(name)) {
                        String[] details = periodicTable.get(name);
                        System.out.println("Name: " + name);
                        System.out.println("Symbol: " + details[0]);
                        System.out.println("Atomic Number: " + details[1]);
                        System.out.println("Atomic Weight: " + details[2]);
                        System.out.println("Category: " + details[3]);
                    } else {
                        System.out.println("Element not found!");
                    }
                    break;

                case "2":
                    // Search by symbol
                    System.out.print("Enter element symbol: ");
                    String symbol = scanner.nextLine();
                    boolean found = false;
                    for (String key : periodicTable.keySet()) {
                        if (periodicTable.get(key)[0].equalsIgnoreCase(symbol)) {
                            String[] details = periodicTable.get(key);
                            System.out.println("Name: " + key);
                            System.out.println("Symbol: " + details[0]);
                            System.out.println("Atomic Number: " + details[1]);
                            System.out.println("Atomic Weight: " + details[2]);
                            System.out.println("Category: " + details[3]);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found!");
                    }
                    break;

                case "3":
                    // Exit the program
                    System.out.println("Exiting the app. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (!choice.equals("3"));

        scanner.close();
    }
}