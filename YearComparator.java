package songs;

import java.util.Comparator;

public class YearComparator implements Comparator<Songs> {
	
	public int compare(Songs s1, Songs s2) {
		
		return -(s1.getReleaseYear() - s2.getReleaseYear());
		
	}

}
