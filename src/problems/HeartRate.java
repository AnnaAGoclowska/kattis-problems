package problems;

import java.util.Scanner;

public class HeartRate {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i=0; i<num; i++) {
			float b = s.nextFloat();
			float p = s.nextFloat();
			float bpm = 60*b/p;
			float diff = 60/p;
			System.out.print(bpm+diff);
			System.out.println(bpm-diff + " " + bpm + " " + (bpm+diff));
		}
	}

}
