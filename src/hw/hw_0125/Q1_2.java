package src.hw.hw_0125;

public class Q1_2 {
    public static void main(String[] args) {
        int answer = 0;
        for (int i = 1; i<21; i++){
            if(i%2==1){
                answer += i*i;
            }
        }
        System.out.println("1 ~ 20까지의 홀수 제곱의 합은 " + answer + "입니다.");
    }
}
