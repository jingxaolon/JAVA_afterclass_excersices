
public class Six_Twelve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printChars('a', 'z', 5);
	}

	public static void printChars(char ch1, char ch2, int numberPerline) {
		int count = 0;
		
		int i;
		for (i = (int)ch1;i <= (int)ch2;i++) {
			System.out.print((char)i + " ");
			count++;
			
			if (count % numberPerline == 0) 
				System.out.println();
		}
	}
}
