package problems;
import java.util.*;

public class StuckInATimeLoop {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int i=1; i<=num; i++) {
			System.out.println(i + " Abracadabra");
		}

	}

}
