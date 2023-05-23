import java.util.Scanner;

public class Prompt {

	public int parseDay(String week) {
		if (week.equals("su"))
			return 0;
		if (week.equals("mo"))
			return 1;
		if (week.equals("tu"))
			return 2;
		if (week.equals("we"))
			return 3;
		if (week.equals("th"))
			return 4;
		if (week.equals("fr"))
			return 5;
		if (week.equals("sa"))
			return 6;
		else
			return 0;
	}

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int year = 2023;
		int month = 1;
		int weekday = 0;

		while (true) {
			System.out.println("년도를 입력하세요.(exit : -1)");
			System.out.println("YEAR > ");
			year = sc.nextInt();
			if (year == -1)
				break;
			System.out.println("월을 입력하세요.");
			System.out.println("MONTH > ");
			month = sc.nextInt();
			if (month > 12 || month < 1) {
				System.out.println("잘못된 입력입니다.");
				continue;
			}

			cal.printSampleCalendar(year, month);
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
