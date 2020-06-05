import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class Exam13_3_2 {

	public static void main(String[] args) {
		String text = getData(); // 다음 페이지 코드
		String[] words = text.split(" ");
		System.out.println(text);
		// System.out.println(getData());
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < words.length; i++) {
			boolean isCon = map.containsKey(words[i]);// i번째 워드를 가지고 있는지
			if (isCon == true) {//가지고 있다면,put 하면서, 카운트 1 추가
				int count = map.get(words[i]);
				count +=1;
				map.put(words[i],count);
			} else { //중복이 아니라면, count없이 그냥 put,횟수인 1출력
				map.put(words[i], 1); // i번째 단어, 횟수
			}
		}
		System.out.println(map);
		// 튀어나온 문자열을 key, 횟수를 map

	}

	public static String getData() {
		StringBuffer result = new StringBuffer();
		try {
			URL url = new URL("https://ggoreb.com/text/python.txt");
			URLConnection con = url.openConnection();
			InputStream is = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(is, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String separator = "";
			while (true) {
				String data = reader.readLine();
				if (data == null) {
					break;
				}
				result.append(separator + data);
				separator = "\n";
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();

	}
}