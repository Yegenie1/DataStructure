package 문자열;

import java.util.*;

public class Stringlist {

	public static void main(String[] args) {
		String s = "pongpong";
		String s2 = "pongpong";
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		String[] s4 = s.split("");
		List<String> list = Arrays.asList(s4);
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
