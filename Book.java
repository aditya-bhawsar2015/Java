package day5;

public class Book {
	private int ISBN;
	private String title;
	
	public Book(int iSBN, String title) {
		super();
		ISBN = iSBN;
		this.title = title;
	}
	
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	

	@Override
	public String toString() {
		return "BookClass [ISBN=" + ISBN + ", title=" + title + "]";
	}


}
