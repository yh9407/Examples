package ex;

public class SaltyRamen extends Ramen {
	public SaltyRamen(String name) {
		super.name = name;
	}

	@Override
	public String getTaste() {
		return "§ ����";
		// �������̵� �ڵ�

	}
}