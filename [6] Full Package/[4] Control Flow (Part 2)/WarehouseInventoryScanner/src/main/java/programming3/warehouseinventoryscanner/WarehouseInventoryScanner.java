/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.warehouseinventoryscanner;
import java.util.Scanner;

/**
 *
 * @author markjimuel
 */
public class WarehouseInventoryScanner {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        int [][] wareHouse = {{50, 9, -1, 10, 23}, {15, 8, 45, -1, 40}, {-1, 10, 7, -1, 30}};
        int choice = 0; // Initialize to 0 to prevent compilation errors
        
        do {
            System.out.println("------------------------------");
            System.out.println("   Warehouse Inventory Menu   ");
            System.out.println("------------------------------");
            System.out.println("[1] Display Shelf");
            System.out.println("[2] Check Critical Shelf");
            System.out.println("[3] Total Inventory");
            System.out.println("[4] Restock Shelf");
            System.out.println("[5] Exit");
            System.out.print("\nEnter your choice: ");
            
            choice = userInput.nextInt();
            
            switch (choice) {
                case 1:
                    displayShelf(wareHouse);
                    break;
                case 2:
                    checkCriticalShelf(wareHouse);
                    break;
                case 3:
                    totalInventory(wareHouse);
                    break;
                case 4:
                    restockShelf(wareHouse, userInput);
                    break;
                case 5:
                    System.out.println("Exiting... \nClosing Warehouse Scanner. \nGoodbye!");
                    break;
                default:
                    System.out.println("Invalid Choice: Please enter a number between 1 and 5.");
            } 
        } while (choice !=5);
    }
    
    public static void displayShelf(int[][] wareHouse) {
        System.out.println("\n--- Warehouse Inventory Shelf ---");
            for (int i = 0; i < wareHouse.length; i++) {
                for (int j = 0; j < wareHouse[i].length; j++) {
                    
                    if (wareHouse[i][j] == -1) {
                        System.out.print("X\t"); // Displaying X as a damage shelf.
                    } else {
                        System.out.print(wareHouse[i][j] + "\t");
                    }
                }
                System.out.println();
            } 
    }

    public static void checkCriticalShelf(int[][] wareHouse) {
        int criticalThreshold = 10; // Stock amount to be considered critical.
        boolean found = false;
        
        System.out.println("\n--- Scanning for Critical Shelves ---");
            for (int i = 0; i < wareHouse.length; i++) {
                for (int j = 0; j < wareHouse[i].length; j++) {
                    if (wareHouse[i][j] != -1 && wareHouse[i][j] < criticalThreshold) {
                        System.out.println("Critical Shelf Found at Row " + i + ", Column " + j + " (Current Stock: " + wareHouse [i][j] + ")");
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }
        if (!found) {
            System.out.println("No Critically Low Shelves Found.");
        }
    }

    public static void totalInventory(int[][] wareHouse) {
        int total = 0;
        
        System.out.println("\n--- Calculating Total Inventory ---");
        for (int i = 0; i < wareHouse.length; i++) {
            for (int j = 0; j < wareHouse[i].length; j++) {
                if (wareHouse[i][j] == -1) {
                    continue;
                }
                total += wareHouse [i][j];
            }
        }
        System.out.println("Total Inventory Count: " + total);   
    }
    
    public static void restockShelf(int[][] wareHouse, Scanner userInput) {
        System.out.println("\n--- Restock Shelf ---");
        System.out.print("Enter Row index (0-2): ");
            int row = userInput.nextInt();
        System.out.print("Enter Column index (0-4): ");
            int col = userInput.nextInt();
            
        if (row < 0 || row >= wareHouse.length || col < 0 || col >= wareHouse[0].length) {
            System.out.println("Error: Invalid shelf location.");
            return;
        }
        if (wareHouse[row][col] == -1) {
            System.out.println("Error: Cannot restock a damaged shelf.");
            return;
        }
        
        while (true) {
            System.out.print("Enter amount to restock (must be greater than 0): ");
            int restockAmount = userInput.nextInt();
            
            if (restockAmount > 0) {
                wareHouse[row][col] += restockAmount;
                System.out.println("Success: Added " + restockAmount + " items. New total is " + wareHouse[row][col] + ".");
                return; // Exits the method immediately upon success
            } else {
                System.out.println("Error: Restock amount must be a positive number.");
            }
        }
    }
}    

    