/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */
import java.util.*;

public class w4ex1 {
   public static void main(String [] args){
       Scanner sc= new Scanner(System.in);
       
       System.out.println("enter a number: ");
       int num=sc.nextInt();
       
       int fac=1;
       System.out.println("n\t\tn!");

       for(int x=0; x<=num; x++){
        if(x==0){
	  fac=1;
	  System.out.println(x+"\t\t"+fac);
        }
        else{
           fac *=x;
           System.out.println(x+"\t\t"+fac);
        } 
       
       }
   }
}
