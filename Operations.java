package lambda;


import java.util.*;
import java.util.stream.Collectors;

public class Operations {
	public static List<Colors> makeList(){
		List<Colors> colors = new ArrayList<Colors>();
		colors.add(new Colors("Red"));
		colors.add(new Colors("Orange"));
		colors.add(new Colors("Yellow"));
		colors.add(new Colors("Green"));
		colors.add(new Colors("Blue"));
		colors.add(new Colors("Indigo"));
		colors.add(new Colors("Violet"));
		
		return colors;
	}
	
	public static List<String> upperCaseList(List<Colors> list){
		List<String> listStr = new ArrayList<String>();
		listStr = list.stream().map((c)-> c.name.toUpperCase()).collect(Collectors.toList());
		return listStr;
	}
	public static List<String> lowerCaseList(List<Colors> list){
		List<String> listStr = new ArrayList<String>();
		listStr = list.stream().map((c)-> c.name.toLowerCase()).collect(Collectors.toList());
		return listStr;
	}
	public static List<String> beforeM(List<Colors> list){
		List<String> lessThanM = new ArrayList<String>();
		lessThanM = list.stream().filter(c -> {
			return ((c.getName().charAt(0)<'M'));
		}).map(c->c.getName()).collect(Collectors.toList());
		
		Collections.sort(lessThanM, new StringComparator());
		return lessThanM;
		
	}
	public static List<String> beforeMDecreased(List<Colors> list){
		List<String> lessThanM = new ArrayList<String>();
		lessThanM = list.stream().filter(c -> {
			return ((c.getName().charAt(0)<'M'));
		}).map(c->c.getName()).collect(Collectors.toList());
		
		Collections.sort(lessThanM, new ReverseStringcomparator ());
		return lessThanM;
		
	}
	
	public static List<String> shorterThan5(List<Colors> list){
		 List<String> shortThan5 = new ArrayList<String>();
		 shortThan5 = list.stream().filter((c)-> c.getName().length() < 5).map(c -> c.getName()).collect(Collectors.toList());
		 Collections.sort(shortThan5, new IntComparator());
		 return shortThan5;
	}
	public static List<String> shorterThan5Decreased(List<Colors> list){
		 List<String> shortThan5 = new ArrayList<String>();
		 shortThan5 = list.stream().filter((c)-> c.getName().length() < 5).map(c -> c.getName()).collect(Collectors.toList());
		 Collections.sort(shortThan5, new IntComparatorReversed());
		 return shortThan5;
	}
	
	public static void main(String[] args) {
		List<Colors> colors = new ArrayList<Colors>();
		colors = makeList();
		System.out.println(upperCaseList(colors));
		System.out.println(lowerCaseList(colors));
		System.out.println(beforeM(colors));
		System.out.println(beforeMDecreased(colors));
		System.out.println(shorterThan5(colors));
		System.out.println(shorterThan5Decreased(colors));
		
	}
	
}
