import java.util.Set;
import java.util.TreeSet;

public class Exam13_2 {
	public static void main(String[] args) {

		int count = 0;
		Set<Integer> set = new TreeSet<Integer>();
		set.add(2);
		set.add(5);
		set.add(11);
		set.add(13);
		set.add(25);
		set.add(28);
		Set<Integer> myNumber = new TreeSet<Integer>();
		while (true) {
			count++;
			myNumber.removeAll(myNumber);
			while (true) {
				myNumber.add((int) (Math.random() * 45 + 1));
				if (myNumber.size() == 6)
					break;
			}
			if (myNumber.containsAll(set) == true)
				break;
			/* 코드작성 */
		}
		System.out.println(set);
		System.out.println(myNumber);
		System.out.println("시도횟수 " + count);
	}
}