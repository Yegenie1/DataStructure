package 문자열;


public class 문자열긴단어출력 {

	public static void main(String[] args) {
		String s = "i am a boy";
		String[] w = s.split(" ");
		int max = w[0].length();
		String maxString = w[0];
		for (int i = 0; i < w.length; i++) {
			if (w[i].length()>max) {
				max = w[i].length();
				maxString=w[i];
			}
		}
		System.out.println(maxString);
	
	}

}
