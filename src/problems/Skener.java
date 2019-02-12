package problems;

import java.util.Scanner;

public class Skener {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int R = s.nextInt();
		int C = s.nextInt();
		int ZR = s.nextInt();
		int ZC = s.nextInt();
		String[][] input = new String[R][C];
		for (int i = 0; i < R; i++) {
			String row = s.next();
			for (int j = 0; j < C; j++)
				input[i][j] = row.substring(j, j + 1);
		}
		for (int i = 0; i < input.length; i++) {
			for (int y = 0; y < ZR; y++) {
				for (int j = 0; j < input[0].length; j++) {
					for (int x = 0; x < ZC; x++)
						System.out.print(input[i][j]);
				}

				System.out.println();
			}
		}
	}
}
