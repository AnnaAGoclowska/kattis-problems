package problems;

import java.util.Scanner;

public class CryptographersConundrum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] text = s.next().toCharArray();
		int ans = text.length;
		for (int i=0; i<text.length; i++) {
			int n = i%3;
			switch (n) {
			case 0:
				if (text[i]=='P'){
					ans--;
				}
				break;
			case 1:
				if (text[i]=='E') {
					ans--;
				}
				break;
			case 2:
				if (text[i]=='R') {
					ans--;
				}
				break;
			}
		}
		System.out.print(ans);

	}

}
