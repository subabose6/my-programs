
public class array2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 2 3 4
		//5 6 7 8
		//"\t"...." " used for equal spaces
		int a[] = {1,2,3,4,5,6,7,8};
		int b[][] = {{1,2,3,4},{5,6,7,8}};
//		for(int i = 0; i<b.length; i++) {
//			for(int j = 0; j<b[i].length; j++) {
		for(int row = 0; row<b.length; row++) {
			for(int col = 0; col<b[row].length; col++) {
		
				System.out.print(b[row][col] + " ");
			}
				System.out.println();
		}
     }

}
