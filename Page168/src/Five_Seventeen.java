import java.util.Scanner;

public class Five_Seventeen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number between 1 and 15: ");
		int num = input.nextInt();
		
		int cengshu;
		
		//���ƽ���������
		for(cengshu = 1;cengshu <= num;cengshu++) {
			//ÿ��ո���(���һ���λ����ȥÿ�����ֵĸ���)
			int blank = 2 * num - 1 - (2 * cengshu - 1);
			
			int blankCount = 0;
			while (blankCount < (blank / 2)) {
				System.out.print(" " + " ");
				blankCount++;
			}
			
			for (int i = cengshu;i >= 1;i--) {
				System.out.print(i + " ");
			}
			
			for (int j = 2;j <= cengshu;j++) {
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
			
	}

}
