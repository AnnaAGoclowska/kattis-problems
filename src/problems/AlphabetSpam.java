package problems;

import java.util.Scanner;

public class AlphabetSpam {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		int all = input.length();
		int upper = 0, lower = 0, whitespace = 0, symbols = 0;
		for (int i=0; i<all; i++) {
			int n = (int)input.charAt(i);
			if (n==95) {
				whitespace++;
			}
			else if (n>=97 && n<=122) {
				lower++;
			}
			else if (n>=65 && n<=90) {
				upper++;
			}
			else {
				symbols++;
			}
		}
		System.out.println((double)whitespace/all);
		System.out.println((double)lower/all);
		System.out.println((double)upper/all);
		System.out.println((double)symbols/all);

	}

}
