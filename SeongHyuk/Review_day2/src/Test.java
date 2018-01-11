import java.util.*;

public class Test {
	
	public static char [] arr = new char [1000];
	public static int order = 0;
	
	public static void push(char c) {
		arr[order++] = c;
	}
	
	public static char pop() {
		if(order == 0) {
			order--;
			return ' ';
		}
		else {
			char popone = arr[order];
			order--;
			return popone;
		}
	}
	
	public static boolean isEmpty() {
		if (order == 0)
			return true;
		else 
			return false;
	}
	
	public static boolean isVPS(String s) {
		boolean flag = false;
		for(int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			
			if(temp == '(') {
				push(temp);
			}   
			if (temp == ')') {
				pop();
			}
			//System.out.println(order);
		}
		
		flag = isEmpty();
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		String tmp = "";
		
		while(t > 0) {
			tmp = sc.next();
			if (isVPS(tmp))
				System.out.println("YES");
			else
				System.out.println("NO");
			
			//**
			arr = new char[1000];
			order = 0;
			t--;
		}
	}
}