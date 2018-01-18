import java.util.Scanner;

public class Hanoi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		hanoi(n, 'A', 'B', 'C');
	}
	
	public static void hanoi(int n, char from, char by, char to) {
		if(n == 1)
			System.out.printf("원반 1을 %c에서 %c로 이동\n", from, to);
		else {
			hanoi(n-1, from, to, by);
			System.out.printf("원반 %d를 %c에서 %c로 이동\n", n, from, to);
			hanoi(n-1, by, from, to);
		}
	}

}
