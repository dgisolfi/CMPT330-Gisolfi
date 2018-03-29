
public class priceType {
	private String price;
	private String greaterPrice;
	private String filter;
	
	public void priceFilter() {
		//default prices and filter values
		price = "0";
		greaterPrice = "0";
		filter = "default";
		
	}
	public String getPrice() {
		//allow the program to get the current price 
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
		//Create a filter to allow the program to determine what comparison to be made 
		return filter;
		
	}
	
	public void setFilter(String n) {
		filter = n;
		
	}
}
