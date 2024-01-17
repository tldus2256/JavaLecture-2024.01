package ch05_reference;

public class Hw_0117 {

	public static void main(String[] args) {
		// 1. 1에서 1000사이에 0은 몇번, 1은 몇번, ...., 9는 몇번 사용되었는가
		//123456789101112....9991000
		
//		let numStr = '';
//		for (let i = 1; i <= 1000; i++){
//		    numStr += i;
//		}
		
		// 2. 디지털 시계, 00:00 ~ 23:59
		// 하루동안 3이 표시되는 시간은 몇초인가?
		
		int answer = 0;
		int answer2 = 0;
		for(int i=0; i < 24; i++){
		    if(answer.toString().indexOf('3')>=0){
		       answer += 3600;
		       continue;
		    }
		    for(int k=0; k<= 59; k++){
		        if(answer2.toString().indexOf('3')>=0){
		            answer2 += 60;
		        }
		        System.out.println();
		    }
		}
		// 3. 두개의 세자리수를 곱해서 나온 결과가 palindrome일때
		// 가장 큰 palindrome 수와 어떤 수를 곱해서 나온 결과인가?
		
		// 4. C:/Workspace/WebProject/03.JavaScript/ch07.표준내장객체/04.String연습.js
		// 에서 파일명(04.String연습.js)만 출력하세요.

	}

}
