package songs;

import java.util.*;
public class SongsCollection {
	public List<Songs> makeList() {
		List<Songs> songList = new ArrayList<>();
		Artist himesh = new Artist("Himesh Reshamiya");
		Artist arijit = new Artist("Arijit Singh");
		Artist annu = new Artist("Annu Malik");
		Artist sanu = new Artist("kumar Sanu");
		Artist udit = new Artist("Udit Narayan");
		
		Set<Artist> song1Artists = new HashSet<>();
		song1Artists.add(himesh);
		song1Artists.add(udit);
		
		Set<Artist> song2Artists = new HashSet<>();
		song2Artists.add(sanu);
		song2Artists.add(arijit);
		
		Set<Artist> song3Artists = new HashSet<>();
		song3Artists.add(annu);
		song3Artists.add(himesh);
		
		Songs song1 = new Songs(1, "Aapka Suroor", song1Artists, 2006, 5.0);
		Songs song2 = new Songs(2, "Mere Mehboob", song2Artists, 1990, 4.8);
		Songs song3 = new Songs(3, "Gulabi Aankhein", song3Artists, 1956, 4.2);
		
		songList.add(song1);
		songList.add(song2);
		songList.add(song3);
		
		return songList;
		
		
		
	}
	
	
}
