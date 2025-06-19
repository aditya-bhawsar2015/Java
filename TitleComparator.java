package songs;

import java.util.Comparator;

public class TitleComparator implements Comparator<Songs>{

	
		@Override
		public int compare(Songs o1, Songs o2)
		{
			return o1.getTitle().compareTo(o2.getTitle());
		}
	}
