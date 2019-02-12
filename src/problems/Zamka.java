package problems;
import java.util.*;

public class Zamka {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int L = s.nextInt();
		int D = s.nextInt();
		int X = s.nextInt();
		int minimum = L;
		int maximum = D;
		
		for (int i=L; i<=D; i++) {
			int sum = sumDigits(i);
			if (sum==X) {
				minimum = i;
				break;
			}
		}
		for (int j=D; j>=L; j--) {
			int sum = sumDigits(j);
			if (sum==X) {
				maximum = j;
				break;
			}
		}
		
		System.out.println(minimum);
		System.out.println(maximum);
		
	}
	
	private static int sumDigits(int number) {
		int sum = 0;
        while(number > 0)
        {
            int d = number % 10;
            sum = sum + d;
            number = number / 10;
        }
        return sum;
	}


}
