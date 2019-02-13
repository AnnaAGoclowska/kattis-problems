package problems;

import java.util.Scanner;

public class NumberFun {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i = 0; i < t; i++) {
			int first = s.nextInt();
			int second = s.nextInt();
			int third = s.nextInt();
			if (first < second) {
				int temp = first;
				first = second;
				second = temp;
			}
			if (first + second == third || first - second == third || first * second == third
					|| (first / second == third && first % second == 0)) {
				System.out.println("Possible");
			} else {
				System.out.println("Impossible");
			}
		}

	}

}
