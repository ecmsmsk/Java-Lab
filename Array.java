/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ecems
 */
public class Array {
    private int [] array;
    
    public Array(){
        
    }
    public void setArray(int [] arr){
        array=arr;
    }
    
    public int getHighest(){
        int max = array[0];
        for(int i=1; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }
    
    public int getIndexOfHighest(){
        int maxIndex =0, max=array[maxIndex];
        for(int i=1; i<array.length; i++){
            if(max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
