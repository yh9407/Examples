package ex;

public class SpicyRamen extends Ramen {
	public SpicyRamen(String name) {
		super.name = name;

	}

	@Override
	public String getTaste() { // source -> override
		return "�ſ� ����";
	}
}
