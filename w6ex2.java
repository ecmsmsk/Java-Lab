
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */
public class w6ex2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        int num =sc.nextInt();
        pentNum(num);
        System.out.println("Pentagonal Number:  "+ pentNum2(num));
        
    }
    public static void pentNum(int x){
        System.out.println("Pentagonal Number = "+((3*x-1)/2));
    }
    public static int pentNum2(int x){
        return(3*x-1)/2;
    }
}
