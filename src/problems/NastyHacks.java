package problems;

import java.util.Scanner;

public class NastyHacks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i=0; i<n; i++) {
			int r = s.nextInt();
			int e = s.nextInt();
			int c = s.nextInt();
			if (r< e-c) {
				System.out.println("advertise");
			}
			else if (r>e-c) {
				System.out.println("do not advertise");
			}
			else if (r==e-c) {
				System.out.println("does not matter");
			}
		}
	}

}
