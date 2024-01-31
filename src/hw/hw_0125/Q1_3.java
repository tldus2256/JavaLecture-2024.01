package src.hw.hw_0125;

public class Q1_3 {
    Boolean isPrime(int num){
        if(num <= 2){
            return true;
        }
        for(int i = 2; i<num; i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
