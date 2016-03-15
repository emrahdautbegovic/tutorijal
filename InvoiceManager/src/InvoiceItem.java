
public class InvoiceItem {
	
	
	int Id;
	String Title;
	int Price;
	int Amount;
	int OverallAmount;
	
	public InvoiceItem(int id, String title, int price, int amount, int overallAmount) {
		super();
		Id = id;
		Title = title;
		Price = price;
		Amount = amount;
		OverallAmount = overallAmount;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public int getOverallAmount() {
		return OverallAmount;
	}
	public void setOverallAmount(int overallAmount) {
		OverallAmount = overallAmount;
	}
	

}
