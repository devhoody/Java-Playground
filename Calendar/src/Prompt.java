import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("년도를 입력하세요.");
			System.out.println("YEAR > ");
			int year = sc.nextInt();
			System.out.println("월을 입력하세요.");
			System.out.println("MONTH > ");
			int month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printSampleCalendar(year, month);
//			System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		System.out.println("Have a nice Day!");

		sc.close();
	}

	public static void main(String[] args) {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
