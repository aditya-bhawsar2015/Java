package employee;

public class Department {
	int id;
	String name;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	

	public Department(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {

	}

}
