/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.nestedloginvalidator;
import java.util.Scanner;

/**
 *
 * @author markjimuel
 */
public class NestedLoginValidator {

    public static void main(String[] args) {
        String storedUsername1 = "ChoiSan", storedUsername2 = "Eric";
        String storedPassword1 = "@Admin.ChoiSan0710", storedPassword2 = "!Admin.SohnYoungjae1222";
        boolean accountLocked;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("-----------------------------");
        System.out.println("        Account Login        ");
        System.out.println("-----------------------------");
        System.out.print("Enter Username: ");
        String userInputUsername = userInput.nextLine(); 
        
        if (userInputUsername.equals(storedUsername1) || userInputUsername.equals(storedUsername2)) { // Checks if the user input username matches.
            System.out.print("Enter Password: "); // If inputted username matches, it will request a password.
            String userInputPassword = userInput.nextLine();
            
                if (userInputUsername.equals(storedUsername1) && userInputPassword.equals(storedPassword1)) { // If inputted username and password matches, it will check if the account is locked.
                    accountLocked = false; // User1's account is not locked.
                    
                    if (accountLocked == false) {
                        System.out.println("Success: Welcome Choi San! You are logged in."); // If account is not locked. 
                    } 
                    else {
                        System.out.println("Error: Login is Blocked. Your account is locked."); // If account is locked.
                    }
                }
                else if (userInputUsername.equals(storedUsername2) && userInputPassword.equals(storedPassword2)) { // If inputted username and password matches, it will check if the account is locked.
                    accountLocked = true; // User2's account is locked.
                    
                    if (accountLocked == false) {
                        System.out.println("Success: Welcome Eric! You are logged in."); // If account is not locked.
                    } 
                    else {
                        System.out.println("Error: Login is Blocked. Your account is locked."); // If account is locked.
                    }
                }
                else {
                    System.out.println("Error: Incorrect Password."); // If user inputted an incorect password.
            }
        }
        else {
            System.out.println("Error: Username not found."); // If user inputted an incorrect username.
        }
    }
}
