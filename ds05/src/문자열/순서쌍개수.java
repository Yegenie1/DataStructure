package 문자열;

public class 순서쌍개수 {

	public static void main(String[] args) {
		int answer = 0;
		int n = 20;
		for (int i = 1; i <= n; i++) {
				if (n%i==0) {
					answer++;
			}
		}
		System.out.println(answer);
	}

}
