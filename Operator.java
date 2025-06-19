package streamsAssignment;

import java.util.ArrayList;
import java.util.List;

public class Operator {
	public static void main(String[] args) {
		List<Toys> toys = new ArrayList<Toys>();
		toys = Stock.initializeToys();
		
		System.out.println("------------------------List all The Stocks--------------------\n");
		System.out.println(toys);
		System.out.println("------------------------Filter by Category--------------------\n");
		Stock.filterByCategory(toys, "Scientific");
		System.out.println("------------------------Filter by Price Range--------------------\n");
		Stock.filterByPriceRange(toys, 500, 1000);
		System.out.println("------------------------Filter by Price and then Category--------------------\n");
		Stock.filterByPrice_Category(toys);
		
		System.out.println("------------------------Filter by Year--------------------\n");
		Stock.filterByYear(toys, 2025);
		
		System.out.println("------------------------Category and Count--------------------\n");
		Stock.categorCount(toys);
		
		System.out.println("------------------------Min And Max Expensive Toys--------------------\n");
		Stock.minAndMax(toys);
		
		System.out.println("------------------------Age_Category and Count--------------------\n");
		Stock.ageCategorCount(toys);
		
		
		
		
	}
}
