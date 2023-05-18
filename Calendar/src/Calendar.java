import java.util.Scanner;

public class Calendar {

	private final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31, 31 };

	public  int MaxDaysOfMonth(int month) {
		return Max_Days[month-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar calendar = new Calendar();
		
		System.out.println("���� �Է��ϼ���.");
		int month = sc.nextInt();
		
		System.out.println(calendar.MaxDaysOfMonth(month));
		sc.close();

//		System.out.println("�� �� ȭ �� �� �� ��");
//		System.out.println("--------------------");
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");

	}

}
