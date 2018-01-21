import java.util.*;

public class Deque {
	public static Scanner sc = new Scanner(System.in);
	public static int [] arr = new int[10000];
	public static int position = 0;
	
	public static void push_front(int x) {
		for(int i = 0; i < position; i ++) {
			int temp = arr[i+1];
			arr[i+1] = arr[i];
			arr[i] = temp;
		}
		arr[0] = x;
		position ++;
	}
	public static void push_back(int x) {
		arr[position++] = x;
	}
	public static void pop_front() {
		if(position == 0)
			System.out.println("-1");
		else {
			System.out.println(arr[0]);
			for (int i = 0; i < position; i ++) 
				arr[i] = arr[i+1];
			position --;
		}
	}
	public static void pop_back() {
		if(position == 0)
			System.out.println("-1");
		else {
			System.out.println(arr[position-1]);
			position --;
		}
	}
	public static void size() {
		System.out.println(position);
	}
	public static void empty() {
		if(position == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
	public static void front() {
		if(position == 0)
			System.out.println("-1");
		else
			System.out.println(arr[0]);
	}
	public static void back() {
		if(position == 0)
			System.out.println("-1");
		else
			System.out.println(arr[position - 1]);
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		String command;
		int tmp;
		
		while ( n-- > 0) {
			command = sc.next();
			
			if(command.equals("push_front")) {
				tmp = sc.nextInt();
				push_front(tmp);
			}
			else if(command.equals("push_back")) {
				tmp = sc.nextInt();
				push_back(tmp);
			}
			else if(command.equals("pop_front"))
				pop_front();
			else if(command.equals("pop_back"))
				pop_back();
			else if(command.equals("size"))
				size();
			else if(command.equals("empty"))
				empty();
			else if(command.equals("front"))
				front();
			else if(command.equals("back"))
				back();
		}
	}
}
