package 컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K번째작은수선형 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		while(true){
			int data = sc.nextInt();
			if (data == 0) {
				break;
			} else {
				list.add(data);
			}
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(k + "번째 작은 수 : " + list.get(k-1));

	}

}
