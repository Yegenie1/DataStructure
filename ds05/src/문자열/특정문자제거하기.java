package 문자열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 특정문자제거하기 {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "abfdef";
		String letter = "f";
		
		String[] my = my_string.split("");
		
		List<String> s = new ArrayList<String>(Arrays.asList(my));
		
		System.out.println(s.indexOf(letter));
		
		System.out.println(s.get(2));
		
		
		for (int i = 0; i < my.length; i++) {
			if (s.get(i).equals(letter)) {
			}else {
				answer += s.get(i);
			}
		}
		
		//answer = my_string.replace(letter, "");
		
		System.out.println(s);
		
		System.out.println(answer);
	}

}
