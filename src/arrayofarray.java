import java.util.Arrays;

public class arrayofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		
		for (int i = 0; i < myNumbers.length; ++i ) {
			//System.out.println ("iteration I " + i );
			
			System.out.println(Arrays.toString(myNumbers[i]));
			
			//System.out.println("....... \n");
			for (int j = 0; j < myNumbers.length; ++j) {
				//System.out.println ("iteration II " + j );
				System.out.println(myNumbers[i][j] );
		}
				
		}

	}

}
