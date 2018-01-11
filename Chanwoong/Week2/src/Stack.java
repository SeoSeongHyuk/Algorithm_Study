/*
�ڹٿ��� ���ڿ� �񱳽�, ���ڿ��� ����� ������ ���ڿ� ��(command == "push")�� ���� ���
���ͷ� ���ڿ��� �񱳸� �ϴ� ���� �ƴ϶�, ����� �ּҰ��� ���Ѵ�.
���� ���ͷ��� ����� ���� ������ �޶� ���� ���ڿ��� �ִٸ� ������ �ּҰ��� ����Ű�� �ִ�.
���� ���� �񱳴� equals��� �޼ҵ带 ���, command.equals("push")�� ���ڿ� �񱳸� �Ѵ�.
���� ���� �񱳸� �ϰ� �Ǹ� ���� ���ڿ��� ������ �ִ��� �ּ� ���� �ٸ��Ƿ�, �׻� ������ ����.
 */

import java.util.*;

public class Stack {
	public static Scanner sc = new Scanner(System.in);
	public static int order = 0;
	public static int [] arr = new int[100];
	
	public static void push() {
		int x = sc.nextInt();
		
		arr[order++] = x;
	}
	public static void pop() {
		if (order == 0)
			System.out.println("-1");
		else {
			System.out.println(arr[order-1]);
			order --;
		}
	}
	public static void size() {
		System.out.println(order);
	}
	public static void empty() {
		if(order == 0)
			System.out.println("1");
		else
			System.out.println("0");
	}
	public static void top() {
		if (order == 0)
			System.out.println("-1");
		else
			System.out.println(arr[order - 1]);
	}
	public static void main(String[] args) {
		int n = sc.nextInt();
		
		while(n > 0) {
			String command = sc.next();

			if(command.equals("push"))
				push();
			else if(command.equals("pop"))
				pop();
			else if(command.equals("size"))
				size();
			else if(command.equals("empty"))
				empty();
			else if(command.equals("top"))
				top();
			else
				System.out.println("error");
			n--;
			
		}
	}
}
