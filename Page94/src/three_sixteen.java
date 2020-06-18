
public class three_sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//第一象限
		int x1 = (int)(Math.random() * 50);
		int y1 = (int)(Math.random() * 100);

		//第二象限
		int x2 = (int)(-Math.random() * 50);
		int y2 = (int)(Math.random() * 100);
		
		//第三象限
		int x3 = (int)(-Math.random() * 50);
		int y3 = (int)(-Math.random() * 100);
		
		//第四象限
		int x4 = (int)(Math.random() * 50);
		int y4 = (int)(-Math.random() * 100);
		//System.out.println("(" + x + ", " + y + ")");

		int random = (int)(Math.random() * 5);
		
		System.out.println("Random coordinate:");
		switch (random) {
		case 0:System.out.println("(" + 0 + ", " + 0 + ")");break;
		case 1:System.out.println("(" + x1 + ", " + y1 + ")");break;
		case 2:System.out.println("(" + x2 + ", " + y2 + ")");break;
		case 3:System.out.println("(" + x3 + ", " + y3 + ")");break;
		case 4:System.out.println("(" + x4 + ", " + y4 + ")");break;
		}
	}

}
