
public class Five_ThirtyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//目标：一年30000
		//基本工资：5000
		//提成工资：25000
		double target = 25000;

		//sales
		double sales = 10000.0;
		
		//Commission salary
		double commissionSalary = 900.0;
		
		while (commissionSalary < target) {
			sales++;
			if (sales <= 5000) {
				//0.01-5000  8%
				commissionSalary = sales * 0.08;
			}
			else if (sales <= 10000) {
				//5000.01-10000  10%
				commissionSalary = 5000 * 0.08 + (sales - 5000) * 0.1;
			}
			else {
				//10000.01-  12%
				commissionSalary = 5000 * 0.08 + 5000 * 0.1 + (sales - 10000) * 0.12;
			}
		}
		
		System.out.print("Minimum sales that must be completed: " + sales);
	}

}
