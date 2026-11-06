/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberreversal;
import java.util.*;
/**
 *
 * @author tapsd
 */
public class NumberReversal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        String num = input.next();
        int length = num.length();
        String Output = "";
        
        while (length > 0){
            Output = Output + num.charAt(length-1);
            length--;
        }
      System.out.println("Final Output: " + Output);
    }
}
