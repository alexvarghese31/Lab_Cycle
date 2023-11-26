import java.util.StringTokenizer;
import java.util.Scanner;

public class IntToString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter line of integers: ");
		String line = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line, " ");
		int sum = 0;
		while(st.hasMoreTokens()){
			int token = Integer.parseInt(st.nextToken());
			System.out.println(token);
			sum += token;
		}
		System.out.println("Sum = "+sum);
	}
}
