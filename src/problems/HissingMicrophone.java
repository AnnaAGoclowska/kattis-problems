package problems;

import java.util.Scanner;

public class HissingMicrophone {
	
	public static void main(String[] args) {
		boolean answer = false;
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		char[] word = input.toCharArray();
		
		for (int i=1; i<word.length; i++) {
			if (word[i]=='s' && word[i-1]=='s') {
				answer = true;
			}
		}
		String ans;
		if (answer==false) {
			ans = "no hiss";
		}
		else {
			ans = "hiss";
		}
		System.out.print(ans);
	}

}
