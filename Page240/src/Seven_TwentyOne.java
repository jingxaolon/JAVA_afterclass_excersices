
public class Seven_TwentyOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0.0;
		
		int i;
		for (i = 0;i < args.length;i++) {
			sum += Integer.parseInt(args[i]);
		}
		
		System.out.print("The sum of the digit inputed: " + sum);
	}

}
