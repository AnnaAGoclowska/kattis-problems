package problems;

import java.util.Scanner;

public class StandOnZanzibar {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i=0; i<=n; i++) {
			int previous = s.nextInt();
			int current = s.nextInt();
			int turtles = 0;
			while (current!=0) {
				int diff = current-2*previous;
				if (diff>0) {
				turtles = turtles + diff;}
				previous = current;
				current = s.nextInt();
				
			}
			System.out.println(turtles);
		}

	}

}
