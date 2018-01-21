import java.util.Scanner;

public class p10824 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		String c = scan.next();
		String d = scan.next();
		
		String num1 = a + b;
		String num2 = c + d;

		Long sum = Long.parseLong(num1) + Long.parseLong(num2);
		System.out.println(sum);
		
		/* 문제 자료형에 대한 설명
		 * int 10자리 / long 19자리
		 */
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println("~");
		System.out.println(Integer.MAX_VALUE);
		System.out.println();
		System.out.println(Long.MIN_VALUE);
		System.out.println("~");
		System.out.println(Long.MAX_VALUE);
		System.out.println();
	}
}
