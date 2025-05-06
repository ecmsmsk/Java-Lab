/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */
import java.util.Scanner;

public class w1EX1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.print("please enter how high is the wall in feet ");   
        int high=sc.nextInt();
        
        System.out.print("please enter how wide is the wall in feet ");
        int wide = sc.nextInt();
        
        
        int area = high*wide;   
        double cost = (area / 25) *5;
        
        System.out.println("The total area that needs to be painted : "+ area);
        System.out.println("The number of gallons for that room: " + area/25);
        System.out.println("The total cost of the paint : " + cost);
        
        
     
    }
}
