import java.util.Scanner;

public class DynamicGugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("���ϴ� ���� �Է��ϼ���.");

		int number = sc.nextInt();

		for (int i = 2; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
