package 프로그래머스기본;

public class 옷가게 {

	public static void main(String[] args) {
		int price = 150000;
		Solution7 sol = new Solution7();
		int answer = sol.solution(price);
		System.out.println(answer);

	}

}

class Solution7 {
	public int solution(int price) {
		int answer = 0;
		if (price >= 500000) {
			answer = (int) (price * (1 - 0.2));
		} else if (price >= 300000) {
			answer = (int) (price * (1 - 0.1));
		} else if (price >= 100000) {
			answer = (int) (price * (1 - 0.05));
		} else {
			answer = price;
		}
		return answer;
	}

}