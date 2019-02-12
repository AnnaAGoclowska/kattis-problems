package problems;
import java.util.*;

public class Bijele {
	
	public static void main(String[] args) {
		int[] correct = {1, 1, 2, 2, 2, 8};
		Scanner s = new Scanner(System.in);
		String numbers = s.nextLine();
		String[] nums = numbers.trim().split("\\s+");
		for (int i=0; i<6; i++) {
			int a = Integer.parseInt(nums[i]);
			int answer = correct[i] - a;
			System.out.print(answer);
			System.out.print(" ");
		}
		
	}
}
