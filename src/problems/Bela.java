package problems;

import java.util.Scanner;

public class Bela {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hands = s.nextInt();
		char dominantSuit = s.next().charAt(0);
		int ans = 0;
		for (int i=0; i<hands*4; i++) {
			String description = s.next();
			char num = description.charAt(0);
			char suit = description.charAt(1);
			
			switch (num) {
			case 'A':
				ans += 11;
				break;
			case 'K':
				ans +=4;
				break;
			case 'Q':
				ans += 3;
				break;
			case 'J':
				if (suit==dominantSuit) {
					ans +=20;
				}
				else {
					ans +=2;
				}
				break;
			case 'T':
				ans += 10;
				break;
			case '9':
				if (suit==dominantSuit) {
					ans +=14;
				}
				else {
					ans +=0;
				}
				break;
			default:
				ans +=0;
				break;
			
			}
			
		}
		System.out.print(ans);

	}

}
