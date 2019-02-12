package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class IveBeenEverywhereMan {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numTests = s.nextInt();
		for (int i=0; i<numTests; i++) {
			int tripsNum = s.nextInt();
			int ans = 0;
			ArrayList<String> visited = new ArrayList<>(); 
			for (int j=0; j<tripsNum; j++) {
				String city = s.next();
				if (visited.contains(city)) {
					ans = ans + 0;
				}
				else {
					ans++;
					visited.add(city);
				}
				
			}
			System.out.println(ans);
		}

	}

}
