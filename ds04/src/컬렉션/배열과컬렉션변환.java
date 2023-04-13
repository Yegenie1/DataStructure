package 컬렉션;

import java.util.*;

public class 배열과컬렉션변환 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		intPrint(s);
		Arrays.sort(s);
		intPrint(s);

		String[] s2 = { "aaa", "bbb", "ccc" };
		stringPrint(s2);

		// 1.배열에 aaa가 있는지 궁금
		// -->list로 변형하면, 조금 더 다양한 처리들을 for문 사용하지 않고 할 수 있음.
		// asList()이용해서 list로 변환
		List<String> list = Arrays.asList(s2);
		System.out.println(list);
		System.out.println(list.contains("aaa"));
		// 1. bbb삭제
		// list.remove("bbb");
		// 2. ccc가 들어있는 위치를 찾아보세요.
		System.out.println(list.indexOf("ccc"));
		// 3. aaa가 들어있는 마지막 위치를 찾아보세요.
		System.out.println(list.lastIndexOf("aaa"));
		// 4. 전체 내용 프린트
		stringPrint(s2);
		// 5. 맨 앞에 ddd삽입
		// list.add(0, "ddd");
		// 6. 맨 뒤에 fff삽입
		// list.add(s2.length-1, "fff");
		// 7. 인덱스2번의 내용을 ggg로 변경
		list.set(2, "ggg");
		// 8. 전체 내용 프린트
		stringPrint(s2);

		// 제약이 없는 ArrayList를 다시 만들어주면 된다
		List<String> list2 = new ArrayList<String>(Arrays.asList(s2));
		// 1. bbb삭제
		list2.remove("bbb");
		// 2. ccc가 들어있는 위치를 찾아보세요.
		System.out.println(list2.indexOf("ccc"));
		// 3. aaa가 들어있는 마지막 위치를 찾아보세요.
		System.out.println(list2.lastIndexOf("aaa"));
		// 4. 전체 내용 프린트
		System.out.println(list2);
		// 5. 맨 앞에 ddd삽입
		list2.add(0, "ddd");
		// 6. 맨 뒤에 fff삽입
		list2.add(s2.length-1, "fff");
		// 7. 인덱스2번의 내용을 ggg로 변경
		list2.set(2, "ggg");
		// 8. 전체 내용 프린트
		System.out.println(list2);
		
		//배열에 한계가 있어서 List로 변환하여 다양한 처리를 함
		//코딩테스트에서는 반환을 거의 배열로 하게 되어있음
		

	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}

}
