package 프로그래머스기본;

public class 양꼬치 {

	public static void main(String[] args) {
		int n = 10;//양꼬치 주문수
		int k = 3;//음료수 주문수
		Solution2 sol = new Solution2();
		int answer = sol.solution(n,k);
		System.out.println(answer);

	}

}

class Solution2 {
	public int solution(int n, int k) {
		int answer = 0;
		answer = n * 12000 + ((k - (n / 10)) * 2000);
		return answer;
	}

}