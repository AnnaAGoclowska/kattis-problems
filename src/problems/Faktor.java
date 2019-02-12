package problems;
import java.util.*;

public class Faktor {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] nums = str.split(" ");
		int A = Integer.parseInt(nums[0]);
		int I = Integer.parseInt(nums[1]);
		int answer = 0;
		if (A==1) {
			answer = A*I;
		}
		else {
			answer = (A * (I-1)) +1;
		}
		
		System.out.print(answer);


	}

}
