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
public class w4ex2 {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int tmp;
        do{
            System.out.print("Enter a temperature: ");
            tmp=sc.nextInt();
        }while(tmp <0 || tmp >100);
        
        System.out.println("Celcius\t\tFarenheit");
        System.out.println("============================");
        
        for(int i=0; i<=tmp; i+=4){
            double F= 9.0/5*i+32;
            System.out.println(i+"\t\t"+F);
        }
    }
    
}
