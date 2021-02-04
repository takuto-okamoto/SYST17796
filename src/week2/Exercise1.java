/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;
import java.util.Scanner;

/**
 *
 * @author Takuto
 */
public class Exercise1 {
//    The Discount Percent should display the percent (%) sign.
//    The Discounted Amount and Total should display the dollar ($) sign.
//    Here is a sample run:
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter customer type: ");
        String type = input.next();
        System.out.print("Enter subtotal: ");
        int subtotal = input.nextInt();
        
        int discount = 0;
        double total;
        
        if(type.equals("R")) {
            if(subtotal >= 250) {
                discount = 25;
            } else if(subtotal >= 100) {
                discount = 10;
            } else {
                discount = 0;
            }
        } else if (type.equals("C")) {
            if(subtotal >= 250) {
                discount = 30;
            } else {
                discount = 20;
            }
        }

        System.out.println("Discount percent: " + discount + "%");
        System.out.println("Discounted amount: $" + (subtotal * discount / 100));
        System.out.println("Total: $" + (subtotal - (subtotal * discount / 100)));
    }
}
