/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package programming3.numberandsquareprinter;

/**
 *
 * @author markjimuel
 */
public class NumberAndSquarePrinter {

    public static void main(String[] args) {
        int count = 20;
        
        for (int i = 1; i <= count; i++) {
            int square = i * i;
            
            System.out.println("Number: " + i + " | Square: " + square);
        }
    }
}
