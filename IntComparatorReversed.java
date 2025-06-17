package lambda;

public class IntComparatorReversed implements java.util.Comparator<String> {
	public int compare(String s1, String s2) {
		return Integer.compare(s2.length(), s1.length());
	}
	
}