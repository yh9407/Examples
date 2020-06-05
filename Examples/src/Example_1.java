
public class Example_1 {
	int checkGrade(int kg) {

		if (kg > 10) {
			return 1;

		} else if (kg > 7) {
			return 2;
		} else if (kg > 4) {
			return 3;
		} else {
			return 4;
		}
	}

	public static void main(String[] args) {
		Example_1 n = new Example_1();

		int[] kg = new int[] { 5, 11, 8, 4 , 3 , 21 ,23 ,7 , 8};

		for (int a : kg) {
			int x = n.checkGrade(a);
			System.out.print("수박무게 (" + a + ")" + " ---> ");

			System.out.println(x + "등급");

		}

	}
}