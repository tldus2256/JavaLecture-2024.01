package src.ch09_modifier.sec03_static;

public class SampleMain {
    public static void main(String[] args) {
        // 인스턴스 필드, 메소드를 사용하는 방법
        Sample sample = new Sample();
        System.out.println(sample.instanceField);
        sample.instanceMethod();

        // 스태틱 필드, 메소드를 사용하는 방법
        System.out.println(Sample.STATIC_FIELD);
        Sample.staticMethod();
    }
}
