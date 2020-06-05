package ex;

public class Main2 {
	public static void main(String[] args) {
		RemoteControl rc1 = new LG_RemoteControl();
		rc1.channelUp();
		rc1.channelDown();
		rc1.volumeUp();
		rc1.volumeDown();
		RemoteControl rc2 = new SAMSUNG_RemoteControl();
		rc2.channelUp();
		rc2.channelDown();
		rc2.volumeUp();
		rc2.volumeDown();
	}

}
