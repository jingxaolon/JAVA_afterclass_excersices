
public class Six_Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("父箆業" + "\t\t" + "鯖箆業"
				+ "\t\t\t\t" + "鯖箆業" + "\t\t" + "父箆業");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		
		double temp = 120.0;
		
		int i;
		for (i = 40;i > 30;i--) {
			System.out.printf("%.1f\t\t%.1f\t\t\t\t", (double)i, celsiusToFahrenheit((double)i));
			System.out.printf("%.1f\t\t%.2f\n", (double)temp, fahrenheitToCelsius((double)temp));
			temp -= 10;
		}
		
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}
}
