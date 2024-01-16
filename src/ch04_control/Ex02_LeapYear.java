package ch04_control;

import java.util.Scanner;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		System.out.print("연도 입력> ");
		Scanner scan = new Scanner(System.in);
		String inputStr = scan.nextLine();
		int year = Integer.parseInt(inputStr);
		scan.close();
	}

}
