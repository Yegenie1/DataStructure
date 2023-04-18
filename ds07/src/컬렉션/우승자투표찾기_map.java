package 컬렉션;

import java.util.HashMap;

public class 우승자투표찾기_map {

	public static void main(String[] args) {
		String[] all = {"홍길동", "김길동", "정길동", "홍길동", "김길동", "홍길동"};
		//String[] find = {"홍길동", "김길동", "정길동"};
		//다찾는 경우에 find를 만들 필요가 없다
		HashMap<String, Integer> map = new HashMap<>();
		//        key,   value
		for (String x : all) {
			map.put(x, map.getOrDefault(x, 0)+1);//명단
			//map.put(key)가 이미 저장되어 있는 경우 값을 꺼내서 사용
			//map.put(key)가 없으면 디폴트값 0을 쓰겠다
		}//map에 가져올 값이 있으면 가져오고 아니면 디폴트값 지정
		/*System.out.println(map);
		for (String x : all) {
			map.put(x, map.get(x)+1);
		}*/
		System.out.println(map);
		int max = 0;
		for (String key : map.keySet()) {
			System.out.println(key+": " + map.get(key));
			if (map.get(key) > max) {
				max = map.get(key);
				System.out.println("현재까지 우승자 : "+key);
			}
		}
		
		
	}

}
