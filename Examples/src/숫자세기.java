import java.util.Scanner;

public class ���ڼ��� {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�����Է� => ");
		int num = s.nextInt();

		System.out.println("ã�� �����Է� => ");
		int findNum = s.nextInt();

		String result = "";
		for (int i = 0; i <= num; i++) {
			result += i;
		}
		int idx = 0;
		int count = 0;

		while (true) { // String.valueOf(findNum)
			idx = result.indexOf("" + findNum, idx);
			if (idx == -1)
				break;
			count++;
			idx++;

		}
		System.out.println(findNum + "�� ���� => " + count);
		s.close();//���̻� s�� ���� �Է¹��� �ʰٴ�.
	}
}