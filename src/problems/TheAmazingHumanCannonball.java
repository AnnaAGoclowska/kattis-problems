package problems;

import java.util.Scanner;

public class TheAmazingHumanCannonball {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i=0; i<num; i++) {
			float velocity = s.nextFloat();
			float angle = s.nextFloat();
			float distanceToWall = s.nextFloat();
			float lowerHeight = s.nextFloat();
			float upperHeight = s.nextFloat();
			double angleInRad = Math.toRadians(angle);
			
			double timeAtWall = distanceToWall / (velocity *Math.cos(angleInRad) );
			double height = velocity*timeAtWall*Math.sin(angleInRad) - 0.5 * 9.81 *timeAtWall*timeAtWall;
			
			if (height < upperHeight-1 && height>lowerHeight+1) {
				System.out.println("Safe");
			}
			else {
				System.out.println("Not Safe");
			}
		}
		
	}

}
