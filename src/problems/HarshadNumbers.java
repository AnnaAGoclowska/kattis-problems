package problems;

import java.util.Scanner;

public class HarshadNumbers {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		while(num % getDigitSum(num) !=0) {
			num++;
		}
		System.out.println(num);
	}
	
	private static int getDigitSum(int n) {
		int sum = 0;
		while (n>0) {
			sum = sum + n % 10;
			n = n/10;
		}
		return sum;
	}

}
