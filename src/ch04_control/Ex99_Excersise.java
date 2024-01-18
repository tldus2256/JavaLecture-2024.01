package src.ch04_control;

public class Ex99_Excersise {

	public static void main(String[] args) {
		int score = 72;
		
		if (score >= 80) {
			System.out.println("B학점");
		}
		else if(score >= 90) {
			System.out.println("A학점");
		}
		else if(score >= 70) {
			System.out.println("C학점");
		}
		else {
			System.out.println("F학점");
		}
	
	//switch문?
		int score2 = 72;

		switch (score2 / 10) {
			case 10:
			case 9:
		        System.out.println("A학점");
		        break;
		    case 8:
		        System.out.println("B학점");
		        break;
		    case 7:
		        System.out.println("C학점");
		        break;
		    default:
		        System.out.println("F학점");
		        
		}
		
		// if문과 break,continue -> for문
		for(int i=0;  ;i++) {
			if ( i % 2 == 1) {
				continue;
			} else {
				System.out.print( i + ", ");
			} if ( i == 10) {
				System.out.println();
				break;
			}
			
		}
		
		for (int i=0;;i++) {
			if (i>10)
				break;
			if (i % 2 == 1)
				continue;
			System.out.println(i);
		}
		
	
//		// while 문으로
//		for(int i = 10; i > 0; i-=2) {
//			System.out.println(i);
//		}
		
		int i = 10;
		
		while (i > 0) {
		    System.out.println(i);
		    i -= 2;
		}
		
//		
//		for(int i=0; i < 5; i++) {
			int count= 0;
//			for(int k = 0; k < 3; k++) {
//				if (i == 2) {
//					continue;
//				}
//				if (k == 1) {
//					break;
//				}
//				System.out.println("A")
				count ++;
//			}
				System.out.println(count);
//		}
	}
	
	
	

}
