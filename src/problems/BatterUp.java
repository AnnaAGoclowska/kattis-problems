package problems;

import java.util.Scanner;

public class BatterUp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int den = 0;
		float sum = 0;
		for (int i=0; i<n; i++) {
			int a = s.nextInt();
			if (a>=0) {
			sum = sum + a;
			den++;
			}
		}
		sum = sum/den;
		System.out.println(sum);

	}

}
