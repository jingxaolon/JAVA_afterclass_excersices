
public class Seven_TwentyTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int countForUpperCase = 0;
		
		int i;
		for (i = 0;i < args[0].length();i++) {
			if (Character.isUpperCase(args[0].charAt(i))) {
				countForUpperCase++;
			}
		}

		System.out.print("The number of the UpperCase is: " + countForUpperCase);
	}

}
