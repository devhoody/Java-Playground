import java.util.Scanner;

import javax.net.ssl.SSLContext;

public class Prompt {

	public void printMenu() {
		System.out.println("+-----------------+");
		System.out.println("| 1. 일정등록");
		System.out.println("| 2. 일정검색");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+-----------------+");
	}

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
		printMenu();

		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		int year = 2023;
		int month = 1;

		while (true) {
			String cmd = sc.next();
			if (cmd.equals("1"))
				cmdRegister();
			if (cmd.equals("2"))
				cmdSearch();
			if (cmd.equals("3"))
				cmdCal(sc, cal);
			if (cmd.equals("h"))
				printMenu();
			if (cmd.equals("q"))
				break;

		}
		System.out.println("Have a nice Day!");

		sc.close();
	}

	private void cmdCal(Scanner s, Calendar cal) {
		int year = 2023;
		int month = 1;

		Calendar sc = new Calendar();
		System.out.println("년도를 입력하세요.");
		System.out.println("YEAR > ");
		year = s.nextInt();
		System.out.println("월을 입력하세요.");
		System.out.println("MONTH > ");
		month = s.nextInt();
		if (month > 12 || month < 1) {
			System.out.println("잘못된 입력입니다.");
			return;
		}

		cal.printSampleCalendar(year, month);
		return;
	}

	private void cmdSearch() {
		// TODO Auto-generated method stub

	}

	private void cmdRegister() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// 셸 실행
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
