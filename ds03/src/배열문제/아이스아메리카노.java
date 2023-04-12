package 배열문제;

import java.util.*;


public class 아이스아메리카노 {

	public static void main(String[] args) {
		int money = 15000;
		Solution3 sol = new Solution3();
		int[] answer = sol.solution(money);
		String s = Arrays.toString(answer);
		System.out.println(s);

	}

}

class Solution3 {
	public int[] solution(int money) {
        int[] answer = {0,0};
        answer[0] = money/5500;
        answer[1] = money%5500;
        return answer;
    }

}
