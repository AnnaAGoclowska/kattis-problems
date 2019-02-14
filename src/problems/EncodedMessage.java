package problems;

import java.util.Scanner;

public class EncodedMessage {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();
		for (int i=0; i<=testCases; i++) {
			String answer = "";
			String encoded = s.nextLine();
			char[] enc = encoded.toCharArray();
			int squareSide = (int)Math.sqrt(encoded.length());
			for (int a=0; a<squareSide; a++) {
				for (int b=1; b<=squareSide; b++) {
					char next = enc[b*squareSide - a-1];
					answer = answer + next;
				}
			}
			System.out.println(answer);
		}
		

	}

}
