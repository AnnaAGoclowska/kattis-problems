package problems;

import java.util.Scanner;

public class Apaxiaaaaaaaaaaaans {
	public static void main(String[] args) {
		String answer = "";
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] name = str.toCharArray();
		answer = answer + name[0];
		for (int i=1; i<name.length; i++) {
			if (name[i]==name[i-1]) {
				continue;
			}
			answer = answer + name[i];
		}
		System.out.print(answer);
	}

}
