package mypackage;

 class Administration{
	public void administrationStrength() {
		System.out.println("All Administrations Mottos are :\n ");
	}
}

class School extends Administration {
	public void administrationStrength() {
		System.out.println("School motto : ALL IS WELL.\n");
	}
}

class college extends Administration {
	public void administrationStrength() {
		System.out.println("College motto : SHIFT YOUR FOCUS FROM THE PAST TO THE FUTURE.\n");
	}
}
class KG extends Administration {
	public void administrationStrength() {
		System.out.println("KG motto : UNEXPECTED INSTRUCTIONS OF BEAUTY.\n");
	}
}
class surroundings {
	  public void area() {
	    System.out.println("Find area of administration :\n ");
	  }
	public void area(int r) {
	    System.out.println("school inner Circle area = "+3.14*r*r);
	  }

	public void area(double b, double h) {
	    System.out.println("school kinder garden Triangle area="+0.5*b*h);
	  }
	public void area(int l, int b) {
	    System.out.println("school play ground Rectangle area="+l*b);
	  }


	}

	


