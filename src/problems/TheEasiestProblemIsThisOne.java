package problems;

import java.util.Scanner;

public class TheEasiestProblemIsThisOne {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		while(N!=0) {
			int i = 11;
			int digitsProduct = 0;
			int digitsN = numOfDigits(N);
			while (digitsN != digitsProduct) {
				 digitsProduct = numOfDigits(i*N);
				 i++;
			}
			System.out.println(i-1);
			N = s.nextInt();
		}

	}
	
	private static int numOfDigits(int n) {
		int sum = 0;
		while (n>0) {
			sum = sum + n % 10;
			n = n/10;
		}
		return sum;
	}

}
