import java.util.Random;

public class Nine_Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator1 = new Random(1000);
		
		for (int i = 0;i < 50;i++) {
			System.out.println(generator1.nextInt(100));
		}
	}

}
