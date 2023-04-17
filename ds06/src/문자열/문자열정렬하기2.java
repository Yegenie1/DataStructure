package 문자열;

import java.util.Arrays;

public class 문자열정렬하기2 {

	public static void main(String[] args) {
		String my_string= "Bcad";
		
		char[] c = my_string.toLowerCase().toCharArray();
		Arrays.sort(c);
		String answer = new String(c);
		System.out.println(answer);
		
		
	}

}
