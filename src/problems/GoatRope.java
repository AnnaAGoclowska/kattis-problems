package problems;

import java.util.Scanner;

public class GoatRope {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		double dist = 0;
		if (x > x1 && x < x2 && y > y2) {
			dist = y - y2;
		} else if (x > x2 && y > y1 && y < y2) {
			dist = x - x2;
		} else if (x > x1 && x < x2 && y < y1) {
			dist = y1 - y;
		} else if (x < x1 && y > y1 && y < y2) {
			dist = x1 - x;
		} else if (x > x2 && y > y2) {
			dist = Math.sqrt(((x - x2) * (x - x2)) + ((y - y2) * (y - y2)));
		} else if (x > x2 && y < y1) {
			dist = Math.sqrt(((x - x2) * (x - x2)) + ((y - y1) * (y - y1)));
		} else if (x < x1 && y < y1) {
			dist = Math.sqrt(((x - x1) * (x - x1)) + ((y - y1) * (y - y1)));
		} else if (x < x1 && y > y2) {
			dist = Math.sqrt(((x - x1) * (x - x1)) + ((y - y2) * (y - y2)));
		}
		System.out.println(dist);
	}

}
