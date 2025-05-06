/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */
import java.io.*;
import java.util.*;
public class w5ex2 {
    public static void main (String [] args) throws IOException{
        File myFile = new File("C:\\Users\\ecems\\Documents\\NetBeansProjects\\SpringJavaLab\\src\\ex2.txt");
        Scanner file = new Scanner(myFile);
        
        int num, count = 0;
        double avg, sum = 0;
        
        while (file.hasNext()) {
         num = file.nextInt();
         sum += num;
         count++;
        }
        
         avg = sum/count; 
        file.close();
        
        file = new Scanner(myFile);
        
        int gt=0;
        while (file.hasNext()) {
         num = file.nextInt();
         if(num > avg){
             gt++;
         }
        }
        file.close();
        PrintWriter of = new PrintWriter("C:\\Users\\ecems\\Documents\\NetBeansProjects\\SpringJavaLab\\src\\output.txt");
        of.println("Sum is "+sum);
        of.println("Average is "+avg);
        of.println("Numbers > avg  "+gt);
        of.close();
    }
}
