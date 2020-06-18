import java.util.Scanner;

public class three_twenty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int tempInvalid = 0;
		int speedInvalid = 0;
		
		System.out.print("Enter the temperature in Fahrenheit between -58¨H and 41¨H: ");
		double temperature = input.nextDouble();

		if (temperature < -58 || temperature > 41) {

			tempInvalid = 1;
		}
		
		System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
		double speed = input.nextDouble();

		if (speed < 2) {
			//System.out.println("the wind speed inputed is invalid");
			speedInvalid = 1;
		}
		
		double result = 0.0;
		
		if (tempInvalid == 1 && speedInvalid == 1) {
			System.out.println("the temperature and wind speed inputed are invalid");
			System.exit(1);
		}
		else if (tempInvalid == 1 && speedInvalid == 0) {
			System.out.println("the temperature inputed is invalid");
			System.exit(1);
		}
		else if (tempInvalid == 0 && speedInvalid == 1) {
			System.out.println("the wind speed inputed is invalid");
			System.exit(1);
		}
		else {
			result = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temperature * Math.pow(speed, 0.16);
		}		
		
		System.out.println("The wind chill index is " + result);
	}

}
