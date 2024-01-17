package ch05_reference;

public class Ex999 {

	public static void main(String[] args) {
//		int count = 1;
//		while (count <= 10) {
//			System.out.println(count);
//			count ++;
//		}
		
//		int num = 2;
//		int count = 1;
//		while (count <= 10) {
//			System.out.println(num);
//			num +=2;
//			count++;
//		}
//		for (int num = 2, count = 1; count <= 10; num += 2, count++) {
//			System.out.println(num);
//		}
		
//		int max = 100;
		
//		int sum = 0;
//		int i = 1;
//		while (i <= max) {
//			sum = sum+i;
//			i++;
//		}
//		System.out.println(sum);
//		
//		int sum = 0;
//		for (int i = 1; i <= max; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum);
		
//		for(int i = 1; i <= 9; i++) {
//			for (int k = 1; k <= 9; k++) {
//				System.out.println(i + "*" + k + "=" + i*k);
//			}
//		}
		int rows = 5;
		for(int i = 1; i <= rows; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
