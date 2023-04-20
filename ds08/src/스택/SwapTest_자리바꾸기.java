package 스택;

import java.util.Arrays;

public class SwapTest_자리바꾸기 {

	public static void main(String[] args) {
		int[] num = { 6, 1, 2, 3, 5, 9 };
		// System.out.println(Arrays.toString(num));
		print(num);
		swap(num, 0, 5);
		// int temp = num[5];
		// num[5] = num[0];
		// num[0] = temp;
		print(num);

	}

	public static void swap(int[] num, int x, int y) {
		System.out.println(num[x] + ", " + num[y]);
		int temp = num[y];
		num[y] = num[x];
		num[x] = temp;
		System.out.println(num[x] + ", " + num[y]);
	}

	public static void print(int[] num) {
		System.out.println(Arrays.toString(num));
	}

	// 오버로딩
	public static void print(String[] str) {
		System.out.println(Arrays.toString(str));
	}

}
