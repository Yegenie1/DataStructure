package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열내림차순배치 {
	
	public static void main(String[] args) {
		String s = "Zbcdefg";
		String answer = "";
		
		String[] sa = s.split("");
		Arrays.sort(sa);
		
		for (int i = sa.length-1; i > 0; i--) {
			answer += s.charAt(i);
		}
		System.out.println(answer);
		
		List<String> list =Arrays.asList(sa);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		for (String x : list) {
			answer +=x;
		}
		System.out.println(answer);
		
		
	}

}
