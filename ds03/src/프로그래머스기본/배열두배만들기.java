package 프로그래머스기본;

public class 배열두배만들기 {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		Solution6 sol = new Solution6();
		int[] answer = sol.solution(numbers);
		for (int i = 0; i < answer.length; i++) {
			
			System.out.println(answer[i]);
		}

	}

}

class Solution6 {
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		
		return answer;
	}

}