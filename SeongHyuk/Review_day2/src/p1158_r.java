import java.util.ArrayList;
import java.util.Scanner;

public class p1158_r {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<>();
		
		int n = scan.nextInt();
		int m = scan.nextInt() - 1;
		
		for(int i = 1; i <= n; i++) {
			arr.add(i);
		}
		
		int remove = 0;
		String answer = "";
		while(!arr.isEmpty()) {
			remove += m;
			if(remove >= arr.size())
				remove %= arr.size();
			
			answer += arr.remove(remove) + ", ";
		}
		
		System.out.println("<" + answer.substring(0, answer.length()-2) + ">");
	}

}
