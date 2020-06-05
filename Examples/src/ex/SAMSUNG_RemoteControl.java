package ex;

public class SAMSUNG_RemoteControl extends RemoteControl {

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		super.channelUp();
		System.out.println(("SAMSUNG => channel UP"));
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		super.channelDown();
		System.out.println(("SAMSUNG => channel Down"));
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		super.volumeUp();
		System.out.println("SAMSUNG => volume Up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		super.volumeDown();
		System.out.println("SAMSUNG => volume Down");
	}

}
