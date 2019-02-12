package problems;

import java.util.*;


public class Autori {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String answer = new String();
		for (int i=0; i<name.length();i++) {
			char current = name.charAt(i);
			if (Character.isUpperCase(current)) {
				answer = answer+current;
			}
		}
		System.out.println(answer);
	}

}
