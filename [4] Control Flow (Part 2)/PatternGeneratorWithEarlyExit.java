/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.patterngeneratorwithearlyexit;

/**
 *
 * @author markjimuel
 */
public class PatternGeneratorWithEarlyExit {

    public static void main(String[] args) {
        int size = 11; 
        
        System.out.println("------------------------------");
        System.out.println("   Square Pattern Generator   ");
        System.out.println("------------------------------");
        
        for (int i = 1; i <= size; i++) { // This is the outer loop.
            if (i == 6) { // With this line, it will skip row 6 in the pattern since the line clearly demonstrated continue.
                System.out.println(); // This will print a new line to show that row 6 is getting skipped.
                continue;
            }
            for (int j = 1; j <= size; j++) { // This is the inner loop.
                if (j == 8) { // With this line, it breaks the inner loop. Meaning, it will stop showing the number 8 to 11 and continues to print 1 to 7 for the next rows. 
                    break;
                }
                System.out.print(j + " ");
            } 
            System.out.println();
        }
    }
}
