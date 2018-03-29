
public class priceType {
	private String price;
	private String greaterPrice;
	private String filter;
	
	public void priceFilter() {
		//default query
		price = "0";
		greaterPrice = "0";
		filter = "default";
		
	}
	public String getPrice() {
		return price;
		
	}
	public void setPrice(String n) {
		price = n;
		
	}
	public String getGreaterPrice() {
		return greaterPrice;
		
	}
	
	public void setGreaterPrice(String n) {
		greaterPrice = n;
		
	}public String getFilter() {
		return filter;
		
	}
	
	public void setFilter(String n) {
		filter = n;
		
	}
}
