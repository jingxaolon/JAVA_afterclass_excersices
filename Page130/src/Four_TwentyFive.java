import java.util.Scanner;

public class Four_TwentyFive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���������д��ĸ
		int c1 = (int)(Math.random() * 25 + 65);
		int c2 = (int)(Math.random() * 25 + 65);
		int c3 = (int)(Math.random() * 25 + 65);
		
		//�����λ��
		int num = (int)(Math.random() * 1000);
		
		System.out.printf("Random license plate number: %c%c%c%3d", (char)c1, (char)c2, (char)c3, num);
	}

}
