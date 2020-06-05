import java.util.ArrayList;

public class ListExam_2 {
	public static void main(String[] args) {
		String[] company = { "Naver", "Kakao", "Google", "Amazon", "MS", "Facebook" };
		ArrayList<String> list = new ArrayList<String>();

		while (true) {
			int num = (int) (Math.random() * 4);

			if (!list.contains(company[num])) {//리스트에 company[num]이 담겨있지 않다면. (중복방지)
				list.add(company[num]);   // company의 [num]번째를 list에 추가.
			}
			if (list.size() == 4)
				break;
		}

		/* 코드 작성 */
		System.out.println(list.toString());
	}
}