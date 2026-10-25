/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.sumuntilsentinelvalue;
import java.util.Scanner;

/**
 *
 * @author markjimuel
 */
public class SumUntilSentinelValue {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int total = 0;
        
        System.out.println("------------------------------");
        System.out.println("   Sum Until Sentinel Value   ");
        System.out.println("------------------------------");
        
        while (true) {
            System.out.print("Enter a Number: ");            
            int inputNumber = userInput.nextInt();
            
            if (inputNumber == -1) {
                break;
            }
           total += inputNumber;
        }
        
        System.out.println("\nFinal total: " + total);
        
    }
}
