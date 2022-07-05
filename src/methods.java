import java.util.Scanner;
public class methods {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     dummy();
	}
	
	static void dummy() {
		String title = getTitle();
		 String authorName = getAuthorname();
		 int pages = getPages();
		// bookDetails(title,authorName );
		 bookDetails(title);
		 authorDetails(authorName);
	     pageDetails(pages);
	}
	
	static void bookDetails(String title) {
		System.out.println("the book title name : " + title);
	}
	
	
	static void authorDetails(String authorName) {
		System.out.println("the book Author name is : " + authorName);
	}
	
	
	static void pageDetails(int pages) {
		System.out.println("the number of pages in this book : " + pages);
	}
	
	
	static String getTitle(){
		System.out.println("Enter the book title : ");
		Scanner input = new Scanner(System.in);
		String title = input.nextLine();
		return title;
	}
	
	static String getAuthorname(){
		System.out.println("Enter the author name : ");
		Scanner input = new Scanner(System.in);
		String authorName = input.nextLine();
		return authorName;
	}
	
	static int getPages(){
		System.out.println("Enter the book pages");
		Scanner input = new Scanner(System.in);
		int pages = input.nextInt();
		return pages;
	}
	
	

}
