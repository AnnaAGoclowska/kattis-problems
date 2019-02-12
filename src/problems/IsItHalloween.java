package problems;

import java.util.Scanner;

public class IsItHalloween {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String month = s.next();
		int day = s.nextInt();
		if ((month.equals("OCT") && day==31) || (month.equals("DEC") && day==25)) {
			System.out.println("yup");
		}
		else {
			System.out.println("nope");
		}
		

	}

}
