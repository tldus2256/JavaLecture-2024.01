package src.ch10_oop.sec04_polymorphism;

public class Main {
    public static void main(String[] args) {
            Cat cat = new Cat();
            cat.sound();
            cat.jump();
            Dog dog = new Dog();
            dog.sound();
            dog.walk();
        }
        //다형성, 자식은 부모 타입으로 자동 타입 변환이 이루어짐

    }

