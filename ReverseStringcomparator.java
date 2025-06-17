package lambda;
import java.util.Comparator;
public class ReverseStringcomparator implements Comparator<String>{
	
	public int compare(String s1, String s2) {
		return -1*(s1.compareTo(s2));
	}



}
