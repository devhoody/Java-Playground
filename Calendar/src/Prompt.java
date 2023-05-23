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
			System.out.println("�⵵�� �Է��ϼ���.(exit : -1)");
			System.out.println("YEAR > ");
			year = sc.nextInt();
			if (year == -1)
				break;
			System.out.println("���� �Է��ϼ���.");
			System.out.println("MONTH > ");
			month = sc.nextInt();
			if (month > 12 || month < 1) {
				System.out.println("�߸��� �Է��Դϴ�.");
				continue;
			}

			cal.printSampleCalendar(year, month);
		}
		System.out.println("Have a nice Day!");

		sc.close();
	}

	public static void main(String[] args) {
		// �� ����
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
