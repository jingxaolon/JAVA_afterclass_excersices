
public class one_eleven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//每7s有一个人诞生
		//每13s有一个人死亡
		//每45s有一个移民迁入
		//求未来5年的每年人口数
		//当前人口时312 032 486
		//每年有365天
		
		//第1年
		double year1 = 312032486 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year1);
		
		//第2年
		double year2 = year1 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year2);
		
		//第3年
		double year3 = year2 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year3);
		
		//第4年
		double year4 = year3 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year4);
				
		//第5年
		double year5 = year4 + 365 * 24 * 60 * 60 / 7.0 - 365 * 24 * 60 * 60 / 13.0 + 365 * 24 * 60 * 60 / 45.0;
		System.out.println(year5);
	}

}
