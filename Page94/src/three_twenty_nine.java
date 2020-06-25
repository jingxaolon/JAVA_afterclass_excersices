import java.util.Scanner;

public class three_twenty_nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		System.out.print("Enter circle1's center x-, y-coornates, and radius: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		
		System.out.print("Enter circle1's center x-, y-coornates, and radius: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();

		//两个圆重叠
		//circle2的中心坐标在以circle1为中心坐标，r1 + r2为半径的圆中，则两圆重叠。
		//用到两点之间距离的计算公式：
		//x_1 = Math.pow(x2 - x1, 2), y_2 = Math.pow(y2 - y1, 2)
		//distance = Math.pow(x_1 + y_2, 0.5)
		//distance < r1 + r2
		
		//两点间距离
		double x_1 = Math.pow(x2 - x1, 2);
		double y_2 = Math.pow(y2 - y1, 2);
		double distance = Math.pow(x_1 + y_2, 0.5);
		
		if (distance < r1 + r2) {
			if (distance <= r1 - r2) {
				System.out.println("circle2 is inside circle1");
			}
			else {
				System.out.println("circle2 overlaps circle1");
			}
		}
		else {
			System.out.println("circle2 does not overlap circle1");
		}
	}
}
