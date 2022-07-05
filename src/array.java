
//public class array {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//        String[][] names = { {"ravi", "10"},  {"mugesh", "90"} };
//        
//        for (int i = 0; i < names.length; i++) {
//        	if (names[0][1] == "10") {
//               names[0][i] = "Priya";
//               names[0][0] = "Ravi";
//            }
//        	System.out.println("The Name is " + names[0][i] + "  and His Mark is " +  names[i][1]);
//                                                                                            
//        }
//    }
//}


class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] a = {
            {1, -2, 3}, 
            {-4, -5, 6, 9}, 
            {7}, 
        };
      
        for (int i = 0; i < a.length; ++i) {
            for(int j = 0; j < a[i].length; ++j) {
                System.out.println(a[i][j]);
            }
        }
    }
}