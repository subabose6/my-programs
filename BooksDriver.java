package myPackage1;

import java.util.Scanner;

public class BooksDriver {
	// static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Movie[] movies = new Movie[4];
		String getTitle;
		String getAuthor;
		int getRating;
		int getPages;
		System.out.println("Please enter the  books details : \n");

		for (int i = 0; i < movies.length; i++) {

			System.out.println("Enter the title of books " + (i + 1));
			getTitle = input.nextLine();
			System.out.println("Enter the author of books " + (i + 1));
			getAuthor = input.nextLine();
			System.out.println("Enter the number of  pages in books " + (i + 1));
			getRating = input.nextInt();
			System.out.println("Enter the rating (1-5) of books " + (i + 1));
			getRating = input.nextInt();

		}
	}
}
