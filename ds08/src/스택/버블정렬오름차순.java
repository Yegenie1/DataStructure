package 스택;

import java.util.Arrays;

public class 버블정렬오름차순 {

	public static void main(String[] args) {
		int[] num = { 6, 4, 2, 1, 3, 5 };
		// System.out.println(Arrays.toString(num));
		int temp = 0;
		for (int i = num.length-1 ; i >=0; i--) {
			for (int j = 0; j <i; j++) {
				if (num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(num));
	}

}
