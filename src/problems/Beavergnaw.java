package problems;

import java.util.Scanner;

public class Beavergnaw {

	public static void main(String[] args) {
		int D=-1, V=-1;
		Scanner s = new Scanner(System.in);
		while (D!=0 && V!=0) {
			D = s.nextInt();
			V = s.nextInt();
			double d3 = (D*D*D - 6*V/Math.PI); 
			double d = Math.pow(d3, 1/3.0);
			System.out.println(d);
		}

	}

}
