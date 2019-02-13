package problems;

import java.util.Scanner;

public class Kemija {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] words = str.split("\\s");
		String answer = "";
		for (int i=0; i<words.length; i++) {
			String string = words[i];
			char[]chars = string.toCharArray();
			for(int j=0; j<string.length()-2; j++) {
				char c = chars[j];
				if (c=='a' || c=='e' || c=='o' || c=='u' || c=='i') {
					chars[j+1] = '.';
					chars[j+2] = '.';
				}
			}
			String ans = "";
			for (int k=0; k<chars.length; k++) {
				if (chars[k] !='.') {
					ans = ans + chars[k];
				}
			}
			answer = answer + ans + " ";
		}
		System.out.println(answer);
	}

}
