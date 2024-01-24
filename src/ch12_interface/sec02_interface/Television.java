package ch12_interface.sec02_interface;

public class Television implements ch12_interface.sec02_interface.RemoteControllable {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > ch12_interface.sec02_interface.RemoteControllable.MAX_VOLUME)
			this.volume = ch12_interface.sec02_interface.RemoteControllable.MAX_VOLUME;
		else if (volume < ch12_interface.sec02_interface.RemoteControllable.MIN_VOLUME)
			this.volume = ch12_interface.sec02_interface.RemoteControllable.MIN_VOLUME;
		else
			this.volume = volume;
		
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

}
