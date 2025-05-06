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
public class w2Ex2 {
   public static void main (String [] args){
     Scanner sc = new Scanner(System.in);
       int m=2, r=3;
     
     System.out.println("please enter value of v");
     double v=sc.nextDouble();
     double T = (m*v*v)/r;
     
     if(T > 60){
         System.out.println("maximum tension: "+ T);
         System.out.println("speed will cause the rope to break");
     }
     else{
         System.out.println("maximum tension: "+ T);
     }
            
   } 
}
