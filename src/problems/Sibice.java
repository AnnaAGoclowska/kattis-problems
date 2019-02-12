package problems;

import java.util.Scanner;

public class Sibice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int matches = s.nextInt();
		int width = s.nextInt();
		int height = s.nextInt();
		int lengthLimit = longestPossible(width, height);
		for (int i=0; i<matches; i++) {
			int nextLength = s.nextInt();
			if (nextLength<=lengthLimit) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");
			}
		}
	}
	
	private static int longestPossible(int x, int y) {
		int longest = (int) Math.sqrt(x*x + y*y);
		return longest;
	}

}
