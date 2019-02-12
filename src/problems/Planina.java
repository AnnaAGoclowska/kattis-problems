package problems;

import java.util.Scanner;

public class Planina {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int answer = 2;
	for (int i=0; i<n; i++) {
		answer = answer + (answer-1);
		}
	answer = answer*answer;
	System.out.print(answer);
	}

}
