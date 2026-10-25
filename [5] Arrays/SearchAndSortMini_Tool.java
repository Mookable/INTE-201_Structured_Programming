/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.searchandsortmini_tool;
import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author markjimuel
 */
public class SearchAndSortMini_Tool {

    public static void main(String[] args) {
        int[] originalScores = {85, 92, 78, 90, 89, 76, 95, 91};
        int index = -1;
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("------------------------------");
        System.out.println("         Array Search         ");
        System.out.println("------------------------------");
        
        int[] sortedScores = Arrays.copyOf(originalScores, originalScores.length);
        Arrays.sort(sortedScores);
        
        System.out.print("Enter a Score: ");
        int inputtedScore = userInput.nextInt();
        
        for (int i = 0; i < originalScores.length; i++) {
            if (originalScores[i] == inputtedScore) {
                index = i;
                break;
            }
        }
        
        System.out.println("\n---- Array Search Results ----");
            if (index != -1) {
                System.out.println("Score value " + inputtedScore + " was FOUND at index: " + index);
            } // Using array in java, the number 0 is must also considered. The counting of index starts at 0.
            else {
                System.out.println("Score value " + inputtedScore + " was NOT FOUND in the array.");
            } 
        System.out.println("\n--- Array List Comparison ---");
        System.out.println("Original List of Scores: " + Arrays.toString(originalScores));
        System.out.println("Sorted List of Scores: " + Arrays.toString(sortedScores));    
    }   /* Sorting a copy rather than the original array matters because it preserves the original
           order of the original array. If the original order correspond to other variables, sorting
           the original array would permanently mixed the connections of the variables. Using a copy
           allows to view the data in order without breaking the original array. */
}
