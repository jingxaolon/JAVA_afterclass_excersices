import java.util.Scanner;

public class two_eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ÿ7s��һ���˵���
		//ÿ13s��һ��������
		//ÿ45s��һ������Ǩ��
		//��δ��5���ÿ���˿���
		//��ǰ�˿�ʱ312032486
		
		Scanner input = new Scanner(System.in);
		
		int born = 365*24*60*60/7;
		int death = 365*24*60*60/13;
		int move = 365*24*60*60/45;
		
		int total = born - death + move;
		
		System.out.print("Enter the amount of years: ");
		int years = input.nextInt();
		
		int sum = 312032486 + (years * total);
		
		System.out.println("The population in " + years + " is " + sum);
	}

}
