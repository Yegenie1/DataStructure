package 컬렉션2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class 각수에해당하는빈도수 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 3, 3, 4};
		
		List<Integer> intList = new ArrayList<Integer>();
		for (int x : array) {
			intList.add(x);
		}
		Collections.sort(intList);
		HashSet<Integer> set = new HashSet<Integer>(intList);
		System.out.println(set);
		Iterator<Integer> it = set.iterator();
		if (it.hasNext()) {
			for (int i = 0; i < set.size(); i++) {
			System.out.println(Collections.frequency(intList, it.next()));
			}
		}
		
		
	}

}
