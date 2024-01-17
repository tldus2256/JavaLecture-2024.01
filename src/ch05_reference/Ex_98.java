package ch05_reference;

import java.util.Scanner;

public class Ex_98 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요:");
		String str = scanner.nextLine();
		System.out.println("입력한 문자열: " + str);
		
		System.out.println("정수를 입력하세요:");
		int intValue = scanner.nextInt();
		System.out.println("입력한 정수: " + intValue);
		
		System.out.println("실수를 입력");
		double doubleValue = scanner.nextDouble();
		System.out.println("입력한 실수: " + doubleValue);
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째숫자를 입력하세요:");
		int num1 = scanner.nextInt();
		
		System.out.print("두번째숫자를 입력하세요:");
		int num2= scanner.nextInt();
		

	}

}
