import java.util.Scanner;

public class Prompt {

	public void runPrompt() {
		Scanner sc = new Scanner(System.in);
		Calendar cal = new Calendar();

		while (true) {
			System.out.println("�⵵�� �Է��ϼ���.");
			System.out.println("YEAR > ");
			int year = sc.nextInt();
			System.out.println("���� �Է��ϼ���.");
			System.out.println("MONTH > ");
			int month = sc.nextInt();
			if (month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			cal.printSampleCalendar(year, month);
//			System.out.printf("%d���� %d�ϱ��� �ֽ��ϴ�.\n", month, cal.getMaxDaysOfMonth(month));
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
