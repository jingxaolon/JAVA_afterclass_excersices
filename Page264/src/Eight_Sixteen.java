
public class Eight_Sixteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m = {
				{4, 2}, 
				{1, 7}, 
				{4, 5}, 
				{1, 2}, 
				{1, 1}, 
				{4, 1}};
		
		sort(m);
		
		int i;
		for (i = 0;i < m.length;i++) {
			System.out.println("{" + m[i][0] + ", " + m[i][1] + "}");

		}
	}

	public static void sort(int m[][]) {
		int i, j;
		int tmp = -1;
		for (i = 0;i < m.length - 1;i++) {	//先比较行
			for (j = i + 1;j < m.length;j++) {
				if (m[i][0] > m[j][0]) {
					tmp = m[i][0];
					m[i][0] = m[j][0];
					m[j][0] = tmp;
					
					tmp = m[i][1];
					m[i][1] = m[j][1];
					m[j][1] = tmp;
				}
			}
		}
		
		for (i = 0;i < m.length - 1;i++) {	//比较列
			for (j = i + 1;j < m.length && m[i][0] == m[j][0];j++) {
				if (m[i][1] > m[j][1]) {
					tmp = m[i][0];
					m[i][0] = m[j][0];
					m[j][0] = tmp;
					
					tmp = m[i][1];
					m[i][1] = m[j][1];
					m[j][1] = tmp;
				}
			}
		}
	}
}
