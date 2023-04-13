package 배열;

import java.util.*;

public class 배열뒤집기 {

	public static void main(String[] args) {
		int[] num_list = { 1, 2, 3, 4, 5 };
		Solution2 sol = new Solution2();
		int[] answer = sol.solution(num_list);
		String s = Arrays.toString(answer);
		System.out.println(s);

	}

}

class Solution2 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[num_list.length];
		int j = num_list.length - 1;
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[j];
			j--;
		}
		return answer;
	}

}