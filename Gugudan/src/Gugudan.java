import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ϴ� ���� �Է��ϼ���.");

		int number = sc.nextInt();

		if (number < 2 | 9 < number) {
			System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�.");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
	}
}
