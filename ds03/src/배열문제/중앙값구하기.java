package 배열문제;

import java.util.*;

public class 중앙값구하기 {

	public static void main(String[] args) {
		int[] s = { 5, 2, 1, 9, 11, 15, 17 };
		// 배열에 들어산 하나의 값 : element
		// 홀수개
		String s2 = Arrays.toString(s);
		System.out.println(s2);
		// 가운데 인덱스 배열의 길이 length/2

		// 1. 정렬
		Arrays.sort(s);// 파괴형함수
		// 2.가운데위치 구하기
		int center = s.length / 2;
		// 3. 배열의 중앙위치값을 get
		int answer = s[center];

		System.out.println(answer);

	}

}
