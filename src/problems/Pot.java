package problems;

import java.util.Scanner;

public class Pot {

	public static void main(String[] args) {
		int answer = 0;
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i=0; i<num; i++) {
			int number = s.nextInt();
			answer = answer + (int)Math.pow((int)number/10, getLastDigit(number));
		}
		
		System.out.print(answer);

	}
	
	private static int getLastDigit(int number) {
		return number%10;
	}
	

}
