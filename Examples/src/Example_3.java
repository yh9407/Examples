
public class Example_3 {
	int getLastYear(int year) {
		if (year == 4 || year == 6 || year == 9 || year == 11) {
			return 30;
		}
		if (year == 2) {
			return 28;
		} else {
			return 31;
		}
	}

	public static void main(String[] args) {
		Example_3 e = new Example_3();
		int[] year = new int[] { 1, 2, 9, 11 };
		for (int a : year) {
			int x = e.getLastYear(a);
			System.out.print( a + " ���� ��¥���� " + " ------>> ");
			System.out.println(x + "��");
		}

	}
}

//	int [] year = new int[] { 1,2,9,11};	
//	for(int i = 1; i <= year.length  ; i++ ) {
//		int f = i;
//		int x = e.getLastYear(i);