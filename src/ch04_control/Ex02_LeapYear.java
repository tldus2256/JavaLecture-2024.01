package ch04_control;

import java.util.Scanner;

public class Ex02_LeapYear {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세");
		int year = sc.nextInt();
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 100 == 0) {
					if (year % 400 == 0) {
						System.out.println(year + "년은 윤년입니다.");
					} else {
						System.out.println(year + "년은 평년입니다.");
					}
				}
			} else {
				System.out.println(year + "년은 윤년입니다.");
			}
		} else {
			System.out.println(year + "년은 평년입니다.");
		}

		// 코드 개선 - Refactoring
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			System.out.println(year + "년은 윤년입니다.");
		else
			System.out.println(year + "년은 평년입니다.");
	}

}
