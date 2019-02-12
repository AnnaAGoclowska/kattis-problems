package problems;

import java.util.Scanner;

public class SevenWonders {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String string = s.nextLine();
		char[] cards = string.toCharArray();
		int tablets = 0;
		int compasses = 0;
		int gears = 0;
		int answer;
		for (int i=0; i<cards.length; i++) {
			char next = cards[i];
			switch(next) {
			case 'T':
				tablets++;
				break;
			case 'C':
				compasses++;
				break;
			case 'G':
				gears++;
				break;
			}
		}
		int smallest = Math.min(tablets, Math.min(compasses, gears));
		answer = tablets*tablets + compasses*compasses + gears*gears + 7*smallest;
		System.out.print(answer);
	}
	

}
