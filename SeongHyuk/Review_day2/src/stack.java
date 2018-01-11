import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		
		System.out.println(stack.peek());
		System.out.println(stack.size());
		System.out.println("---------");
		System.out.println(stack.pop());
		System.out.println(stack.size());
		System.out.println("---------");
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}

}
