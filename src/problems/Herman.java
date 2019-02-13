package problems;

import java.util.Scanner;

public class Herman {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r = s.nextInt();
		double euclidean = r*r*Math.PI;
		double taxicab =2*r*r;
		System.out.println(euclidean);
		System.out.println(taxicab);

	}

}
