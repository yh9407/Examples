import java.util.Scanner;

public class 숫자세기 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자입력 => ");
		int num = s.nextInt();

		System.out.println("찾을 숫자입력 => ");
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
		System.out.println(findNum + "의 개수 => " + count);
		s.close();//더이상 s에 대해 입력받지 않겟다.
	}
}