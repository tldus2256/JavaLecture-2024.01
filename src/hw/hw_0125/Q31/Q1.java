package src.hw.hw_0125.Q31;


//1) 1에서 100까지 3의 배수의 합을 구하세요.
public class Q1 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}


