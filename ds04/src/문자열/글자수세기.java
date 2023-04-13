package 문자열;


public class 글자수세기 {

	public static void main(String[] args) {
		String message = "happy birthday!";

		Solution7 sol = new Solution7();
		int answer = sol.solution(message);
		System.out.println(answer);
	}
}

class Solution7 {
	public int solution(String message) {
        int answer = 0;
        int len = message.trim().length();
        answer = len*2;
        return answer;
    }

}
