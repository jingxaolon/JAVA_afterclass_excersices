import java.util.Scanner;

public class three_twenty_seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a point's x- and y-coornates: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//������ֱ�ǵ���(0, 0),����������ֱ���(200, 0), (0, 100)����
		//���б������ֱ�ߵ�б�ʣ�
		//y = -0.5 * x + 100;
		
		int outTriangle = 0;
		int inTriangle = 0;
		
		if (x1 >= 200 || x1 <= 0 || y1 >= 100 || y1 <= 0) {
			System.out.println("The point is not in the triangle ");
			System.exit(1);
		}
		
		double triangleY = -0.5 * x1 + 100;

		if (y1 >= triangleY) {
			outTriangle = 1;
		}
		else {
			inTriangle = 1;
		}
		
		System.out.print((inTriangle == 1)?"The point is in the triangle ":"The point is not in the triangle ");
		
	}

}
