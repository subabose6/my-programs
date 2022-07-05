public class arrays {
	public static void main(String[] args) {
		// THE MILEAGE I EXPECTED FROM 5 BRANDS OF BIKES
		int mileage = 110;
		
		String[] bikes = {"DUCATI","BMW","R15","DUKE","ENFIELD"};
		System.out.println("TOTALBIKES" + " = " + bikes.length);
		System.out.println("THE BRANDS I CHOOSE :" );
		
		
		for (String i: bikes) {
			
//			if(i=="bmw") {
				
			System.out.println(i);
				
			//}
		}
		System.out.println("THERE MILEAGES ARE :");
		if (mileage == 120) {
			System.out.println(bikes[0] + " mileage " + mileage );
		} else if (mileage == 100) {
			System.out.println(bikes[1] + mileage );
		} else if (mileage == 110) {
			System.out.println(bikes[2] + mileage );
		} else if (mileage == 90) {
			System.out.println(bikes[3] + mileage );
		} else if (mileage == 80) {
			System.out.println(bikes[4] + mileage );
		} else {
			System.out.println(" In our showroom we dont have bike in this mileage ");
		}
	}
}