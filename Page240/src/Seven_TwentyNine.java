
public class Seven_TwentyNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] card = new int[52];
		
		int i;
		int count = 1;
		for (i = 0;i < card.length;i++) {
			card[i] = count;
			if ((i + 1) % 4 == 0) {
				count++;
			}
		}
		
		count = 0;
		int result = 0;
		while (result != 24) {
			result = card[(int)Math.random() * 52] + card[(int)Math.random() * 52];
			count++;
		}

		System.out.println("得到和为24的选牌次数：" + count);
	}

}
