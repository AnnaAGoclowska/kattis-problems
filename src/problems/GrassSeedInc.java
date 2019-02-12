package problems;

import java.util.Scanner;

public class GrassSeedInc {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double cost = s.nextDouble();
		int number = s.nextInt();
		double totalSize = 0;
		
		for (int i=0; i<number; i++) {
			double width = s.nextDouble();
			double height = s.nextDouble();
			totalSize = totalSize + width*height;
		}
		double ans = totalSize*cost;
		System.out.println(ans);

	}

}
