package problems;

import java.util.Scanner;

public class Datum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int day = s.nextInt();
		int month = s.nextInt();
		int totalDays = 0;
		for (int i=1; i<month; i++) {
			switch(i) {
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				totalDays = totalDays+31;
				break;
			case 4: case 6: case 9: case 11:
				totalDays = totalDays+30;
				break;
			case 2:
				totalDays = totalDays+28;
				}
				
			}
			totalDays = totalDays + day;
			int n = totalDays%7;
			switch (n) {
			case 1:
				System.out.println("Thursday");
				break;
			case 2:
				System.out.println("Friday");
				break;
			case 3:
				System.out.println("Saturday");
				break;
			case 4:
				System.out.println("Sunday");
				break;
			case 5:
				System.out.println("Monday");
				break;
			case 6:
				System.out.println("Tuesday");
				break;
			case 0:
				System.out.println("Wednesday");
				break;
			}
			
		}
	}


