
public class Example_4 {
	int xa = 0;
	int xb = 0;

	int dillema(int a, int b) {
		// �ڹ� 0 , �߻� 1
		if (a == b && a == 0) { // �Ѵ� �ڹ�

		}

		if (a == b && a == 1) { // �Ѵ� �߻�
			xa = 1;
			xb = 1;

		}

		if (a != b && a == 0) { // a�� �ڹ�
			xa = 0;
			xb = 10;

		}

		else // b�� �ڹ�
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
