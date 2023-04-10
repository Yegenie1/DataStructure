package 배열;

import java.util.Arrays;
import java.util.Scanner;

public class 정리문제 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr= new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		
		int min = arr[0];
		
		System.out.println(min);
		
		sc.close();
		
		
	}

}
