import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력하세요.");

		int number = sc.nextInt();

		if (number < 2 | 9 < number) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
		} else {
			for (int i = 1; i < 10; i++) {
				System.out.println(number * i);
			}
		}
	}
}
