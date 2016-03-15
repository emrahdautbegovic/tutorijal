
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
	
	


	int Id;
	Date date;
	Customer c;
	public List<InvoiceItem> items = new ArrayList<InvoiceItem>();
	int overallAmount;
	public Invoice(int id, Date date, Customer c, List<InvoiceItem> items, int overallAmount) {
		super();
		Id = id;
		this.date = date;
		this.c = c;
		this.items = items;
		this.overallAmount = overallAmount;
	}
	
	public int getOverallAmount() {
		return overallAmount;
	}
	public void setOverallAmount(int overallAmount) {
		this.overallAmount = overallAmount;
	}
	public Invoice(int id, Date date) {
		super();
		Id = id;
		this.date = date;
	}
	public List<InvoiceItem> getItems() {
		return items;
	}
	public void setItems(List<InvoiceItem> items) {
		this.items = items;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Customer getC() {
		return c;
	}
	public void setC(Customer c) {
		this.c = c;
	}
	
	
	@Override
	public String toString() {
		return "Invoice [items=" + items + ", Id=" + Id + ", date=" + date + "]";
	}
}
