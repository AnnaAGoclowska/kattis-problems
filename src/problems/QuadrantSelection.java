package problems;
import java.util.*;

public class QuadrantSelection {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int answer = 0;
		
		if (x>0) {
			if (y>0) {
				answer = 1;
			}
			else if (y<0) {
				answer =4;
			}
		}
		else if (x<0) {
			if (y>0) {
				answer = 2;
			}
			else if (y<0) {
				answer = 3;
			}
		}
		System.out.print(answer);
		
	}
}
