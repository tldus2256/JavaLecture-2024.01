package src.ch06_class.sec03_calculate;

import java.util.Scanner;

public class CardMain {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("나이> ");
        int age = scan.nextInt();
        System.out.print("금액> ");
        int cash= scan.nextInt();
        scan.close();

        Card tm = new Card(age, cash);
        System.out.println(tm);

    }

}
