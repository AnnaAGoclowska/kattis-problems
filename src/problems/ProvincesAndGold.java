package problems;

import java.util.Scanner;

public class ProvincesAndGold {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int gold = s.nextInt();
		int silver = s.nextInt();
		int copper = s.nextInt();
		int buyingPower = gold*3 + silver*2 + copper;
		String victory="", treasure;
		if (buyingPower>=8) {
			victory = "Province";
		}
		else if (buyingPower>=5) {
			victory = "Duchy";
		}
		else if (buyingPower>=2) {
			victory = "Estate";
		}
		
		if (buyingPower >=6) {
			treasure = "Gold";
		}
		else if (buyingPower >=3) {
			treasure = "Silver";
		}
		else {
			treasure = "Copper";
		}
		if (victory.isEmpty()) {
			System.out.println(treasure);
		}
		else {
			System.out.println(victory + " or " + treasure);
		}
	}

}
