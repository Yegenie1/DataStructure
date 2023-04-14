package 문자열;

public class 문자열포함인덱스테스트 {
	
	public static void main(String[] args) {
		String s ="aaabbbcdda";
		System.out.println(s.contains("a"));
		System.out.println(s.contains("aaa"));
		System.out.println(s.contains("bc"));
		
		System.out.println(s.indexOf("a"));
		System.out.println(s.lastIndexOf("a"));
		System.out.println(s.lastIndexOf("a", 3));//0~2
		System.out.println(s.lastIndexOf("a", 11));//0~10
		//없는 것의 인덱스를 찾을 때 -1 리턴
		System.out.println(s.indexOf("f"));//-1
		
		
		
	}

}
