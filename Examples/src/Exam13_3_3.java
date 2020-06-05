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
		list19.add("¹®ÀçÀÎ");
		list19.add("È«ÁØÇ¥");
		list19.add("¾ÈÃ¶¼ö");
		list19.add("À¯½Â¹Î");
		list19.add("½É»óÁ¤");
		list19.add("Á¶¿øÁø");
		list19.add("¿À¿µ±¹");
		list19.add("Àå¼º¹Î");
		list19.add("ÀÌÀç¿À");
		list19.add("±è¼±µ¿");
		list19.add("ÀÌ°æÈñ");
		list19.add("À±È«½Ä");
		list19.add("±è¹ÎÂù");
		map.put(19, list19);

		List<String> list18 = new ArrayList<String>();
		list18.add("¹Ú±ÙÇı");
		list18.add("¹®ÀçÀÎ");
		list18.add("¹ÚÁ¾¼±");
		list18.add("±è¼Ò¿¬");
		list18.add("°­Áö¿ø");
		list18.add("±è¼øÀÚ");
		map.put(18, list18);
		Set<Integer> keys = map.keySet();
		for (Integer key : keys) {
			System.out.printf("\n Á¦ %s´ë ´ëÅë·É ÈÄº¸ÀÚ\n", key);
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
