import java.util.Scanner;

public class Nine_Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns in the array: ");
		int row = input.nextInt();
		int column = input.nextInt();
		double[][] a = new double[row][column];
		
		//23.5 35 2 10
		//4.5 3 45 3.5
		//35 44 5.5 9.6
		System.out.println("Enter the array: ");
		for (int i = 0;i < a.length;i++) {
			for (int j = 0;j < a[i].length;j++) {
				a[i][j] = input.nextDouble();
			}
		}
		
		Location new1 = new Location();
		new1 = locateLargest(a);
		
		System.out.println("The location of the largest element is " + new1.maxValue + " at (" + new1.row + ", " + new1.column + ")");
	}

	public static Location locateLargest(double[][] a) {
		Location new1 = new Location();
		new1.row = 0;
		new1.column = 0;
		new1.maxValue = a[0][0];
		
		for (int i = 0;i < a.length;i++) {
			for (int j = 0;j < a[i].length;j++) {
				if (a[i][j] > new1.maxValue) {
					new1.maxValue = a[i][j];
					new1.row = i;
					new1.column = j;
				}
			}
		}
		
		return new1;
	}
}

class Location {
	public int row, column;
	public double maxValue;
	
	public Location() {
		
	}
}