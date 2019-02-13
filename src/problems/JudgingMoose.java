package problems;

import java.util.Scanner;

public class JudgingMoose {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		String ans = "";
		if (x==0 && y==0) {
			ans = "Not a moose";
		}
		else if (x==y) {
			ans = "Even " + 2*x;
		}
		else if (x>y) {
			ans = "Odd " + 2*x;
		}
		else if (x<y) {
			ans = "Odd " + 2*y;
		}
		System.out.println(ans);

	}

}
