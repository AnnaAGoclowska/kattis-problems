package problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NoDuplicates {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] words;
		String str = s.nextLine();
		words = str.split("\\s");
		if (containsDuplicates(words)) {
			System.out.println("no");
		}
		else {
			System.out.println("yes");
		}
	}

	private static boolean containsDuplicates(String[] s) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < s.length; i++) {
			if (set.contains(s[i])) {
				return true;
			} else {
				set.add(s[i]);
			}
		}
		return false;
	}
}