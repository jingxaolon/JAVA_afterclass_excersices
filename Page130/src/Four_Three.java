
public class Four_Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Atlanta
		double x1 = 33.7489954;
		double y1 = -84.3879824;
		
		double radianx1 = Math.toRadians(x1);
		double radiany1 = Math.toRadians(y1);
		
		//Orlando
		double x2 = 28.5383355;
		double y2 = -81.3792365;
		
		double radianx2 = Math.toRadians(x2);
		double radiany2 = Math.toRadians(y2);
		
		//Savannah
		double x3 = 32.0835407;
		double y3 = -81.0998342;
		
		double radianx3 = Math.toRadians(x3);
		double radiany3 = Math.toRadians(y3);
		
		//Charlotte
		double x4 = 35.2270869;
		double y4 = -80.8431267;
		
		double radianx4 = Math.toRadians(x4);
		double radiany4 = Math.toRadians(y4);
		
		//Atlanta to Orlando  x1 x2
		double d1 = 6371.01 * Math.acos(Math.sin(radianx1) * Math.sin(radianx2) + Math.cos(radianx1) * Math.cos(radianx2) * Math.cos(radianx1 - radianx2));
		
		//Orlando to Savannah x2 x3
		double d2 = 6371.01 * Math.acos(Math.sin(radianx2) * Math.sin(radianx3) + Math.cos(radianx2) * Math.cos(radianx3) * Math.cos(radianx2 - radianx3));
		
		//Savannah to Charlotte x3 x4
		double d3 = 6371.01 * Math.acos(Math.sin(radianx3) * Math.sin(radianx4) + Math.cos(radianx3) * Math.cos(radianx4) * Math.cos(radianx3 - radianx4));
		
		//Charlotte to Atlanta x4 x1
		double d4 = 6371.01 * Math.acos(Math.sin(radianx4) * Math.sin(radianx1) + Math.cos(radianx4) * Math.cos(radianx1) * Math.cos(radianx4 - radianx1));
		
		//分割成两个三角形的边  Charlotte to Orlando x4 x2
		double d5 = 6371.01 * Math.acos(Math.sin(radianx4) * Math.sin(radianx2) + Math.cos(radianx4) * Math.cos(radianx2) * Math.cos(radianx4 - radianx2));
		
		//左半边三角形
		double s1 = (d4 + d1 + d5) / 2;
		
		double area1 = Math.pow((s1 * (s1 - d4) * (s1 - d1) * (s1 - d5)), 0.5);
		
		//右半边三角形
		double s2 = (d2 + d3 + d5) / 2;
		
		double area2 = Math.pow((s2 * (s2 - d2) * (s2 - d3) * (s2 - d5)), 0.5);
		
		double area = area1 + area2;
				
		System.out.println("The area is " + area);		
	}

}
