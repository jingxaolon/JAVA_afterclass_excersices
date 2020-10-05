import java.util.Scanner;

public class Seven_Eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		double[] tenArray = new double[10];
		
		int i = 0;
		while (i < tenArray.length) {
			tenArray[i++] = input.nextDouble();
		}
		
		double getMean = mean(tenArray);
		System.out.println("The mean is " + getMean);
		
		double[] getDeviation = new double[10];
		for (int j = 0;j < getDeviation.length;j++) {
			getDeviation[j] += tenArray[j] - getMean;
		}

		System.out.println("The standard deviation is " + deviation(getDeviation));
	}

	public static double deviation(double[] x) {
		double sum = 0.0;
		for (int i = 0;i < x.length;i++) {
			sum += Math.pow(x[i], 2);
		}
		
		return Math.sqrt(sum / (x.length - 1));
	}
	
	public static double mean(double[] x) {
		double sum = 0.0;
		for (int i = 0;i < x.length;i++) {
			sum += x[i];
		}
		
		return sum / x.length;
	}
}
