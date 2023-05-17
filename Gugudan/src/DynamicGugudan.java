import java.util.Scanner;

public class DynamicGugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력하세요.");

		int N = sc.nextInt();
		
		int[] arr = new int[N];

		for (int i = 2; i <= arr.length; i++) {
			for (int j = 1; j <= arr.length; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
