//package ch12_interface.sec02_interface;
//
//import src.ch12_interface.sec02_interface.Audio;
//
//public class Main {
//
//	public static void main(String[] args) {
//		Audio audio = new Audio();
//		audio.turnOn();
//		audio.setVolume(12);
//		audio.turnOff();
//
//		ch12_interface.sec02_interface.Television tv = new ch12_interface.sec02_interface.Television();
//		tv.turnOn();
//		tv.setVolume(5);
//		tv.turnOff();
//
//		// 다형성 방법으로 타입을 부여할 수 있음
//		// 구현 객체가 무엇이든지 간에 동일한 코드를 사용할 수 있음
//		ch12_interface.sec02_interface.RemoteControllable rc = new Audio();
//		rc.turnOn(); rc.setVolume(7); rc.turnOff();
//
//		rc = new ch12_interface.sec02_interface.Television();
//		rc.turnOn(); rc.setVolume(7); rc.turnOff();
//	}

//}
