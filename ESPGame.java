import java.util.*;
public class ESPGame{
	public static String computer;
	public static String user;


	public void runComputer(){
		Random rn = new Random();
		int ranNum = rn.nextInt(5-1+1)+1;

		if(ranNum ==1){
			computer="red";
		}
		else if(ranNum ==2){
			computer = "green";
	    }
	    else if(ranNum ==3){
					computer = "blue";
	    }
	    else if(ranNum ==4){
					computer = "orange";
	    }
	    else if(ranNum ==5){
			computer = "green";
	    }
	}

	public void setUserChoice(){
		Scanner sc = new Scanner (System.in);

	do{

		System.out.println("Enter a color: ");
		user = sc.nextLine();

		 if(user.equals("red")){
			 user="red";
	     }
	     else if(user.equals("green")){
			 user="green";
	     }
		  else if(user.equals("blue")){
		      user="blue";
		  }
		  else if(user.equals("orange")){
		      user="orange";
		   }
		  else if(user.equals("yellow")){
		       user="yellow";
           }

	   }while(!isValid());
	}

	public static boolean isValid(){
		 if(user.equals("green")||user.equals("red")||user.equals("blue") || user.equals("orange")||user.equals("yellow") ){
			 return true;
		 }
		 else{
			 return false;
		 }
	 }

	 public String whoWins(){
		 if(computer.equals(user)){
			 return user;
		 }
		 else{
			 return computer;
		 }
	 }

}