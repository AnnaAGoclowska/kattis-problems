package problems;

import java.util.Scanner;

public class StarArrangements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.println(num + ":");
		for (int i=2; i<num; i++) {
			if (num % (2*i -1)==0 || num % (2*i-1)==i) {
				System.out.println(i +","+ (i-1));
			}
			
			if (num % (2*i)==i || num % (2*i) ==0) {
				System.out.println(i +","+ i);
			}
		}

	}

}
