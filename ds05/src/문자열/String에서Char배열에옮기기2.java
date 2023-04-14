package 문자열;

public class String에서Char배열에옮기기2 {
	
	public static void main(String[] args) {
		String s = "s205621";//string도 index를 이용해서 추출가능
		char c = s.charAt(0);
		String answer = "개발부서가 아닙니다.";
		if (c=='s') {
			answer = "개발부서입니다.";
		}
		
		System.out.println(answer);
		
	}

}
