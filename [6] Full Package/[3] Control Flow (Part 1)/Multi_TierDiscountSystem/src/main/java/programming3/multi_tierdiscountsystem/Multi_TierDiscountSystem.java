/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.multi_tierdiscountsystem;

/**
 *
 * @author markjimuel
 */
public class Multi_TierDiscountSystem {

    public static void main(String[] args) {
        double purchaseAmount = 504.49, discountPercent;
        
            if (purchaseAmount >= 1000.0) {
                discountPercent = 15.0;
            }
            else if (purchaseAmount >= 500.0) {
                discountPercent = 10.0;
            }
            else if (purchaseAmount >= 150.0) {
                discountPercent = 5.0;
            }
            else {
                discountPercent = 0.0;
            }
        
        double discountAmount = purchaseAmount * (discountPercent / 100);
        double discountedAmount = purchaseAmount - discountAmount;
        
        System.out.println("------------------------------");
        System.out.println("       Checkout Details       ");
        System.out.println("------------------------------");
        
        System.out.println("Original Price: $" + purchaseAmount);
        System.out.println("Discount Tier Applied: " + discountPercent + "%");
        System.out.println("Final Price: $" + discountedAmount);
    }
}
