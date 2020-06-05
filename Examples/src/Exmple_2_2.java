
public class Exmple_2_2 {
	int getBetweenSum(int v1, int v2) {
		int sum = 0;
		int sum1 = 0;
		int result = 0;

		if (v1 < v2) {
			for (int i = v1; i <= v2; i++) {
				sum += i;
			}
			result = sum;
		}
		if (v1 > v2) {
			for (int i = v2; i <= v1; i++) {
				sum1 += i;
			}
			result = sum1;
		} else {
			result = v2;
		}
		return result;

	}

	public static void main(String[] args) {
		Exmple_2_2 e = new Exmple_2_2();

		int plus = e.getBetweenSum(3, 5);
		int plus1 = e.getBetweenSum(7, 7);
		int plus2 = e.getBetweenSum(5, 3);
		int plus3 = e.getBetweenSum(1, 10);
		System.out.println("출력결과  = " + plus);
		System.out.println("출력결과  = " + plus1);
		System.out.println("출력결과  = " + plus2);
		System.out.println("출력결과  = " + plus3);

	}

}
