import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p1158 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		int n = scan.nextInt();
		int m = scan.nextInt();

		for (int i = 1; i <= n; i++) {
			queue.add(i);
		}
		
		if (m == 1) {
			while(!queue.isEmpty()) {
				sb.append(queue.poll() + ", ");
			}
		} else {
			int count = 1;
			
			while (true) {
				if (count == m) {
					int temp = queue.poll();
					sb.append(temp + ", ");
					count = 1;
				}

				if (queue.isEmpty())
					break;

				int move = queue.poll();
				queue.add(move);
				count++;
			}
		}
		System.out.println("<" + sb.substring(0, sb.length() - 2) + ">");
		
	}

}
