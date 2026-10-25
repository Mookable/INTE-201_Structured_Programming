/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.classstatisticscalculator;

/**
 *
 * @author markjimuel
 */
public class ClassStatisticsCalculator {

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 90, 89, 76, 95, 91};
        int sum = 0, highestScore = scores[0], lowestScore = scores[0];
        double average;
        
        System.out.println("------------------------------");
        System.out.println("       Class Statistics       ");
        System.out.println("------------------------------");
        System.out.print("List of Scores: ");
        
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i]);
            
            if ( i < scores.length - 1) {
                System.out.print(", ");
            }
        }
        
        for (int i = 0; i < scores.length; i++) {
            
            sum += scores[i];
            
            if (scores[i] > highestScore) {
                highestScore = scores [i];
            }
            
            if (scores[i] < lowestScore) {
                lowestScore = scores [i];
            }
        }
        
        average = sum / scores.length;
        
        System.out.println("\n\nTotal Sum: " + sum);
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highestScore);
        System.out.println("Lowest Score: " + lowestScore);
    }
}
