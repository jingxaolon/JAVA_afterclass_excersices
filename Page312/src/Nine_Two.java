
public class Nine_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stock s1 = new Stock("ORCL", "Oracle Corporation");
		s1.previousClosingPrice = 34.5;
		s1.currentPrice = 34.35;
		
		System.out.println("The previous closing price is "
			      + s1.previousClosingPrice);
		System.out.println("The current price is "
			      + s1.currentPrice);
		
		System.out.println("The change percent is "
			      + s1.getChangePercent() * 100 + "%");
	}

}

class Stock{
	String symbol;
	String name;
	double previousClosingPrice;
	double currentPrice;
	
	Stock() {
		
	}
	
	Stock(String getSymbol, String getName) {
		symbol = getSymbol;
		name = getName;
	}
	
	public double getChangePercent() {
		return (previousClosingPrice - currentPrice) / currentPrice;
	}
}