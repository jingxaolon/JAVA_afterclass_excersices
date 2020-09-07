
public class Five_Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final double RATE = 0.05;
		
		double costForSchool = 10000;
		
		int count = 1;
		while (count <= 10) {
			costForSchool *= (1 + RATE);
			count++;
		}
		
		System.out.println("Tuition after ten years is: " + costForSchool);
		
		count = 1;
		double sumInFourYears = 0.0;
		while (count <= 4) {
			costForSchool *= (1 + RATE);
			sumInFourYears += costForSchool;
			count++;
		}
		System.out.println("After ten years, Tuition in four years is: " + sumInFourYears);
	}

}
