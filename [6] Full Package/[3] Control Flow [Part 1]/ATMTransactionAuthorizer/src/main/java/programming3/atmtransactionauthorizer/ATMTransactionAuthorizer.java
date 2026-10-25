/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.atmtransactionauthorizer;
import java.util.Scanner;

/**
 *
 * @author markjimuel
 */
public class ATMTransactionAuthorizer {

    public static void main(String[] args) {
        String storedUsername = "Minghao", tier;
        int storedPIN = 1107;
        double accountBalance = 453000.0, dailyLimit = 0.0;
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("------------------------------");
        System.out.println("       ATM Transaction        ");
        System.out.println("------------------------------");
        System.out.print("Enter Username: ");
        String userInputUsername = userInput.nextLine(); 
        
            if (userInputUsername.equals(storedUsername)) {
                System.out.print("Enter 4-Digit PIN: ");
                int userInputPIN = userInput.nextInt();
                
                    if (userInputPIN == storedPIN) {
                        System.out.println("Authentication Success! Welcome Xu Minghao!\n");
                        
                        if (accountBalance >= 500000.0){
                            tier = "Platinum";
                            dailyLimit = 100000.0;
                        }
                        else if (accountBalance >= 100000.0) {
                            tier = "Gold";
                            dailyLimit = 50000.0;
                        } 
                        else if (accountBalance >= 50000.0) {
                            tier = "Silver";
                            dailyLimit = 25000.0;
                        }
                        else {
                            tier = "Bronze";
                            dailyLimit = 10000.0;
                        }
                          
                            double feePercentage = 0.0;

                            switch (tier) {
                                case "Platinum":
                                    feePercentage = 0.5;
                                    break;
                                case "Gold":
                                    feePercentage = 1.0;
                                    break;
                                case "Silver":
                                    feePercentage = 2.0; 
                                    break;
                                case "Bronze":
                                    feePercentage = 3.0;
                                    break;
                            }
                        System.out.println("Account Tier: " + tier);
                        System.out.println("Daily Limit: $" + dailyLimit);
                        System.out.println("Available Balance: $" + accountBalance);
                        System.out.print("\nEnter Withdrawal Amount: $");
                        double userInputWithdrawal  = userInput.nextDouble();
                        
                            double feeAmount = userInputWithdrawal * (feePercentage / 100);
                            double totalFee = userInputWithdrawal + feeAmount;
                           
                            if (userInputWithdrawal <= dailyLimit) {
                                
                                if (totalFee <= accountBalance) {
                                    accountBalance -= totalFee;
                                    System.out.println("\n----- Transaction Status -----");
                                    System.out.println("Transaction: APPROVE");
                                    System.out.println("Amount Withdrawn: $" + userInputWithdrawal);
                                    System.out.println("Transaction Fee: $" + feeAmount + " (" + feePercentage + "%)");
                                    System.out.println("New Balance: $" + accountBalance);
                                }
                                else {
                                    System.out.println("\n----- Transaction Status -----");
                                    System.out.println("Transactio: DENY");
                                    System.out.println("Reason: Insufficient funds to cover withdrawal amount plus the $" + feeAmount + " transaction fee.");
                                }
                            }
                            else {
                                System.out.println("\n----- Transaction Status -----");
                                System.out.println("Transaction: DENY");
                                System.out.println("Reason: Amount exceeds your daily witdrawal limit of $" + dailyLimit + " for the " + tier + " tier.");
                            }
                    }
                    else {
                        System.out.println("\n----- Transaction Status -----");
                        System.out.println("Transaction: DENY");
                        System.out.println("Reason: Incorrect PIN.");
                    }
            }
            else {
                System.out.println("\n----- Transaction Status -----");
                System.out.println("Transaction: DENY");
                System.out.println("Reason: Username not found.");
            }
    }
}
