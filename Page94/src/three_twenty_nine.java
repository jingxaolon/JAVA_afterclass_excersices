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

		//����Բ�ص�
		//circle2��������������circle1Ϊ�������꣬r1 + r2Ϊ�뾶��Բ�У�����Բ�ص���
		//�õ�����֮�����ļ��㹫ʽ��
		//x_1 = Math.pow(x2 - x1, 2), y_2 = Math.pow(y2 - y1, 2)
		//distance = Math.pow(x_1 + y_2, 0.5)
		//distance < r1 + r2
		
		//��������
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
