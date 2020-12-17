
public class Eight_Eighteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = {
				{1, 2},
				{3, 4},
				{5, 6},
				{7, 8},
				{9, 10},
		};
		
		//print origin array
		System.out.println("origin array: ");
		int i;
		for (i = 0;i < m.length;i++) {
			System.out.println("{" + m[i][0] + ", " + m[i][1] + "}");
		}
		
		shuffle(m);
		
		//print array after shuffled
		System.out.println("shuffled array: ");
		for (i = 0;i < m.length;i++) {
			System.out.println("{" + m[i][0] + ", " + m[i][1] + "}");
		}
	}

	public static void shuffle(int[][] m) {
		int i;
		for (i = 0;i < m.length;i++) {
			int i1 = (int) (Math.random() * m.length);
			
			//swap
			int tmp = m[i][0];
			m[i][0] = m[i1][0];
			m[i1][0] = tmp;
			
			tmp = m[i][1];
			m[i][1] = m[i1][1];
			m[i1][1] = tmp;
		}
	}
}
