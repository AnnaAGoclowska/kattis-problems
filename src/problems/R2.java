package problems;

import java.util.Scanner;

public class R2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r1 = s.nextInt();
		int mean = s.nextInt();
		int r2 = mean*2 - r1;
		System.out.print(r2);

	}

}
