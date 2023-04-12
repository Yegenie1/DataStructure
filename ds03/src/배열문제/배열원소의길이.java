package 배열문제;

import java.util.*;


public class 배열원소의길이 {

	public static void main(String[] args) {
		String[] strlist = {"I", "Love", "Programmers."};
		Solution4 sol = new Solution4();
		int[] answer = sol.solution(strlist);
		String s = Arrays.toString(answer);
		System.out.println(s);

	}

}

class Solution4 {
	public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < answer.length; i++) {
			answer[i] = strlist[i].length();
		}
        return answer;
    }

}
