import java.util.Scanner;
import java.util.Stack;

public class p1406 {
	static String input = "";
	static int curser = 0;
	static Stack<String> stack = new Stack<>();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		input = scan.next();
		for(int i = 0; i < input.length(); i++) {
			stack.push(input.charAt(i)+"");
		}
		curser = input.length();
		
		int t = scan.nextInt();
		while(t-- > 0) {
			String cmd = scan.next();
			
			if(cmd.equals("P")) {
				String ch = scan.next();
				functionP(ch);
			} else if(cmd.equals("L")) {
				functionL();
			} else if(cmd.equals("D")) {
				functionD();
			} else if(cmd.equals("B")) {
				functionB();
			} else {
				
			}
		}
		
		String output = "";
		while(!stack.isEmpty()) {
			output = (stack.pop() + output);
		}
		
		System.out.println(output);
	}
	
	public static void functionL() {
		if(curser != 0)
			curser--;
	}
	
	public static void functionD() {
		if(curser != stack.size())
			curser++;
	}

	public static void functionP(String ch) {
		if(curser == stack.size())
			stack.push(ch);
		else {
			Stack<String> temp = new Stack<>();
			int time = stack.size() - curser;
			while(time-- > 0) {
				String move = stack.pop();
				temp.push(move);
			}
			
			stack.push(ch);
			while(!temp.isEmpty()) {
				String move = temp.pop();
				stack.push(move);
			}
		}
		curser++;
	}
	
	public static void functionB() {
		if(curser == stack.size())
			stack.pop();
		else {
			Stack<String> temp = new Stack<>();
			int time = stack.size() - curser;
			while(time-- > 0) {
				String move = stack.pop();
				temp.push(move);
			}
			stack.pop();
			while(!temp.isEmpty()) {
				String move = temp.pop();
				stack.push(move);
			}
		}
		curser--;
	}
}
