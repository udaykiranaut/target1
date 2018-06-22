package arrays1;

import java.util.Arrays;

public class Array_Sort {

	public static void main(String[] args) {
		int a1[] = { 23, 21, 34, 55, 66, 123, 3211, 988, 676 };
		Arrays.sort(a1);
		for (int i : a1) {
			System.out.print(i + " ");
		}
		String st1 = Arrays.toString(a1);
		System.out.print("\n" + st1);

	}

}
