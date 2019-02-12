package problems;
import java.util.*;

public class Tarifa {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int monthlyLimit = s.nextInt();
		int monthNum = s.nextInt();
		int[] monthlyUsage = new int[monthNum];
		int totalUsage = 0;
		for (int i=0; i<monthNum; i++) {
			monthlyUsage[i] = s.nextInt();
			totalUsage = totalUsage + monthlyUsage[i];
		}
		
		int totalNum = monthNum * monthlyLimit;
		int ans = totalNum - totalUsage + monthlyLimit;
		System.out.print(ans);
		
	}
}
