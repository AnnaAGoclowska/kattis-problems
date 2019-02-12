package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class FreeFood {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> days = new ArrayList<>();
		for (int i=0; i<n; i++) {
			int start = s.nextInt();
			int finish = s.nextInt();
			for (int j=start; j<=finish; j++) {
				if (days.contains(j)==false) {
					days.add(j);
				}
			}
		}
		System.out.println(days.size());
	}

}
