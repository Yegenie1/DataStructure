package 문자열;

public class 문자열뒤집기 {

	public static void main(String[] args) {
		String answer = "";
		String my_string = "hello";
		
		for (int i = 0; i < my_string.length(); i++) {
			answer+= my_string.charAt(my_string.length()-i-1);
		}
		
		System.out.println(answer);
	}

}
