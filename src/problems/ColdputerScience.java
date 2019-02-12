package problems;

import java.util.Scanner;

public class ColdputerScience {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int ans = 0;
		
		for (int i=0; i<num; i++) {
			int temp = s.nextInt();
			if (temp<0) {
				ans++;
			}
		}
		System.out.print(ans);
	}

}
