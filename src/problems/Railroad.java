package problems;

import java.util.Scanner;

public class Railroad {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		if (y%2==0) {
			System.out.print("possible");
		}
		else {
			System.out.print("impossible");
		}

	}

}
