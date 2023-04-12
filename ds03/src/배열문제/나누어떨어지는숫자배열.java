package 배열문제;

import java.util.*;


public class 나누어떨어지는숫자배열 {

	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		Solution5 sol = new Solution5();
		int[] answer = sol.solution(arr, divisor);
		System.out.println(Arrays.toString(answer));
	}
}

class Solution5 {
	public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				list.add(arr[i]);
			}
		}
        int[] answer = null;
        if (list.size() != 0) {
			answer = new int[list.size()];
			for (int i = 0; i < list.size(); i++) {
				answer[i] = list.get(i);
			} 
		}else {
			answer = new int[1];
			answer[0]=-1;
		}
		Arrays.sort(answer);
        return answer;
    }

}
