package problems;

import java.util.Scanner;

public class Spavanac {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int hour = s.nextInt();
		int minutes = s.nextInt();
		int newMinutes = modulo((minutes-45), 60);
		int newHour = hour;
		if (minutes-45<0) {
			newHour = modulo((hour-1), 24);
		}
		System.out.print(newHour);
		System.out.print(" ");
		System.out.print(newMinutes);
	}
	
	private static int modulo(int a, int b) {
		return (a % b + b) % b;
	}


}
