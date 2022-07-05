import java.util.Scanner;

public class arraynewpr1{


public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[][]date= { {1 , 16} , {2 , 22 } , {3 , 25} };
    int[][] month = { {1, 8 } , {2, 12 } , {3 , 6 } };
    int[][] year = { {1, 1999 } , {2, 2001 } , {3 , 1990 } };
    for (int i = 0; i < date.length; i++) {
    	for (int j = 0; j < month.length; j++)
    		for (int z = 0; z < year.length; z++)
		System.out.println ( date[i]);
	}

}
}

		   

