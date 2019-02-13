package problems;

import java.util.Scanner;

public class DetailedDifferences {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		for (int i = 0; i < n; i++) {
			String first = s.nextLine();
			String second = s.nextLine();
			String answer = "";
			for (int j = 0; j < first.length(); j++) {
				char a = first.charAt(j);
				char b = second.charAt(j);
				if (a == b) {
					answer = answer + ".";
				} else {
					answer = answer + "*";
				}
			}
			System.out.println(first);
			System.out.println(second);
			System.out.println(answer);
			System.out.println();
		}

	}

}
