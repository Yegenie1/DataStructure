package 문자열;

public class 문자열처리방법 {

	public static void main(String[] args) {
		String s= "나는 프로그래머야";
		String s2= "진짜!!";
		System.out.println(s+s2);//스트링 결합
		System.out.println(s.concat(s2));//스트링 결합
		System.out.println(s.charAt(0));//문자 1글자 추출
		System.out.println(s.endsWith("야"));//특정한 문자로 끝나는지 확인
		System.out.println(s.substring(3));//인덱스3이후 글자를 모두 추출
		System.out.println(s.substring(3, 8));//인덱스 3~7까지 추출
		System.out.println(s.contains(s2));//s에 s2가 포함이 되어있는가
		System.out.println(s.lastIndexOf("프"));//s중"프"글자 위치
		System.out.println(s.toUpperCase());//대문자로
		System.out.println(s.toLowerCase());//소문자로
		System.out.println(s.length());//글자수
		System.out.println(s.replace("나", "너"));//글자 바꾸기
		

	}

}
