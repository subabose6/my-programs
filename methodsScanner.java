import java.util.Scanner;
public class methodsScanner
{
  Scanner input = new Scanner (System.in);

  static String myMethod (String name1, String name2)
  {

    return name1 + name2;
  }
  static String getname ()
  {
    System.out.println ("Enter the student name : ");
    Scanner input = new Scanner (System.in);
    String name = input.nextLine ();
    return name;
  }
  static int myMethod (int tamil, int english, int maths, int science,
		       int social)
  {

    return tamil + english + maths + science + social;
  }
  static int getmark10th ()
  {
    System.out.println ("Enter  10th  Mark : ");
    Scanner input = new Scanner (System.in);
    int tamil = input.nextInt ();
    int english = input.nextInt ();
    int science = input.nextInt ();
    int social = input.nextInt ();
    int maths = input.nextInt ();
    int total = tamil + english + science + social + maths;
    int avg = total / 5;

    if (avg >= 35)
      {
	System.out.println ("you are  pass");
      }
    else
      {
	System.out.println ("you are fail");
      }
    System.out.println ("Total mark = " + total + ".");
    System.out.println ("percentage = " + avg + "." + "\n");

    return avg;
  }


  static int myMethod (int tamil, int english, int maths, int biology, int physics, int chemistry)
  {
    return tamil + english + maths + biology + physics + chemistry;
  }
  static int getmark12th ()
  {
    System.out.println ("Enter  12th  Mark : ");
    Scanner input = new Scanner (System.in);
    int tamil = input.nextInt ();
    int english = input.nextInt ();
    int maths = input.nextInt ();
    int biology = input.nextInt ();
    int physics = input.nextInt ();
    int chemistry = input.nextInt ();
    int total = tamil + english + maths + biology + physics + chemistry ;
   
    int avg = total / 6;

    if (avg >= 35)
      {
	System.out.println ("you are  pass");
      }
    else
      {
	System.out.println ("you are fail");
      }
    System.out.println ("Total mark = " + total + ".");
    System.out.println ("percentage = " + avg + "." + "\n");

    return avg;
  }
  
  public static void main (String[]args)
  {
    
    String name1 = getname ();
    System.out.println (name1 + " Studying 10th . ");
    int mark10th = getmark10th ();
    
    String name2 = getname ();
    System.out.println (name2 + " Studying 12th . ");
    int mark12th = getmark12th ();

    
  }
}
