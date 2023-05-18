import java.util.Scanner;

public class Calendar {

	private static final int[] Max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		int[] arr = new int[3];

		switch (month) {
		case 2:
			return 28;
		case 4:
			return 30;
		case 6:
			return 30;
		case 9:
			return 30;
		case 11:
			return 30;
		default:
			return 31;

		}
	}

	public void printSampleCalendar() {
		System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("���� �Է��ϼ���.");
		int month = sc.nextInt();

		System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month, cal.getMaxDaysOfMonth(month));
		cal.printSampleCalendar();
		sc.close();
	}

}
