import java.util.Scanner;
import java.util.Stack;

public class p10799 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Stack<Character> stack = new Stack<>();
		int stick = 0;
		int output = 0;
		String input = scan.next();
		for(int i = 0; i < input.length()-1; i++) {
			char now = input.charAt(i);
			char next = input.charAt(i+1);
			
			if(now == '(') {
				if(next == ')') {
					// ������ - �� ĭ �ǳʶپ �� ��
					output += stick;
					i++;
				}
				else {
					stick++;
				}
			}
			else {
				stick--;
				output += 1;
			}
		}
		System.out.println(output+1);
	}

}
