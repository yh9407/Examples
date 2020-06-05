package ex;

public class SaltyRamen extends Ramen {
	public SaltyRamen(String name) {
		super.name = name;
	}

	@Override
	public String getTaste() {
		return "짠 라면맛";
		// 오버라이드 코드

	}
}