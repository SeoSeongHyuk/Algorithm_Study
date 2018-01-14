import java.util.*;

public class Q01_Stack_10828 {

	static int TOP = 0;
	static int[] arr = new int[10000];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();

		while (t-- > 0) {
			String cmd = scan.next();
			int n = 0;
			if (cmd.equals("push")) {
				n = scan.nextInt();
				push(n);
			} else if (cmd.equals("pop"))
				System.out.println(pop());
			else if (cmd.equals("size"))
				System.out.println(size());
			else if (cmd.equals("empty"))
				System.out.println(empty());
			else
				System.out.println(top());

		}
		scan.close();
	}

	public static void push(int i) {
		arr[TOP] = i;
		TOP++;
	}

	public static int pop() {
		if (TOP <= 0)
			return -1;
		else {
			TOP--;
			return arr[TOP];
		}
	}

	public static int size() {
		if (TOP <= 0)
			return 0;
		else
			return TOP;
	}

	public static int empty() {
		if (TOP <= 0)
			return 1;
		else
			return 0;
	}

	public static int top() {
		if (TOP <= 0)
			return -1;
		else
			return arr[TOP - 1];
	}
}