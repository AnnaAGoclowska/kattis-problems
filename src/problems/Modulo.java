package problems;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Modulo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<Integer> nums = new HashSet<Integer>();
		for (int i=0; i<10; i++) {
			int n = s.nextInt();
			n = n%42;
			if (nums.contains(n)==false) {
				nums.add(n);
			}
		}
		System.out.println(nums.size());

	}

}
