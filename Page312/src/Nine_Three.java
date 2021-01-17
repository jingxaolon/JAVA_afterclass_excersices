import java.util.*; 

public class Nine_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long elapseTime = 10000L;
		for (elapseTime = 10000;elapseTime <= 1000_0000_0000L;elapseTime *= 10) {
			Date d1 = new Date(elapseTime);
			
			System.out.println(d1.toString());
		}
	}

}
