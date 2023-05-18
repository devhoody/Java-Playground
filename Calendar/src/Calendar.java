import java.util.Scanner;

public class Calendar {

<<<<<<< HEAD
	private static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

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
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
=======
	private static final int[] Max_Days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31, 31 };

	public static int MaxDaysOfMonth(int month) {
		return Max_Days[month-1];
>>>>>>> refs/remotes/origin/main
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		System.out.println("달을 입력하세요.");
		int month = sc.nextInt();
<<<<<<< HEAD

		System.out.printf("%d월은 %d일까지 있습니다. \n", month, cal.getMaxDaysOfMonth(month));
		cal.printSampleCalendar();
=======
		
		System.out.println(MaxDaysOfMonth(month));
>>>>>>> refs/remotes/origin/main
		sc.close();
	}

}
