package src.ch04_control;

public class Ex14_PerfectNumber {

	public static void main(String[] args) {
		// 1~10000 사이의 완전수
		        for (int i = 2; i <= 10000; i++) {
//		            int divSum = 0;
//		            for (int k = 1; k < i; k++) {
//		                if (i % k == 0) {
//		                    divSum += k;
//		                }
//		            }
		        	int divSum = divisorSum(i);
		            if (i == divSum) {
		                System.out.println(i);
		            }
		        }
		    }
		private static int divisorSum(int num) {
			int divSum = 0;
			for (int i = 1; i < num; i++)
				if(num % i ==0)
					divSum += i;
			return divSum;
	}
//		for (let i = 2; i <= 10000; i++){
//		    let divSum = 0;
//		    for ( let k = 1; k < i; k++){           
//		        if (i % k == 0)                     
//		            divSum += k;
//		    }
//		    if (i == divSum)                        
//		        console.log(i);

}
