
public class array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print all subjects with comma and end with dot
		//output: tamil,english,biology,mathematics,physics.
				String[] subjects = { "Tamil", "English", "Biology", "Mathametics", "Physics" };
				String allSubjects ="";
			for (int i = 0; i < subjects.length; i++) {
				if(i>=4) {
						allSubjects = allSubjects  + subjects[i]  + ".";
			}
				else  {
						allSubjects = allSubjects  + subjects[i]  + ",";
					  }
			}
			System.out.print(allSubjects);

					
					
				
	}

}
