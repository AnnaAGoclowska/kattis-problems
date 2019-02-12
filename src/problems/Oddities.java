package problems;

import java.util.Scanner;

public class Oddities {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i=0; i<num; i++) {
			int n = s.nextInt();
			if (n%2==0) {
				System.out.println(n + " is even");
			}
			else {
				System.out.println(n + " is odd");
			}
		}

	}

}
