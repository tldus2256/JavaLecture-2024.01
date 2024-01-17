package ch05_reference;

public class Hw_0117 {

	public static void main(String[] args) {
		// 1. 1에서 1000사이에 0은 몇번, 1은 몇번, ...., 9는 몇번 사용되었는가
		//123456789101112....9991000
		String numStr = "";
		for (int i =1; i <= 1000; i++) {
			numStr = numStr + i;
		}
		for (int k = 0; k <= 9; k++) {
			int count = numStr.length()-numStr.replace(Integer.toString(k),"").length();
			System.out.println(count);
		}
	
		
		// 2. 디지털 시계, 00:00 ~ 23:59
		// 하루동안 3이 표시되는 시간은 몇초인가?
		
		int time = 0;
		for(int i=0; i < 24; i++){
			for(int k=0; k<= 59; k++){
				String clock = i + "시" + k;
				if (clock.indexOf("3")>=0)
					time += 60;
			}
		}
		System.out.println(time + "초");
		
		// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때
		// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
		int n1 =0, n2 = 0, n3 = 0;
		for(int i=100; i <1000; i++) {
			for (int k=100; k <1000; k++) {
				int num3 = i * k;
				String str3 = String.valueOf(num3);
				if(ispalindrome(str3)) {
					if (num3 >n1) {
						n1 = num3;
						n2 = i;
						n3 = k;
					}
				}
			}
		}
		System.out.println(n2 + "*" + n3 + "=" + n1);
		// 4. C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
		// 에서 파일명(04.String연습.js)만 출력하세요.

		String path = "C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js";
		for(int i = 50; i < path.length();i++) {
			System.out.print(path.charAt(i));			
		}
	}

	private static boolean ispalindrome(String str) {
		// TODO Auto-generated method stub
		return false;
	}

}
