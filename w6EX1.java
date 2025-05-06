
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */
public class w6EX1 {
    public static void main (String [] args){
       Random rn = new Random ();
       int num = rn.nextInt(3999-1000+1)+1000;
       System.out.println("Number is "+ num);
       reverseNumber(num);
       System.out.println("reverse is "+ reverseNumber2(num));
    }
    
    public static void reverseNumber (int n){
        String val = "";
        System.out.println("Reverse: ");
        while(n !=0){
            System.out.print((n%10));
            n = n/10;
        }
        System.out.println();
    }
    
    public static int reverseNumber2 (int n){
        int val = 0;
        
        while(n != 0){
            val *= 10;
            val += (n%10);
            n = n/10;
        }
        return val;
    }
}
