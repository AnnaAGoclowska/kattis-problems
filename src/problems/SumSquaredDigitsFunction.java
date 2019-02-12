package problems;

import java.util.Scanner;

public class SumSquaredDigitsFunction {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i=0; i<num; i++) {
			int K = s.nextInt();
			int b = s.nextInt();
			int n = s.nextInt();
			int answer = 0;
			while (n>0) {
				int remainder = n%b;
				n = n/b;
				answer = answer + remainder*remainder;
			}
			System.out.println(K + " " + answer);
		}

	}

}
