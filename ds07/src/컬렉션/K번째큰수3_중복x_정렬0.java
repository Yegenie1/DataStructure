package 컬렉션;

import java.util.Scanner;
import java.util.TreeSet;

public class K번째큰수3_중복x_정렬0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int k = sc.nextInt();
		
		TreeSet<Integer> set = new TreeSet<>();//오름차순
		//TreeSet<Integer> set = new TreeSet<>(Collections.reversOrder());//내림차순
		for (int i = 0; i < size; i++) {
			set.add(sc.nextInt());
		}
		
		System.out.println(set);
		Object[] result = set.toArray();
		System.out.println(result[result.length-k]);
	}
}
