
public class array2
{

  public static void main (String[]args)
  {
    // TODO Auto-generated method stub
    // it print each single subject mark & total mark & using for loop and below 35
    // consider as fail.
    // print all subjects with comma and end with dot
    String[]subjects ={"tamil", "english", "biology", "mathametics", "physics"};

    int[][] marks = { {1, 80}, {2, 25}, {3, 75}, {4, 70}, {5, 36} };
    int total = 0, percentage;
    boolean isfail = false;
    String passSubjects = "";
    String failSubjects = "";

    for (int i = 0; i < subjects.length; i++){

	total = total + marks[i][1];
	System.out.println (subjects[i] + "  mark = " + marks[i][1]);
//          System.out.println("length of passSubjects " + passSubjects.length());
//              System.out.println("length of failSubjects " + failSubjects.length());

	if (marks[i][1] < 35)
	  {
	    if (failSubjects.length () > 0)
	      {
		failSubjects = failSubjects + "," + subjects[i];
	      }
	    else
	      {
		failSubjects = failSubjects + subjects[i];
	      }
	    isfail = true;
	    // failSubjects = failSubjects + "," + subjects[i] ;

	  }
	else if (marks[i][1] > 35)
	  {
	    if (passSubjects.length () > 0)
	      {
		passSubjects = passSubjects + "," + subjects[i];

	      }
	    else
	      {
		passSubjects = passSubjects + subjects[i];

		// passSubjects = passSubjects + "," + subjects[i] ;

	      }

	  }
      }

    if (isfail)
      {

	System.out.println ("Result : fail");
	
      }
    else
      {
	System.out.println ("Result : pass");

      }

    System.out.println ("You are passed in " + passSubjects);
    System.out.println ("You are failed in " + failSubjects);

    percentage = total / 5;
    System.out.println ("Total marks" + " = " + total);
    System.out.println ("percentage :" + percentage);

    // System.out.println(subjects.length());

    System.out.println ();
//      if (percentage > 34) {
//                  System.out.println("result is pass" );
//          }  else if (percentage<34) {
//                   System.out.println( "result is fail");
//
//}

  }
}
