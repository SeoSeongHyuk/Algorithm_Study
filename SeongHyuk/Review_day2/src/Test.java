import java.util.*;
import java.util.Stack;

public class test {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Stack<Character> stack = new Stack<>();
		String output = "";
		int num = sc.nextInt();

		while (num-- > 0) {
			String result = "YES";
			String line = sc.next();

			for (int i = 0; i < line.length(); i++) {
				char tmp = line.charAt(i);

				if (tmp == '(') {
					stack.push(tmp);
				} else if (tmp == ')') {
					if (!stack.isEmpty())
						stack.pop();
					else {
						result = "NO";
						break;
					}
				} else
					break;
			}
			if (!stack.isEmpty())
				result = "NO";
			System.out.println(result);
		}
	}

}