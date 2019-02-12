package problems;

import java.util.Scanner;

public class RoamingRomans {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float num = s.nextFloat();
		int ans = Math.round(num*1000*5280/4854);
		System.out.print(ans);

	}

}
