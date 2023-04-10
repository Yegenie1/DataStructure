package 배열;

import java.util.Random;

public class 정리문제2 {
	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=r.nextInt(900);
		}
		int max=arr[arr.length-1];
		System.out.println(max);
	}

}
