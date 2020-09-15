
public class Six_Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("哂樫" + "\t\t" + "致"
				+ "\t\t\t\t" + "致" + "\t\t" + "哂樫");
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！");
		
		double temp = 20.0;
		
		int i;
		for (i = 1;i <= 10;i++) {
			System.out.printf("%.1f\t\t%.3f\t\t\t\t", (double)i, footToMeter((double)i));
			System.out.printf("%.1f\t\t%.3f\n", (double)temp, meterToFoot((double)temp));
			temp += 5;
		}
	}

	public static double footToMeter(double foot) {
		return foot * 0.305;
	}
	
	public static double meterToFoot(double meter) {
		return meter * 3.279;
	}
}
