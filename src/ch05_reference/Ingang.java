package src.ch05_reference;

import java.util.Scanner;

public class Ingang {
    public static void main(String[] args) {
//        int [] students = {90, 80, 70, 60, 50};
//
//        int total = 0;
//        for (int i = 0; i < students.length; i++) {
//            total = total + students[i];
//        }
//        double average = (double) total / students.length;
//        System.out.println("점수 총합:" + total);
//        System.out.println("점수 평균:" + average);

//        Scanner input = new Scanner(System.in);
//        int [] numbers = new int[5];
//
//        System.out.println("5개의 정수를 입력하세요: ");
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = input.nextInt();
//        }
//        System.out.println("출력");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i]);
//            if ( i < numbers.length - 1) {
//                System.out.print(", ");
//            }
//        }
//
//        Scanner scanner = new Scanner(System.in);
//        int [] nums = new int[5];
//
//        System.out.println("5개의 정수를 입력하세요:");
//        for (int i = 0; i < 5; i++) {
//            nums[i] = scanner.nextInt();
//        }
//        System.out.println("입력한 정수를 역순으로 출력");
//        for (int i = 4; i >= 0 ; i--) {
//            System.out.println(nums[i]);
//            if (i >0) {
//                System.out.println(", ");
//            }
//        }
//        Scanner scanner = new Scanner(System.in);
//        int [ ] numbers = new int[5];
//        int sum = 0;
//        double average;
//
//        System.out.println("5개의 정수를 입력하세요:");
//        for(int i = 0; i < 5; i++) {
//            numbers[i] = scanner.nextInt();
//            sum = sum + numbers[i];
//        }
//        average = (double) sum / 5 ;
//
//        System.out.println("입력한 정수의 합계: " + sum);
//        System.out.println("입력한 정수의 평균: " + average);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("입력받을 숫자의 개수를 입력하세요:");
//        int count = scanner.nextInt();
//
//        int[] numbers = new int[count];
//        int sum = 0;
//        double average;
//
//        System.out.println(count + "개의 정수를 입력하세요:");
//        for(int i = 0; i < count; i++) {
//            numbers[i] = scanner.nextInt();
//            sum += numbers[i];
//        }
//        average = (double) sum / count;
//        System.out.println("입력한 정수의 합계: " + sum);
//        System.out.println("입력한 정수의 평균: " + average);
//
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세여:");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요:");
        for(int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

    }
}
