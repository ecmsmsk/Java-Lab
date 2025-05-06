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

public class w2Ex1 {
    public static void main (String [] args){

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Please enter a year");
        int year = sc.nextInt();
        
        if(year%4==0 && year%100 != 0){
            System.out.println(year+" is leap");
        }
        else if(year%400 == 0){
            System.out.println(year+" is leap");
        }
        else{
            System.out.println(year+" is not  leap");
        }
    }
}
