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

public class w3Ex1 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int psw1, psw2;
        
        do{
        System.out.println("Please enter the password: ");
        psw1 = sc.nextInt();
            
        System.out.println("Please re-enter the password: ");
        psw2 = sc.nextInt();
        
        }while(psw1 != psw2);
            System.out.println("Your passwprd is macthing");     
    
    }
}
