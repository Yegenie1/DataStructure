package 문자열;



public class 모음제거 {

	public static void main(String[] args) {
	
		String my_string = "abfdef";
		String[] vo = {"a", "e", "i", "o", "u"};
		
		for (int i = 0; i < vo.length; i++) {
			my_string = my_string.replace(vo[i], "");
		}
		String answer = my_string;
		//answer = my_string.replaceAll("[aeiou]", "");
		System.out.println(answer);
	}

}
