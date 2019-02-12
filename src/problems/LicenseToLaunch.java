package problems;

import java.util.Scanner;

public class LicenseToLaunch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int min = s.nextInt();
		int waiting = 0, potential = 0;
		for (int i=0; i<n-1; i++) {
			potential++;
			int num = s.nextInt();
			if (num<min) {
				min = num;
				waiting = potential;
			}
		}
		System.out.println(waiting);

	}

}
