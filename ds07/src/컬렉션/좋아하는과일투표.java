package 컬렉션;

import java.util.HashMap;

public class 좋아하는과일투표 {

	public static void main(String[] args) {
		String[] fruit = {"apple","banana","apple","banana","melon","apple"};
		HashMap<String, Integer> map = new HashMap<>();
		for (String key : fruit) {
			map.put(key, map.getOrDefault(key, 0)+1);
		}
		System.out.println(map);
		int max = 0;
		String maxKey="";
		for (String key : map.keySet()) {
			System.out.println(key +" : "+map.get(key));
			if (map.get(key)>max) {
				max = map.get(key);
				maxKey= key;
			}
		}
		System.out.println(map.keySet());
		System.out.println("가장 좋아하는 과일은 "+maxKey+"이고, 득표수는 " +max+ "입니다.");
		
	}

}
