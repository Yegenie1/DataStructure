package 컬렉션;

import java.util.Scanner;
import java.util.TreeSet;

public class K번째작은수_중복x_정렬0비선형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		TreeSet<Integer> tree = new TreeSet<>();//오름차순
		//TreeSet<Integer> set = new TreeSet<>(Collections.reversOrder());//내림차순
		while(true) {
			int data = sc.nextInt();
			if( data == 0) {
				break;
			}else {
				tree.add(data);
			}
		}
		System.out.println(tree);
		
		Object[] arr = tree.toArray();
		System.out.println("첫 번째 작은 수 : " + arr[0]);
		System.out.println("두 번째 작은 수 : " + arr[1]);
		System.out.println(k + "번째 작은 수 : " + arr[k - 1]);
	}
}
