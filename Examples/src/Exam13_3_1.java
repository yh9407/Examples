import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Exam13_3_1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "apple");
		map.put("b", "banana");
		map.put("c", "cherry");
		map.put("g", "grape");
		map.put("l", "lemon");
		map.put("m", "mango");
		map.put("o", "orange");
		map.put("t", "tomato");
		map.put("w", "watermelon");
		
		Set<String> keys = map.keySet();//Set에 String을 담는다.
		for(String key : keys) {
			String value = map.get(key);
			System.out.printf("%s : %s\n",key,value);
		}
		
		
		
	Set<String> keySet =map.keySet();
	for(String key : keySet) {
		String value = map.get(key);
		System.out.print(key + " : " +  value + "\n");
		
	}
	System.out.println("두번째");
	
	
	Iterator<String> iter = keySet.iterator();
	while(iter.hasNext()) {
		String key = iter.next();
		String value = map.get(key);
		System.out.println(key + " : " + value + "\n");
	}
	
	
	
	
	}
}
