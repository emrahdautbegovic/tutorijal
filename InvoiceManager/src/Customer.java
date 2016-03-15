
public class Customer {
	private String Name;
	
	public Customer(String name) {
		super();
		Name = name;
	}
	public Customer() {
		super();
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	
	@Override
	public String toString() {
		return Name;
	}
}
