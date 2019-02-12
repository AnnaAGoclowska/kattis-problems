package problems;

import java.util.Scanner;

public class Pet {
	public static void main(String[] args) {
		int highest = 0;
		int index = 0;
		Scanner s = new Scanner(System.in);
		for (int i=0; i<5; i++) {
			int score = 0;
			for (int j=0; j<4; j++) {
				score = score + s.nextInt();
			}
			if (score>highest) {
				highest = score;
				index = i+1;
			}
		}
		System.out.print(index);
		System.out.print(" ");
		System.out.print(highest);
	}

}
