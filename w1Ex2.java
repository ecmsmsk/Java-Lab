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

public class w1Ex2 {
    public static void main (String [] args){
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("This program will calculate miles per gallon.");
        
        System.out.print("Enter the miles driven: ");
        double milesDriven = sc.nextDouble();
        
        System.out.print("Enter the gallons of fuel used: ");
        double gallons = sc.nextDouble();
        
        double MPG= milesDriven / gallons; 
        System.out.print("The miles-per-gallon is  "+MPG+"\n");
       
        
        
    }
}
