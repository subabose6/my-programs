import java.util.Arrays; 
import java.util.Scanner; 
public class arrayofscanner {

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int a =50;
	int sum =0;
	String isScore = "";
	String isNotScore = "";
	Scanner myObj = new Scanner (System.in);
	String [] name = new String[3];
	System.out.println("Please Enter The 3 Name");
	for (int i =0; i < name.length; i++) {
		name[i] = myObj.nextLine();
		System.out.println(name[i]);
	}		
	System.out.println("Check The Name[1] "+ name[1]);
	System.out.println("Check The Name Arrays " + Arrays.toString(name));
	int [] score = new int[3];
	System.out.println("Please Enter the 3 Score");
	for (int i =0; i < score.length; i++) {
		score[i] = myObj.nextInt();
		System.out.println(score[i]);
		if (score[i] >=50) {		
			isScore = isScore +" " +name[i]+ " ";		
			  System.out.println(name[i] +" score 50 runs and final scored is "  +score[i]  );
		   } else {
			   System.out.println(name[i] +" not 50 runs and final scored is "  +score[i] );
		
					isNotScore = isNotScore  + " "+ name[i]+" ";				
		   }
		sum = sum + score[i];
	}		
	System.out.println("Total Team Score is : " +sum);		
	System.out.println("Check The Score[1] " + score[1]);
	System.out.println("Check The Score Arrays " + Arrays.toString(score));
	int [][] highScore = new int[2][3];
	int max = highScore[0][0];
	System.out.println("To put individual both team score");
	for (int i =0; i < 2; i++) {
		for (int j=0; j <3 ; j++) {
			highScore[i][j] = myObj.nextInt();	
			
			if (highScore[i][j]> max) {
				max = highScore[i][j];
			}
	}
	}
	System.out.println("Top Score is "  + max + " He Received Man of The Match");
	System.out.println("who are geting 50 score " + isScore);
	System.out.println("who are not get 50 score" + isNotScore);
	System.out.println("Value Of Arrays :"+ highScore[1][2]);
    System.out.println("Check The highScore Arrays :" + Arrays.deepToString(highScore));	   
}
}
