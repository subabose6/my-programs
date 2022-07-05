import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);  // Create a Scanner object
		 System.out.println("choose your option ");
		 int num1 = input.nextInt();
		 int num2 = input.nextInt();
		 System.out.println("we have to add or subtract");
		 String add = input.next();
		 String subtract = input.next();
		 if (input.equals(add)) {
			 System.out.println(num1 + " + " + num2 + " is : " + (num1 + num2));
			 
		 }
		 else if(input.equals(subtract)) {
			 System.out.println(num1 + " - " + num2 + " is : " + (num1 - num2));
			 
		 }
		 
		 
		 
		   
            
            
            
            		
            
            
		    
		    
		  }

	}
//choose your option
//enter 1 for addition
//enter 2 for subraction
//first number
// second num
// using is if else or any case


