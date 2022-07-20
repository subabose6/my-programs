package myPackage1;

public class LaptopShowroom {
	private String laptopModel1;
	private String laptopModel2;
	private String laptopModel3;
	private String laptopModel4;

	public LaptopShowroom(String laptopModel1, String laptopModel2, String laptopModel3, String laptopModel4) {
		this.laptopModel1 = laptopModel1;
		this.laptopModel2 = laptopModel2;
		this.laptopModel3 = laptopModel3;
		this.laptopModel4 = laptopModel4;
	}

	public String getLaptopModel1() {
		return laptopModel1;
	}

	public void setLaptopModel1(String laptopModel1) {
		this.laptopModel1 = laptopModel1;
	}

	public String getLaptopModel2() {
		return laptopModel2;
	}

	public void setLaptopModel2(String laptopModel2) {
		this.laptopModel2 = laptopModel2;
	}

	public String getLaptopModel3() {
		return laptopModel3;
	}

	public void setLaptopModel3(String laptopModel3) {
		this.laptopModel3 = laptopModel3;
	}

	public String getLaptopModel4() {
		return laptopModel4;
	}

	public void setLaptopModel4(String laptopModel4) {
		this.laptopModel4 = laptopModel4;
	}
}