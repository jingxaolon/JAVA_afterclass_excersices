import java.util.Scanner;

public class Five_Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of the students: ");
		int numberOfStudents = input.nextInt();
		
		String student = "";
		
		//����ѧ��������ȡѧ�������ֺͷ�����
		int count = 1;
		while (count <= numberOfStudents) {
			System.out.print("Enter the name and the score of the student: ");
			student += "\n" + "student name: " + input.next();
			student += "\n" + "student's score: " + input.next();
			count++;
		}
		System.out.print(student);
		
		//����������
		

	}

}
