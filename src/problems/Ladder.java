package problems;

import java.util.Scanner;

public class Ladder {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		int angle = s.nextInt();
		double angleInRad = Math.toRadians(angle);
		double sin = Math.sin(angleInRad);
		double ans = height/sin;
		int answer = (int)Math.ceil(ans);
		System.out.print(answer);
	}

}
