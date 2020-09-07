
public class Five_Thirteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = 0;
		while (count * count * count < 12000) {
			count++;
		}
		
		System.out.print(count - 1);
	}

}
