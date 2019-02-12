package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class ICPCAwards {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		ArrayList<String> winners = new ArrayList<>();
		ArrayList<String> universities = new ArrayList<>();
		for (int i=0; i<num; i++) {
			String uni = s.next();
			String team = s.next();
			if (winners.size()<12) {
				if (universities.contains(uni)==false) {
					winners.add(uni + " " + team);
					universities.add(uni);
				}
			}
		}
		for (int j=0; j<winners.size(); j++) {
			System.out.println(winners.get(j));
		}

	}

}
