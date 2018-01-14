import java.util.Scanner;
import java.util.Stack;

public class p1406_r {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<String> left = new Stack<>();
		Stack<String> right = new Stack<>();
		
		String input = scan.next();
		for(int i = 0; i < input.length(); i++) {
			left.push(input.charAt(i)+"");
		}
		int t = scan.nextInt();
		
		while(t-- > 0) {
			String cmd = scan.next();
			if(cmd.equals("L")) {
				if(!left.isEmpty()) {
					String move = left.pop();
					right.push(move);
				}
			} else if(cmd.equals("D")) {
				if(!right.isEmpty()) {
					String move = right.pop();
					left.push(move);
				}
			} else if(cmd.equals("P")) {
				String ch = scan.next();
				left.push(ch);
			} else if(cmd.equals("B")) {
				if(!left.isEmpty()) {
					left.pop();
				}
			} else {
				// 
			}
		}
		
		while (!left.empty()) {
            right.push(left.pop());
        }

        StringBuilder sb = new StringBuilder();
        while (!right.empty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);
		
	}

}
