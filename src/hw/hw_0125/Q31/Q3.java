package src.hw.hw_0125.Q31;

//3) 어떤 수가 소수(prime number: 1과 자기자신만을 약수로 갖는 수, 예: 2, 3, 5 …)인가를
//판단하는 메소드
//Boolean isPrime(int num);
//를 만드세요.[20]

public class Q3 {
    Boolean isPrime(int num) {
        if (num <= 2) {
            return true;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
