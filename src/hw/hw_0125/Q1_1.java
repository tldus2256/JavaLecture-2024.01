package src.hw.hw_0125;

public class Q1_1 {
    public static void main(String[] args) {
        int answer = 0;
        for(int i=1; i<101;i++){
            if(i%3==0){
                answer += i;
            }
        }
        System.out.println("1 ~ 100까지의 3의배수의 합은 " + answer + "입니다.");
    }
}
