
public class Number8 {
	public static int findEight(int n) { //메소드 findEight 생성, (int n)
		int count = 0;//초기화
		
		String s = Integer.toString(n); //n을 문자열 s에 저장.
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '8') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int total = 0;
		int tmp = 0;
		for (int i = 1; i <= 10000; i++) {
			tmp = findEight(i);
			if (tmp > 0) {
				total += tmp;
			}
		}
		System.out.println("Total: " + total);
	}
}
