import java.util.Scanner;

public class Four_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle: ");
		
		double radius = input.nextDouble();
		
		double r1 = Math.toRadians(72);
		double r5 = Math.toRadians(144);
		double r4 = Math.toRadians(216);
		double r3 = Math.toRadians(288);
		
		//p2
		double x2 = 0;
		double y2 = radius;
		
		//p1
		double y1 = (int)((radius * Math.cos(r1)) * 100) / 100.0;
		double x1 = (int)((radius * Math.sin(r1)) * 100) / 100.0;

		//p5
		double y5 = (int)((radius * Math.cos(r5)) * 100) / 100.0;
		double x5 = (int)((radius * Math.sin(r5)) * 100) / 100.0;
		
		//p4
		double y4 = (int)((radius * Math.cos(r4)) * 100) / 100.0;
		double x4 = (int)((radius * Math.sin(r4)) * 100) / 100.0;
		
		//p3
		double y3 = (int)((radius * Math.cos(r3)) * 100) / 100.0;
		double x3 = (int)((radius * Math.sin(r3)) * 100) / 100.0;
		
		System.out.printf("(%.2f, %.2f)\n", x1, y1);
		System.out.printf("(%.2f, %.2f)\n", x2, y2);
		System.out.printf("(%.2f, %.2f)\n", x3, y3);
		System.out.printf("(%.2f, %.2f)\n", x4, y4);
		System.out.printf("(%.2f, %.2f)\n", x5, y5);
	}

}
