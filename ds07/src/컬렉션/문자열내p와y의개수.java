package 컬렉션;

import java.util.HashMap;

public class 문자열내p와y의개수 {

	public static void main(String[] args) {
		String s = "pPoooyY";
		//p와 y의 개수가 대소문자 상관없이 동일하면 true/false=>소문자로 바꾸자
		String s2 = s.toLowerCase();
		String[] s3 = s2.split("");
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : s3) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map);
		System.out.println(map.get("p")==map.get("y"));
		
	}

}
