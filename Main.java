package myPackage1;

public class Main {

	public static void main(String[] args) {

		int laptops = 300000;

		LaptopShowroom laptopShowroom = new LaptopShowroom("DELL", "MAC", "LENOVO", "ACER");

		laptopShowroom.setLaptopModel1("DELL");
		laptopShowroom.setLaptopModel2("MAC");
		laptopShowroom.setLaptopModel1("LENOVO");
		laptopShowroom.setLaptopModel2("ACER");
		
		
		PriceForLaptops pricelaptops = new PriceForLaptops(95000, 200000, 35000, 100000);
		
		pricelaptops.setLaptopModel1Rate(95000);
		pricelaptops.setLaptopModel2Rate(200000);
		pricelaptops.setLaptopModel3Rate(35000);
		pricelaptops.setLaptopModel4Rate(100000);

		System.out.println("MODEL NAME 1 : " + laptopShowroom.getLaptopModel1());
		System.out.println("Rs . " + pricelaptops.getLaptopModel1Rate());
		System.out.println("MODEL NAME 2 : " + laptopShowroom.getLaptopModel2());
		System.out.println("Rs . " + pricelaptops.getLaptopModel2Rate());
		System.out.println("MODEL NAME 3 : " + laptopShowroom.getLaptopModel3());
		System.out.println("Rs . " + pricelaptops.getLaptopModel3Rate());
		System.out.println("MODEL NAME 4 : " + laptopShowroom.getLaptopModel4());
		System.out.println("Rs . " + pricelaptops.getLaptopModel4Rate());

		if (laptops <= 95000) {
			System.out.println("lap available in this price range is : " + laptopShowroom.getLaptopModel1());
		} else if (laptops <= 200000) {
			System.out.println("lap available in this price range is : " + laptopShowroom.getLaptopModel2());
		}else if (laptops <= 35000) {
			System.out.println("lap available in this price range is : " + laptopShowroom.getLaptopModel3());
		}
		else if (laptops <= 300000) {
			System.out.println("lap available in this price range is : " + laptopShowroom.getLaptopModel4());
		}
		else {
			System.out.println("we dont have laptop in this price range. ");
		}
	}

}
