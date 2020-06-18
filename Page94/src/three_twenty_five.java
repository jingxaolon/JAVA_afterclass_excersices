import java.util.Scanner;

public class three_twenty_five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double x3= input.nextDouble();
		double y3 = input.nextDouble();
		
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		//(y1 - y2) * x - (x1 - x2) * y = (y1 - y2) * x1 - (x1 - x2) * y1
		//a * x + b * y = e
		
		//(y3 - y4) * x - (x3 - x4) * y = (y3 - y4) * x3 - (x3 - x4) * y3
		//c * x + d * y = f
		
		//x = (e * d - b * f) / (a * d - b * c)
		//y = (a * f - e * c) / (a * d - b * c)
		
		double a = y1 - y2;
		double b = -(x1 - x2);
		double e = (y1 - y2) * x1 - (x1 - x2) * y1;
		double c = y3 - y4;
		double d = -(x3 - x4);
		double f = (y3 - y4) * x3 - (x3 - x4) * y3;
		
		double x = 0.0;
		double y = 0.0;
		
		//double x = (e * d - b * f) / (a * d - b * c);
		//double y = (a * f - e * c) / (a * d - b * c);
		
		if ((a * d - b * c) == 0) {
			System.out.println("The two lines are parallel ");
		}
		else {
			x = (e * d - b * f) / (a * d - b * c);
			y = (a * f - e * c) / (a * d - b * c);
			System.out.println("The intersecting point is at (" + x + ", " + y + ")");
		}
	}

}
