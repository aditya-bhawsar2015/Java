package streamsAssignment;

public class Toys {
	
	int product_id;
	String name;
	double price;
	String category;
	String age_category;
	Date purchaseDate = new Date();
	
	
	public Toys(int product_id, String name, double price, String category, String age_category, Date purchaseDate) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.price = price;
		this.category = category;
		this.age_category = age_category;
		this.purchaseDate = purchaseDate;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getAge_category() {
		return age_category;
	}


	public void setAge_category(String age_category) {
		this.age_category = age_category;
	}


	public Date getPurchaseDate() {
		return purchaseDate;
	}


	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}


	public String toString() {
		return "Toys [product_id=" + product_id + ", name=" + name + ", price=" + price + ", category=" + category
				+ ", age_category=" + age_category + ", purchaseDate=" + purchaseDate.getMonth() +" "+ purchaseDate.getYear()+ "]"+"\n";
	}
	
	
}
