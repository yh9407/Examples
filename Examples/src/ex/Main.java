package ex;

public class Main {
	public static void main(String[] args) {
		Ramen ramen1 = new SpicyRamen("불 라면");
		String taste1 = ramen1.getTaste(); //리턴값이 Main의 "라면맛"으로 되어있으므로 초기에는 라면맛으로만 나옴
		System.out.println(taste1);
		Ramen ramen2 = new SaltyRamen("소금 라면");
		String taste2 = ramen2.getTaste();
		System.out.println(taste2);
	}

}
