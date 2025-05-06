public class LetsPlay {
	public static void main(String [] args){
		ESPGame game = new ESPGame();

		int c_u = 0;
	    int c_c = 0;

	    for (int i = 0; i < 10; i++){
			game.runComputer();
			game.setUserChoice();
			if (game.whoWins().equals("user")){
				 c_u++;
				 System.out.println ("User is the winner");
			}
			else {
				System.out.println("Computer is the winner");
				c_c++;
		    }
		}

		if (c_u < c_c) {
				System.out.println("The computer has won: " + c_c + "  The user has won: " + c_u );
				System.out.println("The computer is the winner!");
	    }
	    else if (c_u > c_c){
				System.out.println("The computer has won: " + c_c + "  The user has won: " + c_u);
				System.out.println("The user is the winner!");
		}
		else {
				System.out.println("The computer has won: " + c_c + "  The user has won: " + c_u );
				System.out.println("There is a tie!");
	     }



	}
}