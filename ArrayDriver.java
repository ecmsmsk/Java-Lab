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

public class ArrayDriver {
    public static void main(String [] args){
     Scanner sc= new Scanner(System.in);
     System.out.print("Enter size of array: ");
     int arraySize = sc.nextInt();
     
     int [] ar=new int[arraySize];
     
     Random rd = new Random();
     for(int i=0; i<ar.length; i++){
         ar[i]=rd.nextInt(50-10+1)+10;
     }
     
     for(int i=0; i<ar.length; i++){
          System.out.print(ar[i]+ ", ");
     }
     
     Array myArray = new Array();
     myArray.setArray(ar);
     System.out.println("/n/nHighest Value is "+ myArray.getHighest());
     System.out.println("Highest value Index is "+myArray.getIndexOfHighest());
     
    }
}
