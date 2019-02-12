package problems;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class PokerHand {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Character, Integer> values = new HashMap<>();
		for (int i=0; i<5; i++) {
			char rank = s.next().charAt(0);
			if (values.containsKey(rank)) {
				values.put(rank, values.get(rank)+1);
			}
			else {
				values.put(rank, 1);
			}
		}
		int highest = 0;
		for (Entry<Character, Integer> entry : values.entrySet()) {
			if (entry.getValue()>highest) {
				highest=entry.getValue();
			}
		}
		System.out.print(highest);

	}

}
