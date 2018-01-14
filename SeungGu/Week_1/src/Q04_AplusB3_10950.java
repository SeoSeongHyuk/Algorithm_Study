import java.util.Scanner;

public class Q04_AplusB3_10950 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int time = in.nextInt();
		int num1, num2, result;
		for (int i = 0; i < time; i++) {
			num1 = in.nextInt();
			num2 = in.nextInt();
			result = num1 + num2;
			System.out.println(result);
		}
	}

}
