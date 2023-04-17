package 문자열;

import java.util.Arrays;

public class A를B로만들기 {

	public static void main(String[] args) {
		String before = "olleh";
		String after = "hello";
		int answer = 0;
		
		char[] b = before.toCharArray();
		char[] a = after.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		if (Arrays.equals(a, b)) {
			answer = 1;
		}
		System.out.println(answer);
		
		
	}

}
