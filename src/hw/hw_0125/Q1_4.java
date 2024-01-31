package src.hw.hw_0125;

public class Q1_4{
    public static void main(String[] args) {
        Q1_3 q13 = new Q1_3();
        int res = 0;
        for(int i=2; i<101; i++){
            if (q13.isPrime(i)){
                res += i;
            }
        }
        System.out.println("2 ~ 100까지의 소수 합은 " + res + "입니다.");
    }
}
