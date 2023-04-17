package 문자열;


public class 문자열다루기기본 {

	public static void main(String[] args) {
		String s = "a234";
		boolean answer = false;

		if (s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				answer = true;
			} catch (NumberFormatException e) {
				answer = false;
			}
		} else { 
			answer = false;
		}

		System.out.println(answer);
	}

}
