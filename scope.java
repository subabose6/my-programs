public class scope
{

  static String myMethod (String name1)
  {
    return name1 ;
  }
  

  static int myMethod (int tamil, int english, int maths, int science,int social)
		       
  {
    int total = tamil + english + maths + science + social;
    int avg = total / 5;
    System.out.println ("percentage = " + avg);
    if (avg >= 35)
      {
	System.out.println ("you are  pass");
      }
    else
      {
	System.out.println ("you are fail");
      }

    return tamil + english + maths + science + social;
  }



  static int myMethod (int tamil, int english, int maths, int biology, int physics, int chemistry)
		      
  {
    int total2 = tamil + english + maths + biology + physics + chemistry;
    int avg = total2 / 6;
    System.out.println ("percentage = " + avg);
    if (avg >= 35)
      {
	System.out.println ("you are  pass");
      }
    else
      {
	System.out.println ("you are fail");
      }
    return tamil + english + maths + biology + physics + chemistry;
  }

  
  public static void main (String[]args)
  {

    String name1 = myMethod ("Siyalaksh");
    System.out.println (name1 + " Studying 10th ");
    int mark1 = myMethod (80, 45, 60, 90, 90);
    System.out.println ("Total mark = " + mark1 + "." + "\n");

    String name2 = myMethod ("Priyadarshini ");

    System.out.println (name2 + " Studying 12th ");
    int mark2 = myMethod (80, 70, 60, 50, 90, 80);

    System.out.println ("Total mark = " + mark2 + ".");

  }

}
