package songs;
import java.util.*;
public class User {
	public static List<Songs> yearSongs(int year, List<Songs> list){
		List<Songs> yearSongList = new ArrayList<Songs>();
		
		for(Songs song : list) {
			if(song.getReleaseYear() == year) {
				yearSongList.add(song);
			}
		}
		
		return yearSongList;
	}
	public static Map<String, Integer> songMap(List<Songs> list){
		Map<String, Integer> newMap = new TreeMap<String, Integer>();
		for(Songs song : list) {
			newMap.put(song.getTitle(), song.getReleaseYear());
		}
		return newMap;
	}
	public static List<Songs> artistSongs(String name, List<Songs> list){
		List<Songs> artistsSongList = new ArrayList<Songs>();
		
		for(Songs song : list) {
			for(Artist artist : song.getArtists()) {
				if(artist.getName().equals(name)) {
					artistsSongList.add(song);
				}
			}
		}
		
		return artistsSongList;
	}
	public static void main(String[] args) {
		SongsCollection collection = new SongsCollection();
		List<Songs> list = new ArrayList<>();
		list = collection.makeList();
		
		Songs.displaylist(list);
		
		
		
		System.out.println("\n=========================  Sort By Title  ====================\n");
		Collections.sort(list, new TitleComparator());
		Songs.displaylist(list);
		
		System.out.println("\n=========================  Sort by Year   ====================\n");
		Collections.sort(list, new YearComparator());
		Songs.displaylist(list);
		
		
		System.out.println("\n=========================  Searching By Title ================\n");
		int found = (int)Collections.binarySearch(list, new Songs(0, "Aapka Suroor", null, 0, 0), new TitleComparator());
		System.out.println("Found at "+ (int)(found+1));
		
		System.out.println("\n=========================  Songs released in current year (1990) ============\n");
		List<Songs> yearSongList = new ArrayList<Songs>();
		yearSongList = yearSongs(1990, list);
		
		Songs.displaylist(yearSongList);
		
		System.out.println("\n=========================  Songs released by specific Artist ============\n");
		List<Songs> artistsSongList = new ArrayList<Songs>();
		artistsSongList = artistSongs("Himesh Reshamiya", list);
		
		Songs.displaylist(artistsSongList);
		
		System.out.println("\n=========================  Maping Songs and Release Year ============\n");
		Map<String, Integer> songMap = new TreeMap<String, Integer>();
		songMap = songMap(list);
		
		System.out.println(songMap);
		
		System.out.println("\n=========================  Song with minimum rating ============\n");
		Songs minRate = Collections.min(list, new RatingComparator());
		System.out.println(minRate);
		
		System.out.println("\n=========================  Song with maximum rating ============\n");
		Songs maxRate = Collections.max(list, new RatingComparator());
		System.out.println(maxRate);
		
	}
}
