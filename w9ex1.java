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
public class w9ex1 {
    public static void main (String [] args){
        String [] sports = {"Baseball", "Basketball", "Football", "Hockey", "Voleyball", "Waterpolo"};
        int [] players = {9,5,11,6,6,7};
        
        for(int i=0; i<sports.length; i++){
            System.out.println(sports[i]+" "+players[i]+" players");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of friends you have: ");
        int num=sc.nextInt();
        
        if(num <5){
            System.out.println("your group has less than 5 people. There is no suggested team sport.");
        }
        else{
            for(int i=0; i<players.length; i++){
                if(players[i] <= num){
                    System.out.println(sports[i]+ " needs "+players[i]+" players");
                }
            }
        }
    }
}
