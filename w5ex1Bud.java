
import java.io.PrintWriter;
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
public class w5ex1Bud {
    public static void main (String [] args) throws Exception{
        PrintWriter file = new PrintWriter("C:\\Users\\ecems\\Documents\\NetBeansProjects\\SpringJavaLab\\src\\game.txt");
        Random readNumber = new Random();
        
        int userDice, computerDice, userWins = 0, computerWins = 0;

	for(int i = 1; i <= 10; i++){
            userDice = readNumber.nextInt(6);
            computerDice = readNumber.nextInt(6);

            if(userDice > computerDice) {
                userWins++;
                
            }else if(userDice < computerDice){
		++ computerWins;
            }
	}
	
        file.println("User wins " + userWins + "  Computer wins" + computerWins);

	if(computerWins > userWins){
            file.println("Computer is the final winner");
	
        }else if(computerWins < userWins){
            file.println("User is the final winner");
	
        }else{
            file.println("it is a tie");
	}

        file.close();
    }
}
