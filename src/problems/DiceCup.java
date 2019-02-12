package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DiceCup {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int firstDice = s.nextInt();
		int secondDice = s.nextInt();
		int highest = 0;
		ArrayList<Integer>output = new ArrayList<>();
		HashMap<Integer, Integer> results = new HashMap<>();
		
		for (int i=1; i<=firstDice; i++) {
			int dice1 = i;
			for (int j=1; j<=secondDice; j++) {
				int dice2 = j;
				int sum = dice1+dice2;
				if (results.containsKey(sum)) {
					results.put(sum, results.get(sum)+1);
				}
				else {
					results.put(sum, 1);
				}
			}
		}
		for (Map.Entry<Integer, Integer>entry: results.entrySet()) {
			if (entry.getValue()> highest) {
				highest = entry.getValue();
			}
		}
		for (Map.Entry<Integer, Integer>entry: results.entrySet()) {
			if (entry.getValue()== highest) {
				output.add(entry.getKey());
			}
		}
		
		Collections.sort(output);
		for (int i=0; i<output.size(); i++) {
			System.out.println(output.get(i));
		}


	}

}
