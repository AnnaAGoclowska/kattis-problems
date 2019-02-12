package problems;
import java.util.*;

public class Trik {
	public static int answer = 1;

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char[] moves = str.toCharArray();
		
		for (int i=0; i<moves.length; i++) {
			char x = moves[i];
			if (x=='A') {
				moveA();
			}
			if (x=='B') {
				moveB();
			}
			if (x=='C') {
				moveC();
			}
		}
		
		System.out.print(answer);

	}
	
	public static void moveA() {
		if (answer == 1) {
			answer=2;
		}
		else if (answer ==2) {
			answer =1;
		}
	}
	
	public static void moveB() {
		if (answer==2) {
			answer=3;
		}
		else if (answer==3) {
			answer=2;
		}
	}
	
	public static void moveC() {
		if (answer==1) {
			answer=3;
		}
		else if (answer==3) {
			answer=1;
		}
	}

}
