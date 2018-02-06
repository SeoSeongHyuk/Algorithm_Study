import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
	static ArrayList<String> errorDate;
	static String[] date = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
	static int count = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		errorDate = new ArrayList<>();
		for(int i = 0; i < n; i++) {
			errorDate.add(scan.next());
		}
		
		System.out.println("****** Error List *****");
		for(int i = 1; i <= 7; i ++) {
			ArrayList<String> output = new ArrayList<>();
			makeError(i, output, 0);
		}
		System.out.println("총 " + count);
	}
	
	public static void makeError(int n, ArrayList<String> list, int index) {
		if(n == 0) {
			if(checkError(list)) {
				printError(list);
				count++;
			}
			return;
		}
		
		for(int i = index; i < 7; i++) {
			ArrayList<String> tmp = new ArrayList<>();
			tmp.addAll(list);
			tmp.add(date[i]);
			makeError(n-1, tmp, i+1);
		}
	}
	
	public static void printError(ArrayList<String> list) {
		Iterator<String> iter = list.iterator();
		String total = "";
		while(iter.hasNext()) {
			total += (iter.next() + " ");
		}
		System.out.println(total);
	}
	
	public static boolean checkError(ArrayList<String> list) {
		Iterator<String> error = errorDate.iterator();
		
		while(error.hasNext()) {
			if(list.contains(error.next()))
					return true;
		}
		return false;
	}
}