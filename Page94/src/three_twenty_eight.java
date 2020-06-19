import java.util.Scanner;

public class three_twenty_eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter r1's center x-, y-coornates, width, and height: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double w1 = input.nextDouble();
		double h1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coornates, width, and height: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double w2 = input.nextDouble();
		double h2 = input.nextDouble();
				
		//两个矩形重叠：
		//只要r2的坐标在以r1为中心坐标，w1 / 2 + w2 / 2为width, h1 / 2 + h2 /2为height的矩形内
		//则r2与r1必定重叠
		//x1 - (w1 + w2) / 2 < x2 < x1 + (w1 + w2) / 2 && y1 - (h1 + h2) / 2 < y2 < y1 + (h1 + h2) / 2
		//翻译为java语句：
		//(x1 - (w1 + w2) / 2 < x2 && x2 < x1 + (w1 + w2) / 2) && (y1 - (h1 + h2) / 2 < y2 && y2 < y1 + (h1 + h2) / 2)
		if ((x1 - (w1 + w2) / 2.0 < x2 && x2 < x1 + (w1 + w2) / 2.0)
				&& (y1 - (h1 + h2) / 2.0 < y2 && y2 < y1 + (h1 + h2) / 2.0)) {
			//如果r2的坐标在以r1为中心坐标，w1 / 2 - w2 / 2为width, h1 / 2 - h2 /2为height的矩形内
			//则r2在r1内
			if (((x1 - w1 / 2.0 + w2 / 2.0) <= x2 && x2 <= (x1 + w1 / 2.0 - w2 / 2.0)) 
				&& ((y1 - h1 / 2.0 + h2 / 2.0) <= y2 && y2 <= (y1 + h1 / 2.0 - h2 / 2.0))) {
				System.out.println("r2 is inside r1");
			}
			else {
				System.out.println("r2 overlaps r1");
			}
		}
		else {
			System.out.println("r2 does not overlap r1");
		}
	}

}
