package src.hw.hw_0125.Q31;
//3)에서 만든 메소드를 이용하여 2에서부터 100까지 소수의 합을 구하세요.[10]
public class Q4 {
    public static void main(String[] args) {
        Q3 primenumber = new Q3();
        int nb = 0;
        for (int i=2; i <= 100; i++) {
            if (primenumber.isPrime(i)) {
                nb += i;
            }
        }
        System.out.println(nb);
    }
}
