
public class Example_1_1 {
	int checkGrade(int weight) {
		int result = 0;
		if (weight > 10) {
			result = 1;

		} else if (weight > 7) {
			result = 2;

		} else if (weight > 4) {
			result = 3;

		} else {
			result = 4;
		}
		return result;
	}

	public static void main(String[] args) {
		Example_1_1 n = new Example_1_1();
		int[] weight = new int[] { 1, 4, 6, 7, 9, 13, 15 };
		for (int i : weight) {
			int x =  n.checkGrade(i);
			System.out.print(i + "   ");
			System.out.println(x);
		}

	}
}
