package problems;
import java.util.*;

public class TakeTwoStones {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a%2 == 0) {
			System.out.print("Bob");
		}
		else {
			System.out.print("Alice");
		}
	}
}
