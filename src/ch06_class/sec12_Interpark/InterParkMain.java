package src.ch06_class.sec12_Interpark;

public class InterParkMain {
    public static void main(String[] args) {
        InterparkBook[] interparkBooks = {
              new InterparkBook(1, "처음부터 시작하는주식투자 단타전략", "홍인기",null,"길벗",18900),
              new InterparkBook(2, "마흔에 읽는 쇼펜하우어", "강용수",null,"유노북스",15300) ,
              new InterparkBook(3, "세이노의가르침", "세이노",null,"데이원",6480) ,
              new InterparkBook(4, "남에게보여주려고인생을낭비하지마", "쇼펜하우어","박제헌","페이지투",18900),
              new InterparkBook(5, "어른의국어력", "김범준",null,"포레스트북스",15120)
        };
        for(InterparkBook ib: interparkBooks)
            System.out.println(ib);
    }
}
