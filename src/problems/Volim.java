package problems;

import java.util.Scanner;

public class Volim {

	public static void main(String[] args) {
		int timeToExplosion = 210;
		Scanner s = new Scanner(System.in);
		int player = s.nextInt();
		int questionsNum = s.nextInt();
		for (int i = 0; i < questionsNum; i++) {
			int time = s.nextInt();
			char outcome = s.next().charAt(0);
			timeToExplosion = timeToExplosion - time;
			if (timeToExplosion <= 0) {
				break;
			} else {
				if (outcome == 'T') {
					player = (player + 1) % 8;
				}
			}
		}
		if (player == 0) {
			player = 8;
		}
		System.out.println(player);
	}
}
