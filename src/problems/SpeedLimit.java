package problems;

import java.util.Scanner;

public class SpeedLimit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int num = s.nextInt();
			if (num==-1) {
				break;
			}
			int answer = 0;
			int hoursSoFar = 0;
			for (int i=0; i<num; i++) {
				int speed = s.nextInt();
				int hours = s.nextInt();
				int distance = speed* (hours - hoursSoFar);
				System.out.println(distance);
				answer = answer + distance;
				hoursSoFar = hoursSoFar + (hours - hoursSoFar);
			}
			System.out.println(answer + " miles");
		}
		
	}
	
}
