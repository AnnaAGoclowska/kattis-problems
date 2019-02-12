package problems;

import java.util.Scanner;

public class LastFactorialDigit {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		for (int i=0; i<x; i++) {
			int num = s.nextInt();
			int answer = 1;
			for (int j=1; j<=num; j++) {
				answer = answer*j;
				if (answer>9) {
					answer = answer % 10;
				}
				
			}
			System.out.println(answer);
		}
	}

}
