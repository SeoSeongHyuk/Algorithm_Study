import java.util.Scanner;

public class stack_10828 {
	static int TOP = 0;
	static int[] stack = new int[10001];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- > 0) {
			String cmd = scan.next();
			int time = 0;
			if(cmd.equals("push")) {
				time = scan.nextInt();
			}
			
			if(cmd.equals("push"))
				push(time);
			else if(cmd.equals("top"))
				System.out.println(top());
			else if(cmd.equals("size"))
				System.out.println(size());
			else if(cmd.equals("empty"))
				System.out.println(empty());
			else 
				System.out.println(pop());
		}
	}
	
	public static void push(int n) {
		stack[++TOP] = n;
	}
	
	public static int pop() {
		if(empty() == 1)
			return -1;
		
		int temp = stack[TOP];
		TOP--;
		return temp;
	}
	
	public static int size() {
		return TOP;
	}
	
	public static int empty() {
		if(TOP == 0)
			return 1;
		else 
			return 0;
	}
	
	public static int top() {
		if(TOP == 0)
			return -1;
		else
			return stack[TOP];
	}
}
