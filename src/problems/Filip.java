package problems;

import java.util.Scanner;

public class Filip {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char[] first = s.next().toCharArray();
		char[] second = s.next().toCharArray();
		int numFirst = Character.getNumericValue(first[2])*100 + Character.getNumericValue(first[1])*10 + Character.getNumericValue(first[0]);
		int numSecond = Character.getNumericValue(second[2])*100 + Character.getNumericValue(second[1])*10 + Character.getNumericValue(second[0]);
		if (numFirst>numSecond) {
			System.out.print(numFirst);
		}
		else {
			System.out.print(numSecond);
		}

	}

}
