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
import java.io.*;

public class w5Ex1 {
    public static void main(String [] args) throws IOException {
        PrintWriter pw = new PrintWriter("C:\\Users\\ecems\\Documents\\NetBeansProjects\\SpringJavaLab\\src\\game.txt");
        Random rn = new Random();
       
        System.out.println("user\tcomputer");
        pw.println("user\tcomputer");
        
        for (int i=0; i<=10; i++){
          int user = rn.nextInt(6)+1;
          int computer = rn.nextInt(6)+1; 
           
          System.out.println(user+"\t"+computer);
          pw.println(user+"\t"+computer);
          
          if(user > computer){
              System.out.println("Winner is user");
              pw.println("Winner is user");
          }
          else if(user < computer){
              System.out.println("Winner is computer");
              pw.println("Winner is computer");
          }else{
              System.out.println("it is a tie, No winner");
              pw.println("it is a tie, No winner");
          }
        }
        pw.close();
        
    }
}
