package 문자열;


public class 정리문제3 {
	public static void main(String[] args) {
		String s1 ="참좋다";
		String s2 ="진짜좋다";
		if (s1.equals(s2)) {
			System.out.println("두문자열은 동일합니다.");
		}else {
			System.out.println("두문자열은 동일하지않습니다.");
		}
		if (s1.length()>s2.length()) {
			System.out.println("s1의 글자수가 더 많습니다.");
		} else {
			System.out.println("s2의 글자수가 더 많습니다.");

		}
		
		String s3="나는 진짜 java programmer가 되었어";
		
		String e=s3.substring(6,21);
		System.out.println(e.toUpperCase());
		
		String s4="2056521";
		System.out.println(s4.charAt(0));

		if (s4.charAt(0)=='1') {
			System.out.println("남자");
		}else if (s4.charAt(0)=='2') {
			System.out.println("여자");
		}
		
		
		
		
		
		
	}
	
	

}
