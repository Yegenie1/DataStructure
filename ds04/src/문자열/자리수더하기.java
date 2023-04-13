package 문자열;


public class 자리수더하기 {

	public static void main(String[] args) {
		int n = 1234;
		Solution8 sol = new Solution8();
		int answer = sol.solution(n);
		System.out.println(answer);
	}
}

class Solution8{
	public int solution(int n) {
        int answer = 0;
        String n2 = String.valueOf(n);
        String[] n3 = n2.split("");
        //char[] n4 = n2.toCharArray();
       
        for (String x : n3) {
			int num = Integer.parseInt(x);
			answer += num;
		}
        return answer;
    }

	
}
