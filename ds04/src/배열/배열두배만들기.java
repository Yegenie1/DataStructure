package 배열;

import java.util.*;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		Solution1 sol = new Solution1();
		int[] answer = sol.solution(numbers);
		String s = Arrays.toString(answer);
		System.out.println(s);

	}

}

class Solution1 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		return answer;
	}

}