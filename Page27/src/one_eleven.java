
public class one_eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ÿ7s��һ���˵���
		//ÿ13s��һ��������
		//ÿ45s��һ������Ǩ��
		//��δ��5���ÿ���˿���
		//��ǰ�˿�ʱ312 032 486
		//ÿ����365��
		
		//��1��
		double year1 = 312032486 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year1);
		
		//��2��
		double year2 = year1 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year2);
		
		//��3��
		double year3 = year2 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year3);
		
		//��4��
		double year4 = year3 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year4);
				
		//��5��
		double year5 = year4 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year5);
	}

}
