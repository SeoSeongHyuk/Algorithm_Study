import java.util.Scanner;
import java.util.Stack;

public class p9012 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0) {
			boolean flag = true;
			Stack<Character> stack = new Stack<>();
			String input = scan.next();
			for(int i = 0; i < input.length(); i++) {
				if(input.charAt(i) == '(')
					stack.push('(');
				else  {
					if(stack.isEmpty()) {
						flag = false;
						break;
					}
					stack.pop();
				}
			}
			
			if(stack.size() == 0 && flag == true)
				System.out.println("YES");
			else 
				System.out.println("NO");
		}
	}

}
