package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Cetvrta {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> xCoords, yCoords;
		int answerX, answerY;
		xCoords = new ArrayList<>();
		yCoords = new ArrayList<>();
		for (int i=0; i<3; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			xCoords.add(x);
			yCoords.add(y);
			}
		answerX = findFourth(xCoords.get(0), xCoords.get(1), xCoords.get(2));
		answerY = findFourth(yCoords.get(0), yCoords.get(1), yCoords.get(2));
		
		System.out.print(answerX);
		System.out.print(" ");
		System.out.print(answerY);

		}	
	
	private static int findFourth(int a, int b, int c) {
		int answer = 0;
		if (a==b) {
			answer = c;
		}
		else if (b==c) {
			answer = a;
		}
		else if (a==c) {
			answer =b;
		}
		return answer;
	}

}
