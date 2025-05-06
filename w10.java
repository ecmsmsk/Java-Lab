
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
public class w10 {
    public static void main(String [] args){
    int [][] sales = new int [6][8];
    String [] locations = {"Houston", "Dallas", "Huntsville", "San Antonio", "Waco","Austin"};
    
    //populate data
    Random rd = new Random();
    for(int i=0; i <sales.length; i++){
        for(int j=0; j<sales[i].length; j++){
         sales[i][j] = rd.nextInt(25);
        }
    }
    
    //print array
     for(int i=0; i <sales.length; i++){
        for(int j=0; j<sales[i].length; j++){
         System.out.print(sales[i][j]+ "\t"); 
        }
        System.out.println();
    }
    
     //total sales per location
     int [] totalSales = new int[locations.length];
     int total;
      for(int i=0; i <sales.length; i++){
          total=0;
          for(int j=0; j<sales[i].length; j++){
              total += sales[i][j];
          }
          System.out.println(locations[i]+ "\t"+ total);
          totalSales[i]=total;
      }
      
      //unpopular IoT
     int sale;
      for(int i=0; i <sales[0].length; i++){
          sale=0;
          for(int j=0; j<sales.length; j++){
              if(sales[i][j] !=0){
                  sale++;
              } 
          }
          if(sale <= 3){
              System.out.println("IoT "+i+" is Unpopular");
          }
      }
      
      //max sales location
       int max = totalSales[0];
       int maxIndex=0;
      for(int i=1; i <totalSales.length; i++){
          if(totalSales[i]>max){
              max = totalSales[i];
              maxIndex = i;
          }
      }
        System.out.println("Location with highest sales = "+ locations[maxIndex]);
         
    
    }
}
