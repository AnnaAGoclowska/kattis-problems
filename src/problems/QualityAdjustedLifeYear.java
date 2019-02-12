package problems;

import java.util.Scanner;

public class QualityAdjustedLifeYear {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		float ans = 0;
		for (int i=0; i<num; i++) {
			float q = s.nextFloat();
			float y = s.nextFloat();
			ans = ans + q*y;
		}
		System.out.print(ans);
	}

}
