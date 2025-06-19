package songs;

import java.util.*;

public class Songs {
	int sno;
	String title;
	Set<Artist> artists = new HashSet<>();
	int releaseYear;
	double rating;
	public Songs(int sno, String title, Set<Artist> artists, int releaseYear, double rating) {
		this.sno = sno;
		this.title = title;
		this.artists = artists;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<Artist> getArtists() {
		return artists;
	}
	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public static void displaylist(List<Songs> list) {
		for(Songs song : list) {
			System.out.println(song);
		}
	}
	
	
	@Override
	public String toString() {
		return "Songs [sno=" + sno + ", title=" + title + ", artists=" + artists + ", releaseYear=" + releaseYear
				+ ", rating=" + rating + "]";
	}
	
	
	
}
