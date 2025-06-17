package day6;

public class Song extends Media{
	int serno;
	String title;
	
	public Song(int serno, String title) {
		super();
		this.serno = serno;
		this.title = title;
	}

	@Override
	void play() {
		System.out.println("Playing Song");
	}

	@Override
	public String toString() {
		return "Song [serno=" + serno + ", title=" + title + "]";
	}
	
	
}
