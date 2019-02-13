package problems;

import java.util.Scanner;
import java.util.Arrays;

public class Parking {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int i=0; i<t; i++) {
			int shopNum = s.nextInt();
			int[] locations = new int[shopNum];
			int distance = 0;
			for (int j=0; j<shopNum; j++) {
				locations[j] = s.nextInt();}
				Arrays.sort(locations);
				for(int k=0; k<locations.length-1;k++) {
					int d = locations[k+1]-locations[k];
					distance = distance + d;
				}
				System.out.println(distance*2);
			}
			
		}

	}
