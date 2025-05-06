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

public class w3Ex2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is the first word? ");
        String wrd1= sc.nextLine();
        
        System.out.println("What is the second word? ");
        String wrd2= sc.nextLine();

        System.out.println("What is the third word? ");
        String wrd3= sc.nextLine();
        
        
        if(wrd1.compareTo(wrd2) <= 0 && wrd1.compareTo(wrd3) <=0){
           if(wrd2.compareTo(wrd3) <=0 ){
               System.out.println(wrd1 + " , "+wrd2+ " , "+wrd3);
           }else{
               System.out.println(wrd1 + " , "+wrd3+ " , "+wrd2);
           }
        }
        else if(wrd2.compareTo(wrd1) <= 0 && wrd2.compareTo(wrd3) <=0){
           if(wrd1.compareTo(wrd3) <=0 ){
               System.out.println(wrd2 + " , "+wrd1+ " , "+wrd3);
           }else{
               System.out.println(wrd2 + " , "+wrd3+ " , "+wrd1);
           } 
        }
        else{
            if(wrd1.compareTo(wrd2) <=0 ){
               System.out.println(wrd3 + " , "+wrd1+ " , "+wrd2);
           }else{
               System.out.println(wrd3 + " , "+wrd2+ " , "+wrd1);
           }
        }

    }
}
