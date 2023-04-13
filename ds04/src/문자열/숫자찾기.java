package 문자열;

import java.util.Arrays;
import java.util.List;

public class 숫자찾기 {

	public static void main(String[] args) {
		int num = 29183;
		int k = 1;
		Solution6 sol = new Solution6();
		int answer = sol.solution(num, k);
		System.out.println(answer);
	}
}

class Solution6 {
	public int solution(int num, int k) {
		int answer = 0;
		String number = String.valueOf(num);
		String k2 = String.valueOf(k);
		if (number.contains(k2)) {
			answer=number.indexOf(k2) + 1;
		}else {
			answer = -1;
		}
		return answer;
	}

	
}
