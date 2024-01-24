//package src.ch12_interface.sec02_interface;
//
//public class Audio implements ch12_interface.sec02_interface.RemoteControllable {
//	private int volume;
//
//	@Override
//	public void turnOn() {
//		System.out.println("Audio를 켭니다.");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("Audio를 끕니다.");
//	}
//
//	@Override
//	public void setVolume(int volume) {
//			this.volume = ch12_interface.sec02_interface.RemoteControllable.MAX_VOLUME;
//		else if (volume < ch12_interface.sec02_interface.RemoteControllable.MIN_VOLUME)
//			this.volume = ch12_interface.sec02_interface.RemoteControllable.MIN_VOLUME;
//		else
//			this.volume = volume;
//
//		System.out.println("현재 Audio 볼륨: " + this.volume);
//	}
//
//}
