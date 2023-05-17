import java.util.Scanner;

public class DynamicGugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력하세요.");

		int number = sc.nextInt();

		for (int i = 2; i <= number; i++) {
			for (int j = 1; j <= number; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
