package ex;

public class LG_RemoteControl extends RemoteControl {

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		super.channelUp();
		System.out.println(("LG => channel UP"));
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		super.channelDown();
		System.out.println(("LG => channel Down"));
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		super.volumeUp();
		System.out.println("LG => volume Up");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		super.volumeDown();
		System.out.println("LG => volume Down");
	}

}
