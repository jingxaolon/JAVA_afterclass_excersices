import java.util.Scanner;

public class Five_Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		
		int count = 100;
		while (count >= 100 && count <= 1000) {
			if (count % 5 == 0 && count % 6 == 0) {
				System.out.print(count + " ");
				num++;
				
				if (num % 10 == 0)
					System.out.print("\n");
			}
			count++;
		}
	}

}
