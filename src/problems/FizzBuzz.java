package problems;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int divisor1 = s.nextInt();
		int divisor2 = s.nextInt();
		int num = s.nextInt();
		for (int i=1; i<=num; i++) {
			String ans = "";
			if (i % divisor1 == 0) {
				ans = ans + "Fizz";
			}
			if (i % divisor2 == 0) {
				ans = ans + "Buzz";
			}
			if (ans.isEmpty()) {
				System.out.println(i);
			}
			else {
				System.out.println(ans);
			}
		}

	}

}
