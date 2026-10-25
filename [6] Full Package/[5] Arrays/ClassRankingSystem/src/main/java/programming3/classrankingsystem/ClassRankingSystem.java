/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.classrankingsystem;
import java.util.Scanner;

/**
 *
 * @author markjimuel
 */
    class Student {
        String studentName;
        int[] studentQuizzes;
        double studentAverage;
        
        public Student(String name, int[] quizzes) {
            this.studentName = name;
            this.studentQuizzes = quizzes;
            this.studentAverage = calculateAverage();
        }
        
        private double calculateAverage() {
            int sum = 0;
            for (int i = 0; i < studentQuizzes.length; i++) {
                sum += studentQuizzes[i];
            }
        return (double) sum / studentQuizzes.length;
        }
    }

    public class ClassRankingSystem {
        public static void main(String[] args) {
            String[] studentNames = {"Dokyeom", "Intak", "Jeno", "Jaemin", "Junyoung"};
            int [][] rawStudentQuiz = {{85, 90, 92, 88}, {90, 90, 90, 90}, {80, 100, 90, 90}, {70,75,80,85}, {95, 96, 99, 98}};
            
            Student[] students = new Student[studentNames.length];
            for (int i = 0; i < studentNames.length; i++) {
                students[i] = new Student(studentNames[i], rawStudentQuiz[i]);
            }
            
            for (int i = 0; i < students.length - 1; i++) {
                for (int j = 0; j < students.length - i - 1; j++) {
                    if (students[j].studentAverage < students[j +1].studentAverage) {
                    Student temp = students [j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                    }
                }
            }
            System.out.println("--- Class Leaderboard ---");
        int currentRank = 1;
        
        for (int i = 0; i < students.length; i++) {
            // Update the rank ONLY if the current average is strictly lower than the previous student's average.
            if (i > 0 && students[i].studentAverage < students[i - 1].studentAverage) {
                currentRank = i + 1; 
            }
            
            System.out.printf("Rank %d: %-8s | Average: %.2f\n", currentRank, students[i].studentName, students[i].studentAverage);
        }

        // 5. Dynamic Searching using Scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("\n--- Searching for Student ---");
        System.out.print("Enter Student Name: ");
        
        // Read the user's input from the console
        String targetStudent = input.nextLine(); 
        
        int foundRank = findStudentRank(students, targetStudent);
        
        if (foundRank != -1) {
            System.out.println("Success: " + targetStudent + " is currently holding Rank " + foundRank + ".");
        } else {
            System.out.println("Error: " + targetStudent + " is not enrolled in this class.");
        }
        
        input.close();
    }

    // Write your OWN linear search returning a student's rank.
    public static int findStudentRank(Student[] sortedClass, String targetName) {
        int rank = 1;
        for (int i = 0; i < sortedClass.length; i++) {
            
            // Replicate the tie-handling logic to ensure accurate rank reporting
            if (i > 0 && sortedClass[i].studentAverage < sortedClass[i - 1].studentAverage) {
                rank = i + 1;
            }
            
            // Check for a match (equalsIgnoreCase ensures "bob" and "Bob" both work)
            if (sortedClass[i].studentName.equalsIgnoreCase(targetName)) {
                return rank; 
            }
        }
        return -1; 
    }
}        

