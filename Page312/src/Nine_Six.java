
public class Nine_Six {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StopWatch newRecord1 = new StopWatch();
		
		newRecord1.start();
		
		//select sort
		double[] newArray1 = new double[100_000];
		for (int i = 0;i < newArray1.length;i++) {
			newArray1[i] = Math.random() * 100_000;
		}
		
		selectSort(newArray1);
		
		newRecord1.stop();
		
		System.out.println("The elapsed time for sorting is: " + newRecord1.getElapsedTime() + "ms");
	}

	public static void selectSort(double[] newArray1) {
		for (int i = 0;i < newArray1.length - 1;i++) {
			for (int j = i + 1;j < newArray1.length;j++) {
				if (newArray1[j] < newArray1[i]) {
					double tmp;
					tmp = newArray1[i];
					newArray1[i] = newArray1[j];
					newArray1[j] = tmp;
				}
			}
		}
	}
}

class StopWatch {
	private double startTime = 0.0;
	private double endTime = 0.0;
	
	public StopWatch() {
		startTime = System.currentTimeMillis();
	}
	
	public void start() {
		startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public double getElapsedTime() {
		return endTime - startTime;
	}
}