import java.util.Scanner;

public class p1978 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		for(int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		
		System.out.println(find(list));
	}

	public static int find(int[] list) {
		int count = 0;
		
		for(int i = 0; i < list.length; i++) {
			if(list[i] == 2 || list[i] == 3)
				count++;
			
			if(list[i]%2 != 0 && list[i]%3 != 0)
				count++;
				
		}
		
		return count;
	}
}
