package problems;

import java.util.Scanner;

public class DRMMessages {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String half1 = input.substring(0, input.length()/2);
		String half2 = input.substring(input.length()/2);
		int sum1 = sumCharValues(half1);
		int sum2 = sumCharValues(half2);
		half1 = rotateChars(half1, sum1);
		half2 = rotateChars(half2, sum2);
		String answer = "";
		for (int i=0; i<half1.length(); i++) {
			int rot = (int)(half2.charAt(i)) - 65;
			answer = answer + rotateSingleChar(half1.charAt(i), rot);
		}
		System.out.println(answer);

	}
	
	public static int sumCharValues(String s) {
		int sum = 0;
		for (int i=0; i<s.length(); i++) {
			sum = sum + ((int)s.charAt(i))-65;
		}
		return sum;
	}
	
	public static String rotateChars(String s, int rotation) {
		String rotated = "";
		for (int i=0; i<s.length(); i++) {
			int r = (int)s.charAt(i) - 65;
			r = (r + rotation) % 26;
			r = r + 65;
			rotated = rotated + (char)r;
		}
		return rotated;
	}
	
	public static char rotateSingleChar(char c, int rot) {
		int r = (int)c - 65;
		r = (r+rot) % 26;
		r = r + 65;
		return (char)r;
	}

}