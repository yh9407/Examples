import java.util.ArrayList;

public class ListExam_2 {
	public static void main(String[] args) {
		String[] company = { "Naver", "Kakao", "Google", "Amazon", "MS", "Facebook" };
		ArrayList<String> list = new ArrayList<String>();

		while (true) {
			int num = (int) (Math.random() * 4);

			if (!list.contains(company[num])) {//����Ʈ�� company[num]�� ������� �ʴٸ�. (�ߺ�����)
				list.add(company[num]);   // company�� [num]��°�� list�� �߰�.
			}
			if (list.size() == 4)
				break;
		}

		/* �ڵ� �ۼ� */
		System.out.println(list.toString());
	}
}