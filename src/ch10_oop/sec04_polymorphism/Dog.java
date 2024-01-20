package src.ch10_oop.sec04_polymorphism;

public class Dog extends Animal{
    // @Override 생략가능
    void sound() {
        System.out.println("멍멍!!");
    }

    void walk() { }
}
