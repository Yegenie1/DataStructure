package 컬렉션;

import java.util.*;

public class 배열과컬렉션변환2 {

	public static void main(String[] args) {
		String[] 냉장고음식 = {"감자","고구마","우유","감자","양파"};
		List<String> list = Arrays.asList(냉장고음식);
		System.out.println("감자 마지막인덱스 : "+list.lastIndexOf("감자"));
		System.out.println(list);
		if(list.contains("양파")) {
			System.out.println("양파는 안사도 된다.");
		}else {
			System.out.println("양파사서 냉장고에 넣어야 한다.");
		}
		list.set(2, "춘식이우유");
		System.out.println(list);
		list.set(list.indexOf("양파"), "양파즙");
		System.out.println(list);
		stringPrint(냉장고음식);
//		String[] s = (String[])list.toArray();
//		stringPrint(s);

	}

	public static void intPrint(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void stringPrint(String[] array) {
		System.out.println(Arrays.toString(array));
	}

}
