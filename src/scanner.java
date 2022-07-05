//import java.util.Scanner;
//public class scanner {
//
//	public static void main(String[] args) {
		// TODO Auto-generated method stub

//     Scanner myObj1 = new Scanner(System.in);  // Create a Scanner object
//      
//       System.out.println("enter your number : ");
//       
//       int userName1 = myObj1.nextInt();
//       
//       System.out.println("your first number is: " + userName1);
//       
//       int userName2 = myObj1.nextInt();
//       
//       System.out.println("your second number is : " + userName2  );
//       
//       System.out.println("Adding values are : " + (userName1 + userName2) );
//       
//       System.out.println("subtracting values are : " + (userName1 - userName2) );
//      
//	}
//}
	import java.util.Scanner;
      public class scanner {

	public static void main(String[] args) {	
		
		Scanner NUM = new Scanner(System.in);

		System.out.println("enter your first number : ");

		int a = NUM.nextInt();
		System.out.println("enter your second number : ");
		int b = NUM.nextInt();

		System.out.println("for adding enter 1 : ");
		
		System.out.println("for subtracting enter 2 : ");
		
		int c = NUM.nextInt();
		
		if ( c==1) {

		System.out.println("Adding values are : " + ( a + b ));

		}else if ( c==2){

		System.out.println("Subtracting values are : " + ( a - b ));	
		}else {
			System.out.println("no values");
		}
			
	 }  
   }
		
         
        
        
        
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        