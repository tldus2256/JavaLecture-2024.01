package src.hw.hw_0125.Q31;

//2) 1에서 20까지 홀수 제곱의 합을 구하세요.
public class Q2 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i <= 20; i++) {
            if(i%2 == 1) {
                answer += i*i;
            }
        }
        System.out.println(answer);
    }
}
