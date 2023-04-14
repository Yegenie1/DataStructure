package 문자열;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class String에서Char배열에옮기기3 {
	
	public static void print(String[] s) {
		System.out.println(Arrays.toString(s));
	}

	public static void main(String[] args) {
		String sno = "2056521";

		// 1. 마지막 위치의 숫자가 1이면 서대문구에서 출생, 1이 아니면 다른구에서 출생 프린트

		if (sno.charAt(sno.length() - 1) == '1') {
			System.out.println("서대문구에서 출생");
		} else {
			System.out.println("다른구에서 출생");
		}

		// 2. "52"를 추출해서 두 숫자를 더해보기
		// 더해서 10이 넘지않아야 유효한 주민번호 유효한 주민번호인지 아닌지 출력

		char[] c = new char[2];
		sno.getChars(4, 6, c, 0);
		System.out.println(c);
		int i1 = Character.getNumericValue(c[0]);
		int i2 = Character.getNumericValue(c[1]);
		int sum = i1 + i2;
		System.out.println(sum);
		if (sum < 10) {
			System.out.println("유효한 주민번호");
		} else {
			System.out.println("유효하지 않은 주민번호");
		}
		
		// 3. 주민번호에 포함된 5의 갯수를 출력
		int count = 0;
		for (int i = 0; i < sno.length(); i++) {
			if (sno.charAt(i) == '5') {
				count++;
			}
		}
		System.out.println(count);

		//3번 다른방법 string 배열로 분리=split()
		String[] stringArray = sno.split("");
		int count2 = 0;
		for (String x : stringArray) {
			if (x.equals("5")) {
				count2++;
			}
		}
		System.out.println(count2);
		
		//인덱스를 빨리 찾는 방법(함수)
		System.out.println(Arrays.binarySearch(stringArray, "5"));
		
		//배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
		Arrays.fill(stringArray, 0, 3, "hoho");
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);
		
		//배열의 순서를 다 뒤집는 방법(함수)
		Arrays.sort(stringArray);
		//System.out.println(Arrays.toString(stringArray));
		print(stringArray);
		
		//Arrays로 내림차순을 할 수는 있으나 너무 복잡
		//==>컬렉션으로 변환해서 하면 간단
		List<String> list = Arrays.asList(stringArray);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);

		
		//배열안에 데이터의 빈도수(횟수)구하는 방법(함수)
		int count3 = Collections.frequency(list, "hoho");
		System.out.println(count3);
		
	}

}
