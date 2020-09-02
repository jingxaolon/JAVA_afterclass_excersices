import java.util.Scanner;

public class Four_Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter point 1 (latitude an longitude) in degrees: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//度转换为弧度
		double radianx1 = Math.toRadians(x1);
		double radiany1 = Math.toRadians(y1);
		
		double sinx1 = Math.sin(radianx1);
		double cosx1 = Math.cos(radianx1);
		
		System.out.print("Enter point 2 (latitude an longitude) in degrees: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//度转换为弧度
		double radianx2 = Math.toRadians(x2);
		double radiany2 = Math.toRadians(y2);
		
		double sinx2 = Math.sin(radianx2);
		double cosx2 = Math.cos(radianx2);
		
		double cosy1jiany2 = Math.cos(radiany1 - radiany2);
		
		double d = 6371.01 * Math.acos(sinx1 * sinx2 + cosx1 * cosx2 * cosy1jiany2);
		
		System.out.println("The distance between the two points is " + d + " km");
	}

}
