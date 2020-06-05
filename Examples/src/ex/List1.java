package ex;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class List1 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);
		
		Set<Integer> s = new TreeSet<Integer>(list);
		System.out.println(s);
		
		List<Integer> list2 = new ArrayList<>();
	}

}
