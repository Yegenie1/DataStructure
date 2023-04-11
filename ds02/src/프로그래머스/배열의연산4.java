package 프로그래머스;

import java.util.Arrays;

public class 배열의연산4 {
	//두 수를 곱했을 때 가장 큰 숫자를 구해보세요.	
		public static void main(String[] args) {
			Solution7 sol = new Solution7();
			int[] numbers = {4, 3, 2, 7, 5, 10, 8, 9};
			int answer = sol.solution(numbers); 
			System.out.println(answer);
		}
	}

	class Solution7 {
		public int solution(int[] numbers) {
			Arrays.sort(numbers);
			int post = numbers[numbers.length - 2] * numbers[numbers.length - 1];
			int pre = numbers[0] * numbers[1];
			int answer = 0;
			if (post > pre) {
				answer = post;
			} else {
				answer = pre;
			}
			return answer;
		}
}
