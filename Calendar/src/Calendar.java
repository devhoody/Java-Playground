import java.util.Scanner;

public class Calendar {

	private static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return Max_Days[month - 1];
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

		System.out.println("�ݺ�Ƚ���� �Է��ϼ���.");
		int times = sc.nextInt();
		int[] month = new int[times];

		System.out.println("���� �Է��ϼ���.");
		for (int i = 0; i < times; i++) {
			month[i] = sc.nextInt();
		}

		for (int i = 0; i < month.length; i++) {
			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�. \n", month[i], cal.getMaxDaysOfMonth(month[i]));
		}

		sc.close();
	}

}
