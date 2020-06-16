import java.util.Scanner;

public class two_eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//每7s有一个人诞生
		//每13s有一个人死亡
		//每45s有一个移民迁入
		//求未来5年的每年人口数
		//当前人口时312032486
		
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
