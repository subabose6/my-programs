package myPackage1;

public class Books {

	private String title;
	private String author;
	private int rating;
	private int pages;

	public String getTitle() {
		return title;
	}

	public void setTitle(String newTitle) {
		title = newTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String newAuthor) {
		author = newAuthor;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int newRating) {
		rating = newRating;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int newPages) {
		pages = newPages;
	}

	void playIt() {
		System.out.println(getTitle() + "- Now Playing!");
	}

}
