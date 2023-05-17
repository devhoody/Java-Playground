import java.util.Scanner;

public class DynamicGugudan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("원하는 단을 입력하세요.");

		String inputValue = sc.nextLine();
		String[] splitedValue = inputValue.split(",");
		
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);

		for (int i = 2; i <= first; i++) {
			for (int j = 1; j <= second; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}
	}

}
