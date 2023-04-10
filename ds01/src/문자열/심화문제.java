package 문자열;

import java.util.Arrays;

public class 심화문제 {

	public static void main(String[] args) {
		String s5 = "[10,20,30,40,50]";
		String s5trim = s5.trim();

		String s51 = s5trim.replace("[", "");
		String s5re = s51.replace("]", "");

		String[] s5sp = s5re.split(",");

		int[] result = new int[s5sp.length];

		int sum = 0;

		for (int i = 0; i < s5sp.length; i++) {
			result[i] = Integer.parseInt(s5sp[i]);
			sum += result[i];
		}

		System.out.println(sum);

		Arrays.sort(result);
		for (int j = 0; j < result.length; j++) {
			System.out.println(result[j]);
		}

	}

}
