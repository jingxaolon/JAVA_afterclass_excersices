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
				
		//���������ص���
		//ֻҪr2����������r1Ϊ�������꣬w1 / 2 + w2 / 2Ϊwidth, h1 / 2 + h2 /2Ϊheight�ľ�����
		//��r2��r1�ض��ص�
		//x1 - (w1 + w2) / 2 < x2 < x1 + (w1 + w2) / 2 && y1 - (h1 + h2) / 2 < y2 < y1 + (h1 + h2) / 2
		//����Ϊjava��䣺
		//(x1 - (w1 + w2) / 2 < x2 && x2 < x1 + (w1 + w2) / 2) && (y1 - (h1 + h2) / 2 < y2 && y2 < y1 + (h1 + h2) / 2)
		if ((x1 - (w1 + w2) / 2.0 < x2 && x2 < x1 + (w1 + w2) / 2.0)
				&& (y1 - (h1 + h2) / 2.0 < y2 && y2 < y1 + (h1 + h2) / 2.0)) {
			//���r2����������r1Ϊ�������꣬w1 / 2 - w2 / 2Ϊwidth, h1 / 2 - h2 /2Ϊheight�ľ�����
			//��r2��r1��
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
