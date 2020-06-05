import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sticks {
	static List<Integer> cutOperation(List<Integer> rodList) {
		int min = 1000;
		for (int rod : rodList) {
			min = (min >= rod) ? rod : min;

		}
		int count = 0;
		for (int rod : rodList) {
			rodList.set(count++, rod - min);
		}
		List<Integer> newRodList = new ArrayList<Integer>();
		for (int rod : rodList) {
			if (rod > 0)
				newRodList.add(rod);
		}
		return newRodList;

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int max = s.nextInt();
		s.nextLine(); // 엔터 처리
		String line = s.nextLine();
		s.close();

		Scanner rod = new Scanner(line).useDelimiter(" ");
		List<Integer> rodList = new ArrayList<Integer>();
		while (rod.hasNext()) {
			rodList.add(rod.nextInt());
		}
		rod.close();
		System.out.println(max);

		while (rodList.size() > 1) {
			rodList = cutOperation(rodList);
			System.out.println(rodList.size());

		}
	}

}
