/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.simplegradeclassifier;

/**
 *
 * @author markjimuel
 */
public class SimpleGradeClassifier {

    public static void main(String[] args) {
        int scoreOne = 90, scoreTwo = 60, scoreThree = 45, scorePassing = 0;
        
        System.out.println("-----------------------------");
        System.out.println("   Simple Grade Classifier   ");
        System.out.println("-----------------------------");
        
        System.out.println("(1) Score: " + scoreOne);
            if (scoreOne >= 60) {
                System.out.println("Remark: PASSED\n");
            }
            else {
                System.out.println("Remark: FAILED\n");
            }
        System.out.println("(2) Score: " + scoreTwo);
            if (scoreTwo >= 60) {
                System.out.println("Remark: PASSED\n");
            }
            else {
                System.out.println("Remark: FAILED\n");
            }
        System.out.println("(3) Score: " + scoreThree);
            if (scoreThree >= 60) {
                System.out.println("Remark: PASSED");
            }
            else {
                System.out.println("Remark: FAILED");
            }
    }
}
