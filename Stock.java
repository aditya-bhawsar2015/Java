package streamsAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stock {
	public static List<Toys> initializeToys(){
		List<Toys> toys = new ArrayList<>();
		Toys toy1 = new Toys(1, "Teddy Bear", 259.99, "Soft Toy", "0-4", new Date("February", 2025));
		Toys toy2 = new Toys(2, "Robot", 319.85, "Scientific", "7-10", new Date("October", 2020));
		Toys toy3 = new Toys(3, "Car", 525.99, "Battery Operated", "5+", new Date("December", 2020));
		Toys toy4 = new Toys(4, "Bike", 556.45, "Battery Operated", "5+", new Date("October", 2024));
		Toys toy5 = new Toys(5, "Power Rangers", 999.99, "Merchandise", "12+", new Date("December", 2023));
		Toys toy6 = new Toys(6, "Sudoku", 25.99, "Educational", "12+", new Date("August", 2024));
		Toys toy7 = new Toys(7, "Puzzle", 605.80, "Educational", "4+", new Date("August", 2019));
		Toys toy8 = new Toys(8, "Volcano", 129.59, "Scientiic", "15+", new Date("October", 2020));
		Toys toy9 = new Toys(9, "Barbie", 250.10, "Merchandise", "0-4", new Date("February", 2023));
		
		toys.add(toy1);
		toys.add(toy2);
		toys.add(toy3);
		toys.add(toy4);
		toys.add(toy5);
		toys.add(toy6);
		toys.add(toy7);
		toys.add(toy8);
		toys.add(toy9);
		
		return toys;
	}
	
	public static void filterByCategory(List<Toys> lst, String filterKey){
		Stream<Toys> toyStream = lst.stream();
		toyStream.filter((toy)->toy.getCategory().equals(filterKey)).forEach(System.out::println);;
	}
	
	public static void filterByPriceRange(List<Toys> lst, double rangeOpen, double rangeClose) {
		Stream<Toys> toyStream = lst.stream();
		toyStream.filter((toy)-> (toy.getPrice()<=rangeClose && toy.getPrice()>=rangeOpen)).forEach(System.out::println);;
	}
	public static void filterByPrice_Category(List<Toys> lst) {
		Stream<Toys> toyStream = lst.stream();
		Comparator<Toys> byPrice = Comparator.comparing(Toys::getPrice);
		Comparator<Toys> byCategory = Comparator.comparing(Toys::getCategory).thenComparing(byPrice);
		toyStream.sorted(byCategory).forEach(System.out::println);
	}
	
	public static void filterByYear(List<Toys> lst, int currentYear) {
		Stream<Toys> toyStream = lst.stream();
		toyStream.filter((toy)-> ((currentYear - toy.getPurchaseDate().getYear())>1)).forEach(System.out::println);;
	}
	
	public static void categorCount(List<Toys> lst) {
		Stream<Toys> toyStream = lst.stream();
		toyStream.collect(Collectors.groupingBy(Toys::getCategory)).forEach((k,v)->System.out.println(k+" \n"+v+"  Count = "+v.size()));
	}
	
	public static void minAndMax(List<Toys> lst) {
		Stream<Toys> toyStream = lst.stream();
		Optional<Toys> minExp=  toyStream.min(Comparator.comparing(Toys::getPrice));
		toyStream = lst.stream();
		Optional<Toys> maxExp=  toyStream.max(Comparator.comparing(Toys::getPrice));
		System.out.println("Least Expensive : "+minExp.get()+"  \nMost Expensive : "+maxExp.get());
	}
	
	public static void ageCategorCount(List<Toys> lst) {
		Stream<Toys> toyStream = lst.stream();
		toyStream.collect(Collectors.groupingBy(Toys::getAge_category)).forEach((k,v)->System.out.println(k+" \n"+v+"  Count = "+v.size()));
	}
	
}
