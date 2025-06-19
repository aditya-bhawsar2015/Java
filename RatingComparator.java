package songs;

import java.util.Comparator;

public class RatingComparator implements Comparator<Songs> {
	public int compare(Songs s1, Songs s2) {
		return Double.compare(s1.getRating(), s2.getRating());
	}

	
	
}
