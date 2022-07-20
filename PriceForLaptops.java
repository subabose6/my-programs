package myPackage1;

public class PriceForLaptops {
	private int laptopModel1Rate;
	private int laptopModel2Rate;
	private int laptopModel3Rate;
	private int laptopModel4Rate;

	public PriceForLaptops(int laptopModel1Rate, int laptopModel2Rate, int laptopModel3Rate, int laptopModel4Rate) {
		super();
		this.laptopModel1Rate = laptopModel1Rate;
		this.laptopModel2Rate = laptopModel2Rate;
		this.laptopModel3Rate = laptopModel3Rate;
		this.laptopModel4Rate = laptopModel4Rate;
	}

	public int getLaptopModel1Rate() {
		return laptopModel1Rate;
	}

	public void setLaptopModel1Rate(int laptopModel1Rate) {
		this.laptopModel1Rate = laptopModel1Rate;
	}

	public int getLaptopModel2Rate() {
		return laptopModel2Rate;
	}

	public void setLaptopModel2Rate(int laptopModel2Rate) {
		this.laptopModel2Rate = laptopModel2Rate;
	}

	public int getLaptopModel3Rate() {
		return laptopModel3Rate;
	}

	public void setLaptopModel3Rate(int laptopModel3Rate) {
		this.laptopModel3Rate = laptopModel3Rate;
	}

	public int getLaptopModel4Rate() {
		return laptopModel4Rate;
	}

	public void setLaptopModel4Rate(int laptopModel4Rate) {
		this.laptopModel4Rate = laptopModel4Rate;
	}
}