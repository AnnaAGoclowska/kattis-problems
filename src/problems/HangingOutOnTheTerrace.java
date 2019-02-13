package problems;

import java.util.Scanner;

public class HangingOutOnTheTerrace {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int limit = s.nextInt();
		int events = s.nextInt();
		int total = 0;
		int denied = 0;
		for (int i=0; i<events; i++) {
			String str = s.next();
			int num = s.nextInt();
			if (str.equals("enter")) {
				if (total+num<=limit) {
					total = total + num;
				}
				else {
					denied++;
				}
			}
			else if (str.equals("leave")) {
				total = total - num;
			}
		}
		System.out.println(denied);

	}

}
