
public class Example_4 {
	int xa = 0;
	int xb = 0;

	int dillema(int a, int b) {
		// 자백 0 , 발뺌 1
		if (a == b && a == 0) { // 둘다 자백

		}

		if (a == b && a == 1) { // 둘다 발뺌
			xa = 1;
			xb = 1;

		}

		if (a != b && a == 0) { // a만 자백
			xa = 0;
			xb = 10;

		}

		else // b만 자백
			xa = 10;
		    xb = 0;
		    return 0 ;
	}
	public static void main(String[] args) {
		Example_4 e = new Example_4();
		int gil = e.dillema(0, 0);
		System.out.println(gil);
	}
}
