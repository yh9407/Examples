import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exam13_3_3 {
	public static void main(String[] args) {
		Map<Integer, List<String>> map = new HashMap<>();

		List<String> list19 = new ArrayList<String>();
		list19.add("������");
		list19.add("ȫ��ǥ");
		list19.add("��ö��");
		list19.add("���¹�");
		list19.add("�ɻ���");
		list19.add("������");
		list19.add("������");
		list19.add("�强��");
		list19.add("�����");
		list19.add("�輱��");
		list19.add("�̰���");
		list19.add("��ȫ��");
		list19.add("�����");
		map.put(19, list19);

		List<String> list18 = new ArrayList<String>();
		list18.add("�ڱ���");
		list18.add("������");
		list18.add("������");
		list18.add("��ҿ�");
		list18.add("������");
		list18.add("�����");
		map.put(18, list18);
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.printf("\n �� %s�� ����� �ĺ���\n", key);
			List<String> value = map.get(key);
			// System.out.println(value);
			int count = 0;
			String temp="";

			for (String element : value) {

				count++;

				if (count % 5 == 0) {
					System.out.println(element );
				} else {
					System.out.print(element + " ");
				}
			}
		}
	}
}
