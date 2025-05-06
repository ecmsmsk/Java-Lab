import java.util.*;
public class question1{

public static void main(String [] args){
         getInput();

 }
//getInput
 public static void getInput(){
	 Scanner sc = new Scanner (System.in);

	 System.out.println("please enter phone number: ");
	 String no = sc.nextLine();

	 while(!isValid(no)){
		 System.out.println("please enter phone number: ");
	     no = sc.nextLine();
	 }
	getPhoneNumber(no);
 }
 // isValid
 public static boolean isValid(String num){
	 while(num.length() >= 10 && num.length() <=14){
		 for(int i=0; i<= num.length(); i++){
			 while (Character.isLetter(num.charAt(i)) || Character.isDigit (num.charAt(i)) || num.charAt(i) == '-') {
			 return true;
		     }
	      }
	  }
	 return false;
 }
 //getPhoneNumber
public static void getPhoneNumber (String number){
String lastNumber = "";
int i;

    for (i = 0; i < number.length() ; i++){
	if(Character.isLetter(number.charAt(i)) ||  Character.isDigit (number.charAt(i)) || number.charAt(i) == '-') {

            if (Character.isLetter(number.charAt(i))){

                if (number.charAt(i) == 'A' || number.charAt(i) == 'B' || number.charAt(i) == 'C'){
                    lastNumber += '2';
		            }
		    	else if (number.charAt(i) == 'D' || number.charAt(i) == 'E' || number.charAt(i) == 'F'){
		           lastNumber += '3';
		    	 }
				else if (number.charAt(i) == 'G' || number.charAt(i) == 'H' || number.charAt(i) == 'I'){
		   	 	   lastNumber += '4';
		   	 	   }
				else if (number.charAt(i) == 'J' || number.charAt(i) == 'K' || number.charAt(i) == 'L'){
                    lastNumber += '5';
                    }
				else if (number.charAt(i) == 'M' || number.charAt(i) == 'N' || number.charAt(i) == 'O'){
                    lastNumber += '6';
                    }
				else if (number.charAt(i) == 'P' || number.charAt(i) == 'Q' || number.charAt(i) == 'R' || number.charAt(i) == 'S'){
                    lastNumber += '7';
                    }
				else if (number.charAt(i) == 'T' || number.charAt(i) == 'U' || number.charAt(i) == 'V'){
                    lastNumber += '8';
                    }
				else if (number.charAt(i) == 'W' || number.charAt(i) == 'X' || number.charAt(i) == 'Y' || number.charAt(i) == 'Z'){
                    lastNumber += '9';
                	}

            } else{
			lastNumber += number.charAt(i);
        	}
      }
    }
	System.out.println("The last TRANSLATED input is : " + lastNumber);
  }

}