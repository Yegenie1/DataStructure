package 컬렉션;

import java.util.HashMap;

public class 완주하지못한선수 {

	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		String answer = "";
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String player : participant) {
			map.put(player,map.getOrDefault(player, 0)+1);
		}
		for (String key : completion) {
			map.put(key, map.get(key)-1);
		}
		
		for (String key : map.keySet()) {
			System.out.println(key+ ":"+map.get(key));
			if (map.get(key)!=0) {
				answer = key;
			}
		}
		
        System.out.println(answer);
		
		
	}

}
